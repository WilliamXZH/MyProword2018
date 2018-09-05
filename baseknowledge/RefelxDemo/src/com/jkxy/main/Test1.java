package com.jkxy.main;

import com.jkxy.bean.Book;

public class Test1 {

    public static void main(String[] args) {
        Class demo1 = null;
        Class demo2 = null;
        Class demo3 = null;
        
        try {
            demo1 = Class.forName("com.jkxy.bean.Book");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(demo1);
        
        Book bo = new Book();
        Object ob = bo;
        System.out.println("第二种：" + ob.getClass());
        
        demo3 = Book.class;
        System.out.println("第三种：" + demo3);
        
        try {
            Book bo1 = (Book) demo3.newInstance();
            System.out.println("实例化后的对象：" +bo1);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
