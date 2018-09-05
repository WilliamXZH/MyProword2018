package com.jkxy.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.jkxy.bean.Book;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelBook {

    public void excelOut(ArrayList<Book> ar){
        WritableWorkbook book = null;//Ecel����
        
        try {
            //����excel����
            book = Workbook.createWorkbook(new File("d:/book.xls"));
            //ͨ��excel���󴴽�һ��ѡ�
            WritableSheet sheet = book.createSheet("sheet1", 0);
            
            for(int i=0;i<ar.size();i++){
                Book bo = ar.get(i);
                Label la1 = new Label(0,i,String.valueOf(bo.getId()));
                Label la2 = new Label(1,i,String.valueOf(bo.getName()));
                Label la3 = new Label(2,i,String.valueOf(bo.getType()));
                sheet.addCell(la1);
                sheet.addCell(la2);
                sheet.addCell(la3);
            }
            //����һ����Ԫ���������ֵ
            //abel la = new Label(0,2,"test");
            //�������õĵ�Ԫ��������ѡ���
            //sheet.addCell(la);
            
            //д��Ŀ��·��
            book.write();
            
        } catch (IOException e) {
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
    
    
    public ArrayList<Book> excelIn(){
        
        ArrayList<Book> ar = new ArrayList<Book>();
        Workbook book = null;
        
        try {
            book = Workbook.getWorkbook(new File("d:/book.xls"));
            Sheet sheet = book.getSheet(0);
            for(int i=0;i<sheet.getRows();i++){
                Book bo = new Book();
                Cell cell = sheet.getCell(0,i);
                bo.setId(Integer.valueOf(cell.getContents()));
                bo.setName(sheet.getCell(1,i).getContents());
                bo.setType(sheet.getCell(2,0).getContents());
                ar.add(bo);
            }
        } catch (BiffException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            book.close();
        }
        
        return ar;
        
    }
    
    public static void main(String[] args) {
        ExcelBook eb = new ExcelBook();
        ArrayList<Book> ar = new ArrayList<Book>();
        
//        Book bo = new Book();
//        bo.setId(1);
//        bo.setName("����");
//        bo.setType("����");
//        
//        Book bo1 = new Book();
//        bo1.setId(2);
//        bo1.setName("����");
//        bo1.setType("����");
//        
//        ar.add(bo);
//        ar.add(bo1);
//        eb.excelOut(ar);
        
        ArrayList<Book> ar1 = eb.excelIn();
        
        for(Book bo2:ar1){
            System.out.println(bo2.getName()+bo2.getType());
        }
        
    }
}
