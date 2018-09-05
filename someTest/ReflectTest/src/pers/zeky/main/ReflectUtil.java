package pers.zeky.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Title ReflectUtil
 * @Description ���乤����
 * @Author ZQian
 * @date: 2018/4/30 ����10:19
 */
public class ReflectUtil {

    private static Logger LOG= LoggerFactory.getLogger(ReflectUtil.class);

    public static Method getDeclaredMethod(Object object, String methodName, Class<?> ... parameterTypes){
        Method method;

        for(Class<?> clazz = object.getClass() ; clazz != Object.class ; clazz = clazz.getSuperclass()) {
            try {
                method = clazz.getDeclaredMethod(methodName, parameterTypes) ;
                return method ;
            } catch (Exception e) {
                //������ô����Ҫ��������������쳣��������д�������׳�ȥ��
                //���������쳣��ӡ���������ף���Ͳ���ִ��clazz = clazz.getSuperclass(),���Ͳ�����뵽��������
                LOG.warn(e.getMessage());
            }
        }

        return null;
    }

    /**
     * ֱ�ӵ��ö��󷽷�, ���������η�(private, protected, default)
     * @param object : �������
     * @param methodName : �����еķ�����
     * @param parameterTypes : �����еķ�����������
     * @param parameters : �����еķ�������
     * @return �����з�����ִ�н��
     */

    public static Object invokeMethod(Object object, String methodName, Class<?> [] parameterTypes,
            Object [] parameters)
            throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        //���� ���󡢷������Ͷ�Ӧ�ķ������� ͨ������ ��������ķ�����ȡ Method ����
        Method method = getDeclaredMethod(object, methodName, parameterTypes) ;
        if (method==null){
            throw new NoSuchMethodException(methodName);
        }
        //����Java�Է������м��,��Ҫ�����˽�з�������
        method.setAccessible(true) ;
        //����object �� method ������ķ������䷽���Ĳ����� parameters
        return method.invoke(object, parameters) ;

    }


}
