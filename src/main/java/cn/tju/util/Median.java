package cn.tju.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
//求中位数
public class Median {
    //大根堆比较器

    public static class MaxHeapComp implements Comparator<Double> {
        @Override
        public int compare(Double o1, Double o2) {
            //返回负数的时候，认为第一个参数应该放在上面
            //返回正数的时候，认为第二个参数应该放在上面
            //返回0，谁放上面无所谓
            //if (o1 > o2){
            //    return -1;
            //}else if (o1 < o2){
            //    return 1;
            //}else {
            //    return 0;
            //}
            return (int)(o2-o1);
        }
    }
    //小根堆比较器
    public static class MinHeapComp implements Comparator<Double>{
        @Override
        public int compare(Double o1, Double o2) {
            return (int)(o1-o2);
        }
    }
    public static class Box{
        private PriorityQueue<Double> maxHeap;
        private PriorityQueue<Double> minHeap;

        public Box(PriorityQueue<Double> maxHeap, PriorityQueue<Double> minHeap) {
            this.maxHeap = maxHeap;
            this.minHeap = minHeap;
        }
        private void modifyTwoHeaps(){
            //如果大根堆的个数大于小跟堆的个数+1
            if(maxHeap.size() > minHeap.size()+1){
                minHeap.add(maxHeap.poll());
            }
            //如果小跟堆的个数大于大根堆的个数+1
            if(minHeap.size() > maxHeap.size()+1){
                maxHeap.add(minHeap.poll());
            }
        }
        public void add(double newNum){
            if(maxHeap.isEmpty()){
                maxHeap.add(newNum);
            }else {
                if(newNum < maxHeap.peek()){
                    maxHeap.add(newNum);
                }else {
                    minHeap.add(newNum);
                }
            }
            modifyTwoHeaps();;
        }
        public double mid(){
            if(maxHeap.size() !=minHeap.size()){
                return maxHeap.size() > minHeap.size() ? maxHeap.peek():minHeap.peek();
            }
            return   (maxHeap.peek()+minHeap.peek())/2;
        }
    }


    public static double productMedian(double[] value){
        Arrays.sort(value);
        double median;
        if (value.length % 2 == 0)
            median = (value[value.length/2] + value[value.length/2 - 1])/2;
        else
            median = value[value.length/2];
        return median;
    }

    public static void main(String[] args) {
        PriorityQueue maxHeap = new PriorityQueue<Double>(new MaxHeapComp());
        PriorityQueue minHeap = new PriorityQueue<Double>(new MinHeapComp());
        Box box=new Box(maxHeap,minHeap);
        box.add(5.32354);
        box.add(3.234321);
        box.add(6.123333);
        box.add(7.133333);
        box.add(1.2134);
        System.out.println(box.mid());
    }
}
