package com.jkxy.main;

import java.lang.reflect.Field;

import com.jkxy.bean.Book;

public class FieldTest {
    
    //该方法用于使用传递过来的Class对象获取类中的属性
    public void show (Class cl){
        Field[] fi = cl.getDeclaredFields();//可以将私有属性获取到
        
        for (Field field : fi) {
            System.out.println(field.getName());
            System.out.println(field.getType());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~`");
        
        Field[] fi1 = cl.getFields();//只可以获取到公有属性
        for(Field ff: fi1){
            System.out.println(ff.getName());
            System.out.println(ff.getType());
        }
        
    }
    
    //该方法用于使用传递过来的实体类对象 获取属性 以及属性的值
    public void show(Object obj){
        Class cl = obj.getClass();
        Field[] fi = cl.getDeclaredFields();
        
        try {
            for (Field field : fi) {
                field.setAccessible(true);
                System.out.println(field.getName()+"值"+field.get(obj));
            }
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Book bo = new Book();
        bo.setId(1);
        bo.setName("斗破苍穹");
        bo.setType("玄幻");
        
        FieldTest ft = new FieldTest();
        //ft.show(Book.class);
        
        ft.show(bo);
        
    }
    
}
