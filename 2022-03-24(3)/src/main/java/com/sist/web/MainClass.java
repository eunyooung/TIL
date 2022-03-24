package com.sist.web;

import com.sist.dao.*;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        StudentDAO dao = new StudentDAO();
        //dao.studentInsert();
        dao.txInsert();
    }
}