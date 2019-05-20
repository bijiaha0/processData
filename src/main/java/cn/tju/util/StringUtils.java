package cn.tju.util;

/**
 * Author: bijiaha0
 * Date: 2018-11-22
 * Time: 7:46 PM
 * Email: clickgwas@gmail.com
 */
public class StringUtils {
    public static String initcap(String str){
        if(str ==null||"".equals(str)){
            return str;
        }
        if(str.length() == 1){
            return str.toUpperCase();
        }else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }

    }
}
