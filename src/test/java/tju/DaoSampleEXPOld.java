package tju;
import cn.tju.pojo.sampleEOld;
import com.jmatio.io.MatFileReader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;
import static cn.tju.util.readMat.getSampleID;
/**
 * Author: bijiaha0
 * Date: 2018-12-01
 * Time: 10:54 AM
 * Email: clickgwas@gmail.com
 */
public class DaoSampleEXPOld extends TestBase{
    @Autowired
    private cn.tju.dao.sampleEOldMapper SampleEOldMapper;
    @Test
    public void testInset() throws IOException {
        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};
        for(int jj = 0 ; jj < strings.length; jj++){
            MatFileReader matFileReader = new MatFileReader("/Users/student/Desktop/日常/combineColumnsFilesDelete/mat_old/expmat/exptcga"+strings[jj].toUpperCase()+".mat");
            String sampleIDN= getSampleID(matFileReader, "pIDn");
            String sampleIDT= getSampleID(matFileReader, "pIDt");
            SampleEOldMapper.insert(new sampleEOld(strings[jj],sampleIDN,sampleIDT));
        }
    }
}
