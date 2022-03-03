package sist.com.model;

import javax.servlet.http.*;

import sist.com.controller.RequestMapping;

public class ChatModel {
    
    @RequestMapping("chat/chat.do")
    public String chat_chat(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("main_jsp", "../chat/chat.jsp");
        return "../main/main.jsp";
    }
}