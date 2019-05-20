package cn.tju;
import cn.tju.util.MyBatisSessionFactory;
import cn.tju.util.reservesDecimal;
import cn.tju.vo.CMountain;
import com.jmatio.io.MatFileReader;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.ArrayList;
import static cn.tju.util.readMat.getChr;
import static cn.tju.util.readMat.getValue;
@Slf4j
public class MountainMeanTest {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/BJH/Desktop/mat/cnvmat/");
        File[] files = file.listFiles();
        for (int j = 0;j < files.length;j++){
            if(files[j].getName().contains(".mat")){
                String cancerName = files[j].getName().substring(7, files[j].getName().indexOf("."));
                MatFileReader matFileReader = new MatFileReader(new File(files[j].getParentFile()+File.separator+files[j].getName()));
                double[][] cnvns = getValue(matFileReader, "cnvn");
                double[][] cnvts = getValue(matFileReader, "cnvt");
                String chr = getChr(matFileReader, "ucChrom");
                String[] split = chr.split(" ");
                ArrayList<String> stringArrayList = new ArrayList<>(split.length);
                for(int kk=0;kk < split.length;kk++){
                    stringArrayList.add(split[kk]);
                }
                for(int ch = 1; ch <= 22; ch++){
                    int start = stringArrayList.indexOf("" + ch);//首次出现指定元素的索引
                    int end = stringArrayList.lastIndexOf("" + ch);//最后一次出现指定元素的索引
                    String stringNL = "";
                    String stringNY = "";
                    String stringTL = "";
                    String stringTY = "";
                    for(int i = start; i<= end;i++){
                        double NL= 0;
                        double NY= 0;
                        double TL= 0;
                        double TY= 0;
                        for(int kkk=0;kkk<cnvns[i].length;kkk++){
                            NL+=cnvns[i][kkk];
                            NY+=Math.pow(2,cnvns[i][kkk]+1);
                        }
                        for(int mmm=0;mmm<cnvts[i].length;mmm++){
                            TL+=cnvts[i][mmm];
                            TY+=Math.pow(2,cnvts[i][mmm]+1);
                        }
                        stringNL = stringNL + reservesDecimal.getValue(NL/(end-start+1),6)+" ";
                        stringNY = stringNY + reservesDecimal.getValue(NY/(end-start+1),6)+" ";
                        stringTL = stringTL + reservesDecimal.getValue(TL/(end-start+1),6)+" ";
                        stringTY = stringTY + reservesDecimal.getValue(TY/(end-start+1),6)+" ";
                    }
                    CMountain cMountain = new CMountain();
                    cMountain.setChr(String.valueOf(ch));
                    cMountain.setCancerName(cancerName);//这里需要修改
                    cMountain.setNL(stringNL.trim());
                    cMountain.setNY(stringNY.trim());
                    cMountain.setTL(stringTL.trim());
                    cMountain.setTY(stringTY.trim());
                    MyBatisSessionFactory.getSession().insert("cn.tju.vo.mapping.CMountainNS.doCreate", cMountain);
                    MyBatisSessionFactory.getSession().commit();
                    MyBatisSessionFactory.close();
                }
            }
        }


        /*MatFileReader matFileReader = new MatFileReader("/Users/BJH/Desktop/mat/cnvmat/cnvtcgaACC.mat");
        double[][] cnvns = getValue(matFileReader, "cnvn");
        double[][] cnvts = getValue(matFileReader, "cnvt");
        String chr = getChr(matFileReader, "ucChrom");
        String[] split = chr.split(" ");
        ArrayList<String> stringArrayList = new ArrayList<>(split.length);
                for(int kk=0;kk < split.length;kk++){
                    stringArrayList.add(split[kk]);
                }
        for(int ch = 1; ch <= 22; ch++){
            int start = stringArrayList.indexOf("" + ch);//首次出现指定元素的索引
            int end = stringArrayList.lastIndexOf("" + ch);//最后一次出现指定元素的索引
            String stringNL = "";
            String stringNY = "";
            String stringTL = "";
            String stringTY = "";
            for(int i = start; i<= end;i++){
                PriorityQueue maxHeapNL = new PriorityQueue<Double>(new Median.MaxHeapComp());
                PriorityQueue minHeapNL = new PriorityQueue<Double>(new Median.MinHeapComp());
                PriorityQueue maxHeapNY = new PriorityQueue<Double>(new Median.MaxHeapComp());
                PriorityQueue minHeapNY = new PriorityQueue<Double>(new Median.MinHeapComp());
                PriorityQueue maxHeapTL = new PriorityQueue<Double>(new Median.MaxHeapComp());
                PriorityQueue minHeapTL = new PriorityQueue<Double>(new Median.MinHeapComp());
                PriorityQueue maxHeapTY = new PriorityQueue<Double>(new Median.MaxHeapComp());
                PriorityQueue minHeapTY = new PriorityQueue<Double>(new Median.MinHeapComp());
                Median.Box boxNL=new Median.Box(maxHeapNL,minHeapNL);
                Median.Box boxNY=new Median.Box(maxHeapNY,minHeapNY);
                Median.Box boxTL=new Median.Box(maxHeapTL,minHeapTL);
                Median.Box boxTY=new Median.Box(maxHeapTY,minHeapTY);
                for(int j=0;j<cnvns[i].length;j++){
                    boxNL.add(cnvns[i][j]);
                    boxNY.add(Math.pow(2,cnvns[i][j]+1));
                }
                for(int j=0;j<cnvts[i].length;j++){
                    boxTL.add(cnvts[i][j]);
                    boxTY.add(Math.pow(2,cnvts[i][j]+1));
                }
                stringNL = stringNL + reservesDecimal.getValue(boxNL.mid(),6)+" ";
                stringNY = stringNY + reservesDecimal.getValue(boxNY.mid(),6)+" ";
                stringTL = stringTL + reservesDecimal.getValue(boxTL.mid(),6)+" ";
                stringTY = stringTY + reservesDecimal.getValue(boxTY.mid(),6)+" ";
            }
            CMountain cMountain = new CMountain();
            cMountain.setChr(String.valueOf(ch));
            cMountain.setCancerName("ACC");//这里需要修改
            cMountain.setNL(stringNL.trim());
            cMountain.setNY(stringNY.trim());
            cMountain.setTL(stringTL.trim());
            cMountain.setTY(stringTY.trim());
            MyBatisSessionFactory.getSession().insert("cn.tju.vo.mapping.CMountainNS.doCreate", cMountain);
            MyBatisSessionFactory.getSession().commit();
            MyBatisSessionFactory.close();
        }*/
    }
}
