package sist.com.model;

import javax.servlet.http.HttpServletRequest;

import sist.com.controller.RequestMapping;

// emp
public class MusicModel {
    
    @RequestMapping("music/list.do")
    public String music_main(HttpServletRequest request) {
        //DAO연결
        request.setAttribute("main_jsp", "../music/list.jsp");
        return "../main/main.jsp";
    }
}