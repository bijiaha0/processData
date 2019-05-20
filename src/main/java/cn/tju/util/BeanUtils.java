package cn.tju.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * Author: bijiaha0
 * Date: 2018-11-22
 * Time: 7:41 PM
 * Email: clickgwas@gmail.com
 */
public class BeanUtils {
    private BeanUtils(){}
    //给属性设置值
    public static void setValue(Object obj,String value){
        String[] resultes = value.split("\\|");
        for(int x = 0; x < resultes.length; x++){
            String[] attval = resultes[x].split(":");
            try{
                Field field = obj.getClass().getDeclaredField(attval[0]);
                Method setMethod = obj.getClass().getDeclaredMethod("set" + StringUtils.initcap(attval[0]), field.getType());
                Object convertValue = BeanUtils.convertAttributeValue(field.getType().getSimpleName(), attval[1]);
                setMethod.invoke(obj,convertValue);

            }catch (Exception e){
            }
        }
    }

    private static Object convertAttributeValue(String type,String value){
        if("Integer".equalsIgnoreCase(type)){
            return Integer.valueOf(value);
        }else if("Double".equalsIgnoreCase(type)){
            return Double.valueOf(value);
        }
        return value;
    }
}
