package com.sist.main;

import java.io.*;
import java.util.*;

import javax.xml.parsers.*;

public class ApplicationContext {
    
    private Map map = new HashMap();

    public static void main(String[] args) {
        ApplicationContext app = new ApplicationContext("C:\\springDev\\spingStudy\\2022-03-16(3)\\src\\main\\java\\com\\sist\\main\\app.xml");
        Sawon sa = (Sawon) app.getBean("sa");
        System.out.println(sa.getName());
        System.out.println(sa.getSex());
    }

    public ApplicationContext(String path) {
        try {
            SAXParserFactory spf = SAXParserFactory.newDefaultInstance();
            SAXParser sp = spf.newSAXParser();
            HandlerMapping hm = new HandlerMapping();
            sp.parse(new File(path), hm);
            map = hm.getClsMap();
        } catch (Exception ex) {
        }
    }

    public Object getBean(String id) {
        return map.get(id);
    }
}