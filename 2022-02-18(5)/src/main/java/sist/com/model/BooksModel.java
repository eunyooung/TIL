package sist.com.model;

import javax.servlet.http.HttpServletRequest;

import java.util.*;

import sist.com.controller.RequestMapping;
import sist.com.dao.*;
import sist.com.vo.*;

public class BooksModel {
    
    @RequestMapping("book/list.do")
    public String books_main(HttpServletRequest request) {

        BooksDAO dao = new BooksDAO();
        List<BooksVO> list = dao.booksListData(1);
        request.setAttribute("list", list);
        request.setAttribute("main_jsp", "../book/list.jsp");
        //include
        return "../main/main.jsp";
    }
}