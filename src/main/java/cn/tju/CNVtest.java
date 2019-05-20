package cn.tju;

import cn.tju.util.MyBatisSessionFactory;
import cn.tju.util.reservesDecimal;
import cn.tju.vo.AccC;
import com.jmatio.io.MatFileReader;
import lombok.extern.slf4j.Slf4j;
import static cn.tju.util.readMat.getValue;

@Slf4j
public class CNVtest {
    public static void main(String[] args) throws Exception {
        MatFileReader matFileReader = new MatFileReader("/Users/BJH/Desktop/mat/cnvmat/cnvtcgaUVM.mat");
        /*********************************************************/
        double[][] cnvns = getValue(matFileReader, "cnvn");
        double[][] cnvts = getValue(matFileReader, "cnvt");
        for(int i = 0;i<cnvns.length;i++){
            String stringNL = "";
            String stringNY = "";
            String stringTL = "";
            String stringTY = "";
            for(int j=0;j<cnvns[i].length;j++){
                stringNL=stringNL + reservesDecimal.getValue(cnvns[i][j],6)+" ";
                stringNY=stringNY + reservesDecimal.getValue(Math.pow(2,cnvns[i][j]+1),6)+" ";
            }
            stringNL=stringNL.trim();
            stringNY=stringNY.trim();
            for(int j=0;j<cnvts[i].length;j++){
                stringTL=stringTL + reservesDecimal.getValue(cnvts[i][j],6)+" ";
                stringTY=stringTY + reservesDecimal.getValue(Math.pow(2, cnvts[i][j] + 1),6)+" ";
            }
            stringTL=stringTL.trim();
            stringTY=stringTY.trim();
            AccC cancer=new AccC();
            log.info(stringNL);
            log.info(stringNY);
            log.info(stringTL);
            log.info(stringTY);
            cancer.setValueNL(stringNL);
            cancer.setValueNY(stringNY);
            cancer.setValueTL(stringTL);
            cancer.setValueTY(stringTY);
            MyBatisSessionFactory.getSession().insert("cn.tju.vo.mapping.AccCNS.doCreate", cancer);
            MyBatisSessionFactory.getSession().commit();
            MyBatisSessionFactory.close();
        }
    }
}
