package com.sist.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import com.sist.dao.*;
import com.sist.vo.*;

/*
    Autowired : 스프링에 의한 자동 주입
    ANNOTATION_TYPE,
    CONSTRUCTOR,
    FIELD,
    METHOD,
    PARAMETER
    
    public class ClsName {
        
        @Autowired : FIELD
        private BoardDAO dao;
        
        @Autowired : CONSTRUCTOR
        public ClsName(BoardDAO dao) {
            // 어노테이션은 지역변수에서는 사용이 불가능
            this.dao = dao;
        }
        
        @Autowired : METHOD
        public void setBoardDAO(BoardDAO dao) {
        
        }
        
        public void display(@Autowired BoardDAO dao) {
                            ----------
                             PARAMETER
        }
    }
    
    Controller
    TYPE : 클래스 위에만 사용 가능 (클래스 구분)
    
    GetMapping
    METHOD : 메소드 위에만 사용이 가능 (메소드 구분)
 */
@Controller
public class HotelController {

    // DAO, Manager
    @Autowired
    private HotelDAO dao; // 멤버 → 모든 메소드에서 사용

    @GetMapping("seoul/hotel/list.do")
    public String seoul_hotel_list(String page, Model model) {

        // request, response는 거의 사용하지 않기 떄문에 매개변수로 요청값을 받아온다
        /*
            request → Cookie
            response → 다운로드
            매개변수로 받을 수 있는 클래스
            -----------------------
             서블릿이 가지고 있는 내장객체 : 9가지
             → HttpServeletRequest, HttpServeletResponse
               HttpSession
               list(HttpServletRequest request, HttpSession session)
             → 사용자가 요청한 데이터
               list(String ss) → getParameter()
               list(String[] ss) → getParameterValues()
               list(List<String> list)
                  → ?list[0].name=""&list[2]=""
                  → [ (%5B) ] (%5D)
                    list%5B0%5D -→ bad request
         */
        // Spring에서 지원하는 데이터 전달객체를 이용해서 JSP로 전송 : Model
        // DB 연동

        if (page == null)
            page = "1";

        int curpage = Integer.parseInt(page); // 현재 페이지

        int rowSize = 20;
        int start = (rowSize * curpage) - (rowSize - 1); // 1~20, 21~40
        int end = rowSize * curpage;
        Map map = new HashMap();
        map.put("start", start);
        map.put("end", end);

        List<HotelVO> list = dao.hotelListData(map);
        for (HotelVO vo : list) {
            String name = vo.getName();
            if (name.length() > 12) {
                name = name.substring(0, 12) + "...";
            }
            vo.setName(name);
        }
        // WHERE num BETWEEN #{start} AND #{end}
        // 1page                 1           20
        // 1page                 21          40
        // 총 페이지 구하기
        int totalpage = dao.hotelTotalPage();

        // 블록별 처리
        final int BLOCK = 5;
        int startPage = ((curpage - 1) / BLOCK * BLOCK) + 1;
        //       (5 - 1) / 5 * 5 → 0   4 /5
        //       (6 - 1) / 5 * 5 → 5 + 1 → 6
        //       (10 - 1) / 5 * 5 → 5 + 1 → 6 
        // curpage → 1~5 → startPage = 1
        // [1][2][3][4][5]
        // curpage → 6~10 → startPage = 6
        // [6][7][8][9][10]
        int endPage = ((curpage - 1) / BLOCK * BLOCK) + BLOCK;

        if (endPage > totalpage) {
            endPage = totalpage;
        }

        // JSP에서 출력하는 데이터를 전송
        model.addAttribute("list", list);
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", totalpage);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("main_jsp", "../seoul/hotel/list.jsp");
        //                    출력
        return "main/main"; // 출력된 list.jsp → include
    }
}