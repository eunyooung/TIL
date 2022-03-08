package com.sist.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // 1. XML 파싱
        ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
        EmpDAO dao = (EmpDAO) app.getBean("dao");
        List<EmpVO> list = dao.empListData();
        // 출력
        for (EmpVO vo : list) {
            System.out.println(vo.getEmpno() + " " + vo.getEname() + " " + vo.getJob() + " "
                    + vo.getHiredate().toString() + " " + vo.getSal());
        }
    }
}