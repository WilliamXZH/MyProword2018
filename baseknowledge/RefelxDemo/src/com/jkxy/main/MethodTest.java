package com.jkxy.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.jkxy.bean.Book;

public class MethodTest {

    /**
     * 该方法用于获取对象的所有方法名称、返回值类型以及参数信息
     */
    public static void show(Object ob){
        Class cl = ob.getClass();
        Method[] me = cl.getDeclaredMethods();
        for(Method mm:me){
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println("方法名称：" + mm.getName());
            System.out.println("方法修饰符：" + Modifier.toString(mm.getModifiers()));
            System.out.println("方法返回值类型：" + mm.getReturnType());
            
            Class[] preType = mm.getParameterTypes();
            System.out.println("方法参数列表");
            for(Class cll:preType){
                System.out.println(cll.getName());
            }
        }
    }
    
    //该方法用于使用传递过来的实体对象获取其中的方法
    public static void showUse(Object ob){
        Class cl = ob.getClass();
        try {
            Method me = cl.getMethod("getName", null);
            me.invoke(ob, new Object[0]);
            Method me1 = cl.getMethod("setName", String.class);
            me1.invoke(ob, "西游记");
            
            Class []cll = {String.class,int.class};
            Method me2 = cl.getMethod("test",cll);
            Object[] obb = {"哈哈",12};
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
        bo.setName("我和凤姐同居的日子");
        bo.setType("惊悚");
        //MethodTest.show(bo);
        MethodTest.showUse(bo);
        System.out.println(bo.getName());
    }
    
}
