package sist.com.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sist.com.controller.RequestMapping;

public class MovieModel {
    
    @RequestMapping("main/movie.do")
    public String main_main(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("msg", "Movie Page");
        return "../main/movie.jsp";
    }
}
