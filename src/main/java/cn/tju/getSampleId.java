package cn.tju;
import cn.tju.util.MyBatisSessionFactory;
import cn.tju.vo.SampleC;
import com.jmatio.io.MatFileReader;
import java.io.File;
import static cn.tju.util.readMat.getSampleID;
public class getSampleId {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/BJH/Desktop/mat/cnvmat/");
        File[] files = file.listFiles();
        for (int j = 0;j < files.length;j++){
            if(files[j].getName().contains(".mat")){
                String cancerName = files[j].getName().substring(7, files[j].getName().indexOf("."));
                MatFileReader matFileReader = new MatFileReader(new File(files[j].getParentFile()+File.separator+files[j].getName()));
                String sampleIDN= getSampleID(matFileReader, "pIDn");
                String sampleIDT= getSampleID(matFileReader, "pIDt");
                SampleC sampleC = new SampleC();
                sampleC.setCancerName(cancerName);
                sampleC.setSampleIdN(sampleIDN);
                sampleC.setSampleIdT(sampleIDT);
                MyBatisSessionFactory.getSession().insert("cn.tju.vo.mapping.SampleCNS.doCreate", sampleC);
                MyBatisSessionFactory.getSession().commit();
                MyBatisSessionFactory.close();
            }
        }
    }
}
