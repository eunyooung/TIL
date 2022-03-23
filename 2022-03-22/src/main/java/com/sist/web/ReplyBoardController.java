package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
/*
    vo : 데이터를 모아서 관리 (크롤링, 데이테베이스 연결) 
    dao : 오라클 연결 → sql문장 전송 → 결과값 
    mapper : SQL문장을 저장해서 → 자동 구현 
    controller : 사용자 요청을 받아서 처리 → 결과값 전송 
    클래스마다 역할 분담 (종류가 설정)
 */
import java.util.*;
import com.sist.dao.*;
import com.sist.vo.*;

@Controller // 사용자 요청을 받아서 처리 → 결과값을 전송 (모아서 전송 → VO : record 단위) 
public class ReplyBoardController {
    
    // 스프링에서 모든 클래스 → 필요한 객체를 스프링으로부터 얻어 온다 
    // Controller → DAO, Manager를 받아서 처리 
    @Autowired
    private ReplyBoardDAO dao; // 전역변수 → 클래스 전체에서 사용이 가능 

    // 사용자 요청을 받기 시작 → 요청에 따라 기능별 분리 → @RequestMapping, @GetMapping, @PostMapping
    // 어노테이션 → 기본 (if) → 구분자 (인덱스) → 찾기 
    // HandlerMapping → 어노테이션을 찾아서 밑에는 메소드를 호출 
    // 스프링은 어노테이션만 있으면 → 메소드명은 어떤것이든 상관없다 
    @GetMapping("board/list.do")
    /*
        http://localhost:8080 /web/board/list.do
        --------------------- ------------------- uri
                              ----- contextPath
        String uri = request.getRequestURI();
        uri = uri.substring(request.getContextPath().length() + 1)
        if(uri.equals("board/list.do")) → @GetMapping   
    */
    public String board_list(String page, Model model) {
        // Model → 전달자 (request) → 필요시마다 사용 (JSP로 전송하는 값이 있는 경우)
        // VueJS (JSTL/EL) → JSON (jacson-bind) → simple-json
        // 1. 페이지 확인 
        if (page == null)
            page = "1"; // 디폴트 페이지 (사용자가 처음에 페이지를 지정 할 수 없다)
        
        // 모든 데이터는 String으로 받아 볼 수 있다 → 필요시에는 데이터형 변환
        int curpage = Integer.parseInt(page);
        
        int rowSize = 10;
        
        int start = (rowSize * curpage) - (rowSize - 1);
        int end = rowSize * curpage;
        
        Map map = new HashMap();
        map.put("start", start);
        map.put("end", end);
        
        // WHERE num BETWEEN #{start} AND #{end}
        // 실제 데이터 DAO로부터 얻어 오기
        List<ReplyBoardVO> list = dao.replyBoardListData(map);
        
        // 총페이지 읽기
        int totalpage = dao.replyBoardTotalPage();
        
        // 전체 갯수 읽기
        int count = dao.replyBoardCount();
        count = count - ((rowSize * curpage) - rowSize);
        
        // 오늘 날짜 전송 (new)
        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        model.addAttribute("list", list);
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", totalpage);
        model.addAttribute("count", count);
        model.addAttribute("today", today);

        return "board/list"; // /board/list.jsp → ViewResolver
    }

    @GetMapping("board/insert.do") // <a> <form> → POST
    public String board_insert() {
        return "board/insert"; // 화면만 보여준다 
    }

    @PostMapping("board/insert_ok.do")
    public String board_insert_ok(ReplyBoardVO vo) {
        // vo단위로 값을 받는다 → 커맨드 객체 (vo, [], list)
        dao.replyBoardInsert(vo);
        return "redirect:list.do";
    }

    // Spring → MyBatis
    @GetMapping("board/detail.do")
    public String board_detail(int no, Model model) {
        // 처리 
        ReplyBoardVO vo = dao.replyBoardDetailData(no);
        // 결과값 전송 
        model.addAttribute("vo", vo);
        return "board/detail";
    }

    @GetMapping("board/update.do")
    public String board_update(int no, Model model) {
        // 데이터베이스 연결 (DAO) → 데이터 읽기
        ReplyBoardVO vo = dao.replyBoardUpdateData(no);
        // 전송 (update.jsp)
        model.addAttribute("vo", vo);
        return "board/update";
    }

    // detail.jsp → @Controller(no) → reply.jsp
    @GetMapping("board/reply.do")
    public String board_reply(int no, Model model) {
        model.addAttribute("no", no);
        return "board/reply";
    }
}