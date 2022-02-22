package sist.com.model;

import javax.servlet.http.*;

import sist.com.controller.RequestMapping;

public class BoardModel {
    
    @RequestMapping("board/list.do")
    public String boardList(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("msg", "게시판 목록");
        return "../board/list.jsp";
    }

    @RequestMapping("board/detail.do")
    public String boardDetail(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("msg", "상세보기");
        return "../board/detail.jsp";
    }
}