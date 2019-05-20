package cn.tju.util;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Author: bijiaha0
 * Date: 2018-12-01
 * Time: 11:23 PM
 * Email: clickgwas@gmail.com
 */
public class DataStatisticsUtils {
    /**
     * 求和
     *
     * @param arr
     * @return
     */
    public static double getSum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * 求均值
     *
     * @param arr
     * @return
     */
    public static double getMean(double[] arr) {
        return getSum(arr) / arr.length;
    }

    /**
     * 求众数
     *
     * @param arr
     * @return
     */
    //public static double getMode(double[] arr) {
    //	Map<Double, Integer> map = new HashMap<Double, Integer>();
    //	for (int i = 0; i < arr.length; i++) {
    //		if (map.containsKey(arr[i])) {
    //			map.put(arr[i], map.get(arr[i]) + 1);
    //		} else {
    //			map.put(arr[i], 1);
    //		}
    //	}
    //	int maxCount = 0;
    //	double mode = -1;
    //	Iterator<Double> iter = map.keySet().iterator();
    //	while (iter.hasNext()) {
    //		double num = iter.next();
    //		int count = map.get(num);
    //		if (count > maxCount) {
    //			maxCount = count;
    //			mode = num;
    //		}
    //	}
    //	return mode;
    //}

    /**
     * 求中位数
     *
     * @param arr
     * @return
     */
    public static double getMedian(double[] arr) {
        double[] tempArr = arr;
        Arrays.sort(tempArr);
        if (tempArr.length % 2 == 0) {
            return (tempArr[tempArr.length >> 1] + tempArr[(tempArr.length >> 1) - 1]) / 2;
        } else {
            return tempArr[(tempArr.length >> 1)];
        }
    }

    public static void main(String arg[]){
        //double[] t2 = {2,5,19,22,23};
        //double[] t1 = {1336.79041,1376.2251,1051.70679,853.3479,493.29239,769.79547,1042.97144,891.72198,852.638,1037.37268,844.33063,1119.8916,788.7121,968.72241,1007.31561,858.66571,873.56012,777.54169,962.5,1204.39563,999.35071,956.54639,1094.04785,904.5824,1237.93005,928.34888,901.10309,1260.19885,1356.35437,1028.81042,779.67102,1017.96832,919.75311,822.67407,1156.02783,1011.47791,964.0531,790.12347,1340.59705,827.58618,837.84497,751.30292,988.85962,824.99231,1071.33459,1019.97998,992.26068,932.72083,998.48102,927.94043,1045.08203,920.30847,901.4353,992.35339,1025.73535,1133.6499,851.81519,972.56342,1235.10535,846.56079,1059.93689,967.57349,770.86572,1058.31726,1145.67065,920.55829,870.54413,843.61792,1423.1853,687.38251,706.58521,883.58209};
        //double p =getMedian(t2);
        //System.out.print(p);

        System.out.print(divDouble(8.8888,2.0,4));
    }


    public static Double divDouble(Double v1,Double v2,int scale){
        if(scale<0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 求中列数
     *
     * @param arr
     * @return
     */
    public static double getMidrange(double[] arr) {
        double max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (min + max) / 2;
    }

    /**
     * 求四分位数
     *
     * @param arr
     * @return 存放三个四分位数的数组
     */
    //public static double[] getQuartiles(double[] arr) {
    //	double[] tempArr = {10.00,2.9,7.8,19.2};
    //	Arrays.sort(tempArr);
    //	double[] quartiles = new double[3];
    //	// 第二四分位数（中位数）
    //	quartiles[1] = getMedian(tempArr);
    //	// 求另外两个四分位数
    //	if (tempArr.length % 2 == 0) {
    //		quartiles[0] = getMedian(copyOfRange(tempArr, 0, tempArr.length / 2));
    //		quartiles[2] = getMedian(copyOfRange(tempArr, tempArr.length / 2, tempArr.length));
    //	} else {
    //		quartiles[0] = getMedian(copyOfRange(tempArr, 0, tempArr.length / 2));
    //		quartiles[2] = getMedian(copyOfRange(tempArr, tempArr.length / 2 + 1, tempArr.length));
    //	}
    //	return quartiles;
    //}

    /**
     * 求极差
     *
     * @param arr
     * @return
     */
    public static double getRange(double[] arr) {
        double max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

    /**
     * 求四分位数极差
     *
     * @param arr
     * @return
     */
    //public static double getQuartilesRange(double[] arr) {
    //	return getRange(getQuartiles(arr));
    //}

    /**
     * 求截断均值
     *
     * @param arr 求值数组
     * @param p   截断量p，例如p的值为20，则截断20%（高10%，低10%）
     * @return
     */
    //public static double getTrimmedMean(double[] arr, int p) {
    //	int tmp = arr.length * p / 100;
    //	double[] tempArr = copyOfRange(arr, tmp, arr.length + 1 - tmp);
    //	return getMean(tempArr);
    //}

    /**
     * 求方差
     *
     * @param arr
     * @return
     */
    public static double getVariance(double[] arr) {
        double variance = 0;
        double sum = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sum2 += arr[i] * arr[i];
        }
        variance = sum2 / arr.length - (sum / arr.length) * (sum / arr.length);
        return variance;
    }

    /**
     * 求绝对平均偏差(AAD)
     *
     * @param arr
     * @return
     */
    public static double getAbsoluteAverageDeviation(double[] arr) {
        double sum = 0;
        double mean = getMean(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[i] - mean);
        }
        return sum / arr.length;
    }

    /**
     * 求中位数绝对偏差(MAD)
     *
     * @param arr
     * @return
     */
    public static double getMedianAbsoluteDeviation(double[] arr) {
        double[] tempArr = new double[arr.length];
        double median = getMedian(arr);
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = Math.abs(arr[i] - median);
        }
        return getMedian(tempArr);
    }

    /**
     * 求标准差
     * @param arr
     * @return
     */
    public static double getStandardDevition(double[] arr) {
        double sum = 0;
        double mean = getMean(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += Math.sqrt((arr[i] - mean) * (arr[i] - mean));
        }
        return (sum / (arr.length - 1));
    }


}
