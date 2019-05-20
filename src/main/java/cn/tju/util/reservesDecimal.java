package cn.tju.util;
public class reservesDecimal {
    public static double getValue(double value,int number){
        return (double) Math.round(value * Math.pow(10,number)) / Math.pow(10,number);//保留几位数字
    }
}
