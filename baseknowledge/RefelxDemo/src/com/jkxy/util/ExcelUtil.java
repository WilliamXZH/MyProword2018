package com.jkxy.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

import com.jkxy.bean.Book;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelUtil {

    //如果有一个项目图书馆管理系统要求你实现
    //图书信息导入导出 用户信息导入导出 借阅信息导入导出
    //维护信息导入导出 管理员信息导入导出
    
    public static void excelOut(ArrayList ar, String str){
        WritableWorkbook book = null;
        
        try {
            book = Workbook.createWorkbook(new File(str));
            WritableSheet sheet = book.createSheet("sheet", 0);
            for(int i=0;i<ar.size();i++){
                Object ob = ar.get(i);
                Class cl = ob.getClass();
                Field[] fi = cl.getDeclaredFields();
                for(int j=0;j<fi.length;j++){
                    fi[j].setAccessible(true);
                    Label la = new Label(j,i,String.valueOf( fi[j].get(ob)));
                    sheet.addCell(la);
                }
            }
            book.write();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RowsExceededException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (WriteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                book.close();
            } catch (WriteException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        
    }
    
    public static ArrayList excelIn(Class cl,String str){
        ArrayList ar = new ArrayList();
        
        Workbook book  = null;
        try {
            book = Workbook.getWorkbook(new File(str));
            Sheet sheet = book.getSheet(0);
            Field[] fi = cl.getDeclaredFields();
            for(int i=0;i<sheet.getRows();i++){
                Object ob  = cl.newInstance();//创建实例化对象
                for(int j=0;j<fi.length;j++){
                    fi[j].setAccessible(true);
                    String con = sheet.getCell(j,i).getContents();
                    if(fi[j].getType().toString().equals("class java.lang.String")){
                        fi[j].set(ob, con);
                    }else if(fi[j].getType().toString().equals("int")){
                        fi[j].setInt(ob, Integer.valueOf(con));
                    }else if(fi[j].getType().toString().equals("class java.lang.Integer")){
                        fi[j].setInt(ob, Integer.valueOf(con));
                    }
                }
                ar.add(ob);
            }
            
        } catch (BiffException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            book.close();
        }
        
        return ar;
    }
    
    
    public static void main(String[] args) {
/*        ArrayList<Book> ar = new ArrayList<Book>();
        Book bo = new Book();
        bo.setId(1);
        
        bo.setName("月子");
        bo.setType("生活");
        Book bo1 = new Book();
        bo1.setId(2);
        bo1.setName("日子");
        bo1.setType("生活");
        ar.add(bo);
        ar.add(bo1);
        
        ExcelUtil.excelOut(ar, "d:/bookx.xls");*/
        
        ArrayList<Book> ar2 = ExcelUtil.excelIn(Book.class, "d:/bookx.xls");
        for(Book bk:ar2){
            System.out.println(bk.getName()+":"+bk.getType());
        }
    }
    
}
