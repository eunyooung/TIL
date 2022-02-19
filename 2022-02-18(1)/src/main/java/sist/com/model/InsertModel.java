package sist.com.model;

import javax.servlet.http.HttpServletRequest;

public class InsertModel {
    
    public void handlerRequest(HttpServletRequest request) {
        request.setAttribute("msg", "게시판 글쓰기");
    }
}