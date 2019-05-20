package cn.tju.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Author: bijiaha0
 * Date: 2018-11-22
 * Time: 7:37 PM
 * Email: clickgwas@gmail.com
 */
public class ClassInstanceFactory {
    private ClassInstanceFactory() {}
    public static <T> T create(Class<?> clazz, String value){
        try{
            Object obj = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.setValue(obj,value);
            return (T)obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> cls = Class.forName("cn.tju.pojo.AccCNew");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Field[] declaredFields = cls.getDeclaredFields();
        for(Field fil : declaredFields){
            System.out.println(fil.getType());
        }
    }
}
