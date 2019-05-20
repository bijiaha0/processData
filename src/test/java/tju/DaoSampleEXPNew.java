package tju;

import cn.tju.pojo.sampleENew;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.*;
/**
 * Author: bijiaha0
 * Date: 2018-12-01
 * Time: 10:54 AM
 * Email: clickgwas@gmail.com
 */
public class DaoSampleEXPNew extends TestBase{
    @Autowired
    private cn.tju.dao.sampleENewMapper SampleENewMapper;
    @Test
    public void testInset() throws IOException {
        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};
        for(int jj = 0 ; jj < strings.length; jj++){
            if(new File("/Users/student/Desktop/日常/combineColumnsFilesDelete/exp_New/l_" + strings[jj] + "_N.txt").length()==0){
                FileInputStream T = new FileInputStream("/Users/student/Desktop/日常/combineColumnsFilesDelete/exp_New/l_" + strings[jj] + "_T.txt");
                InputStreamReader readerT = new InputStreamReader(T);
                BufferedReader bufferedReaderT = new BufferedReader(readerT);
                SampleENewMapper.insert(new sampleENew(strings[jj],"",bufferedReaderT.readLine()));
                bufferedReaderT.close();
                readerT.close();
                T.close();
            }else {
                FileInputStream N = new FileInputStream("/Users/student/Desktop/日常/combineColumnsFilesDelete/exp_New/l_" + strings[jj] + "_N.txt");
                FileInputStream T = new FileInputStream("/Users/student/Desktop/日常/combineColumnsFilesDelete/exp_New/l_" + strings[jj] + "_T.txt");
                InputStreamReader readerN = new InputStreamReader(N);
                InputStreamReader readerT = new InputStreamReader(T);
                BufferedReader bufferedReaderN = new BufferedReader(readerN);
                BufferedReader bufferedReaderT = new BufferedReader(readerT);
                SampleENewMapper.insert(new sampleENew(strings[jj],bufferedReaderN.readLine(),bufferedReaderT.readLine()));
                bufferedReaderT.close();
                bufferedReaderN.close();
                readerT.close();
                readerN.close();
                T.close();
                N.close();
            }
        }
    }
}
