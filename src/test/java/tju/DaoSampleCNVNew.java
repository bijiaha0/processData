package tju;

import cn.tju.dao.sampleCNewMapper;
import cn.tju.pojo.sampleCNew;
import com.jmatio.io.MatFileReader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;
import static cn.tju.util.readMat.getSampleID;

/**
 * Author: bijiaha0
 * Date: 2018-12-01
 * Time: 10:53 AM
 * Email: clickgwas@gmail.com
 */
public class DaoSampleCNVNew extends TestBase{
    @Autowired
    private sampleCNewMapper SampleCNewMapper;
    @Test
    public void testInset() throws IOException {
        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};

        for(int jj = 0 ; jj < strings.length; jj++){
            MatFileReader matFileReader = new MatFileReader("/Users/student/Desktop/日常/combineColumnsFilesDelete/matCNV_New/cnvtcga"+strings[jj].toUpperCase()+".mat");

            String sampleIDN= getSampleID(matFileReader, "pIDn");
            String sampleIDT= getSampleID(matFileReader, "pIDt");
            SampleCNewMapper.insert(new sampleCNew(strings[jj],sampleIDN,sampleIDT));

        }
    }
}
