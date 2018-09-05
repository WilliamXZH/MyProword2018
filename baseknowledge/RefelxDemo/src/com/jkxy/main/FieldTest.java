package com.jkxy.main;

import java.lang.reflect.Field;

import com.jkxy.bean.Book;

public class FieldTest {
    
    //�÷�������ʹ�ô��ݹ�����Class�����ȡ���е�����
    public void show (Class cl){
        Field[] fi = cl.getDeclaredFields();//���Խ�˽�����Ի�ȡ��
        
        for (Field field : fi) {
            System.out.println(field.getName());
            System.out.println(field.getType());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~`");
        
        Field[] fi1 = cl.getFields();//ֻ���Ի�ȡ����������
        for(Field ff: fi1){
            System.out.println(ff.getName());
            System.out.println(ff.getType());
        }
        
    }
    
    //�÷�������ʹ�ô��ݹ�����ʵ������� ��ȡ���� �Լ����Ե�ֵ
    public void show(Object obj){
        Class cl = obj.getClass();
        Field[] fi = cl.getDeclaredFields();
        
        try {
            for (Field field : fi) {
                field.setAccessible(true);
                System.out.println(field.getName()+"ֵ"+field.get(obj));
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
        bo.setName("���Ʋ��");
        bo.setType("����");
        
        FieldTest ft = new FieldTest();
        //ft.show(Book.class);
        
        ft.show(bo);
        
    }
    
}
