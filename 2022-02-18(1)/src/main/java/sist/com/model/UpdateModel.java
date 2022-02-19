package sist.com.model;

import javax.servlet.http.HttpServletRequest;

public class UpdateModel {
    
    public void handlerRequest(HttpServletRequest request) {
        request.setAttribute("msg", "게시판 수정");
    }
}
