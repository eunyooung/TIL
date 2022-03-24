package com.sist.dao;

import java.util.ArrayList;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class MyDAO {
    
    public List<String> sawonNameData() {
        List<String> list = new ArrayList<String>();
        list.add("홍길동");
        list.add("심청이");
        list.add("박문수");
        return list;
    }
}