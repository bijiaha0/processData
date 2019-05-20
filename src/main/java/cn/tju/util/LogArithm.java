package cn.tju.util;

/**
 * Author: bijiaha0
 * Date: 2018-11-22
 * Time: 10:44 PM
 * Email: clickgwas@gmail.com
 */
public class LogArithm {
    static public double log(double value, double base) {
        return Math.log(value) / Math.log(base);
    }

    public static void main(String[] args) {
        double log = log(1, 2);
        System.out.println(log);
    }
}
