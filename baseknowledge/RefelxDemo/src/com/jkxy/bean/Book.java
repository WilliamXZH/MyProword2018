package com.jkxy.bean;

public class Book {

    private int id;
    private String name;
    private String type;
    public int a;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        //System.out.println("����getName()����");
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public void test(String name, int a){
        System.out.println("�����˶�����ķ���....");
    }
    
    
}
