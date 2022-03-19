package com.sist.main;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewsController {
    
    
    @GetMapping(value="etc/news/news_data.do", produces="text/plain;charset=utf-8")
    public String news_data(String fd) {
        String result="";
        
        return result;
    }
}