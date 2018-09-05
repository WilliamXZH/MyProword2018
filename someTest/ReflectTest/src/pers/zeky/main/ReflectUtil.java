package pers.zeky.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Title ReflectUtil
 * @Description 反射工具类
 * @Author ZQian
 * @date: 2018/4/30 上午10:19
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
                //这里甚么都不要做！并且这里的异常必须这样写，不能抛出去。
                //如果这里的异常打印或者往外抛，则就不会执行clazz = clazz.getSuperclass(),最后就不会进入到父类中了
                LOG.warn(e.getMessage());
            }
        }

        return null;
    }

    /**
     * 直接调用对象方法, 而忽略修饰符(private, protected, default)
     * @param object : 子类对象
     * @param methodName : 父类中的方法名
     * @param parameterTypes : 父类中的方法参数类型
     * @param parameters : 父类中的方法参数
     * @return 父类中方法的执行结果
     */

    public static Object invokeMethod(Object object, String methodName, Class<?> [] parameterTypes,
            Object [] parameters)
            throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        //根据 对象、方法名和对应的方法参数 通过反射 调用上面的方法获取 Method 对象
        Method method = getDeclaredMethod(object, methodName, parameterTypes) ;
        if (method==null){
            throw new NoSuchMethodException(methodName);
        }
        //抑制Java对方法进行检查,主要是针对私有方法而言
        method.setAccessible(true) ;
        //调用object 的 method 所代表的方法，其方法的参数是 parameters
        return method.invoke(object, parameters) ;

    }


}
