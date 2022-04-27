package com.sist.web;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 *    Annotation
 *    1. 메모리 할당
 *       클래스 위에 설정
 *       @Controller : Mode(MVC) → 요청 처리 (파일 처리 → 화면 이동)
 *       @Repository : 저장소 (데이터베이스 → DAO)
 *       @Component : 일반 클래스
 *       @Service : DAO 여러개를 묶어서 한번에 처리 (BI)
 *       @ControllerAdivce : 통합 예외처리
 *       @RestController : Model(MVC) → 요청 처리 (데이터만 전송)
 *                         JavaScript와 관련 (Ajax,VueJS,ReactJS)
 *       -------------------
 *       스프링 : 요청 받기, 결과가 보내주기, JSP 찾기, 클래스 관련
 *              → 요청 받기, 결과가 보내주기, 클래스 관련 (서버 측)
 *    2. DI
 *       @Autowired : 자동 주입
 *       @Resource : 특정 객체 지정 (1.8까지만 지원) → 14
 *                               -----
 *       @Resource(name="id명")
 *    3. 클래스의 종류
 *       @Aspect : 메모리 할당이 불가능
 */

import java.util.*;
import com.sist.service.*;
import com.sist.vo.*;

@Controller
public class LocationController {

    @Autowired
    private LocationService dao;

    // 요청 처리
    @GetMapping("location/list.do")
    public String location_list(String page, Model model) {
        if (page == null)
            page = "1";
        int curpage = Integer.parseInt(page);
        Map map = new HashedMap();
        int rowSize = 12;
        int start = (rowSize * curpage) - (rowSize - 1);
        int end = rowSize * curpage;
        map.put("start", start);
        map.put("end", end);
        List<LocationVO> list = dao.locationListData(map);
        int totalpage = dao.locationTotalPage();

        // JSP에서 필요한 데이터를 전송 
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", totalpage);
        model.addAttribute("list", list);
        return "location/list";
    }

    @GetMapping("location/detail.do")
    public String location_detail(int no, Model model) {
        LocationVO vo = dao.locationDetailData(no);
        model.addAttribute("vo", vo);
        return "location/detail";
    }

    @GetMapping("nature/list.do")
    public String nature_list(String page, Model model) {
        if (page == null)
            page = "1";
        int curpage = Integer.parseInt(page);
        Map map = new HashedMap();
        int rowSize = 12;
        int start = (rowSize * curpage) - (rowSize - 1);
        int end = rowSize * curpage;
        map.put("start", start);
        map.put("end", end);
        List<NatureVO> list = dao.natureListData(map);
        int totalpage = dao.natureTotalPage();

        // JSP에서 필요한 데이터를 전송 
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", totalpage);
        model.addAttribute("list", list);
        return "nature/list";
    }

    @GetMapping("nature/detail.do")
    public String nature_detail(int no, Model model) {
        NatureVO vo = dao.natureDetailData(no);
        model.addAttribute("vo", vo);
        return "nature/detail";
    }
}
