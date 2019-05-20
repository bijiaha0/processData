package cn.tju;
import cn.tju.util.MyBatisSessionFactory;
import cn.tju.util.reservesDecimal;
import cn.tju.vo.AccC;
import com.jmatio.io.MatFileReader;
import static cn.tju.util.readMat.getValue;
public class EXPtest {
    public static void main(String[] args) throws Exception {
        MatFileReader matFileReader = new MatFileReader("/Users/BJH/Desktop/mat/expmat/exptcgaKIRP.mat");
        /*********************************************************/
        double[][] expns = getValue(matFileReader, "expn");
        double[][] expts = getValue(matFileReader, "expt");
        for(int i = 0;i<expts.length;i++){
            String stringNL = "";
            String stringNY = "";
            String stringTL = "";
            String stringTY = "";
            if(expns.length==0){
                stringNL = "";
                stringNY = "";
            }else {
                for(int j=0;j<expns[i].length;j++){
                    stringNL=stringNL + reservesDecimal.getValue(expns[i][j],6)+" ";
                    stringNY=stringNY + reservesDecimal.getValue(Math.pow(2,expns[i][j]),6)+" ";
                }
            }
            stringNL=stringNL.trim();
            stringNY=stringNY.trim();
            for(int j=0;j<expts[i].length;j++){
                stringTL=stringTL+reservesDecimal.getValue(expts[i][j],6)+" ";
                stringTY=stringTY+ reservesDecimal.getValue(Math.pow(2, expts[i][j]),6)+" ";
            }
            stringTL=stringTL.trim();
            stringTY=stringTY.trim();
            AccC cancer=new AccC();
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
