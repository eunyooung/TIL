package com.sist.spring2;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Hello h = new HelloImple();
        String msg = h.sayHello("심청이");
        System.out.println(msg);
    }
}