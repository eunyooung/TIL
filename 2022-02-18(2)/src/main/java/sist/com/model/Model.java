package sist.com.model;

import javax.servlet.http.HttpServletRequest;

public interface Model {
    
    public String handlerRequest(HttpServletRequest request);
}