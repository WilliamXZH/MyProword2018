package com.jkxy.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.jkxy.bean.Book;

public class MethodTest {

    /**
     * �÷������ڻ�ȡ��������з������ơ�����ֵ�����Լ�������Ϣ
     */
    public static void show(Object ob){
        Class cl = ob.getClass();
        Method[] me = cl.getDeclaredMethods();
        for(Method mm:me){
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println("�������ƣ�" + mm.getName());
            System.out.println("�������η���" + Modifier.toString(mm.getModifiers()));
            System.out.println("��������ֵ���ͣ�" + mm.getReturnType());
            
            Class[] preType = mm.getParameterTypes();
            System.out.println("���������б�");
            for(Class cll:preType){
                System.out.println(cll.getName());
            }
        }
    }
    
    //�÷�������ʹ�ô��ݹ�����ʵ������ȡ���еķ���
    public static void showUse(Object ob){
        Class cl = ob.getClass();
        try {
            Method me = cl.getMethod("getName", null);
            me.invoke(ob, new Object[0]);
            Method me1 = cl.getMethod("setName", String.class);
            me1.invoke(ob, "���μ�");
            
            Class []cll = {String.class,int.class};
            Method me2 = cl.getMethod("test",cll);
            Object[] obb = {"����",12};
            me2.invoke(ob, obb);
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Book bo = new Book();
        bo.setId(1);
        bo.setName("�Һͷ��ͬ�ӵ�����");
        bo.setType("���");
        //MethodTest.show(bo);
        MethodTest.showUse(bo);
        System.out.println(bo.getName());
    }
    
}
