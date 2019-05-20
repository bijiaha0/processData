package cn.tju;
import com.jmatio.io.MatFileReader;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import java.io.*;
import java.util.*;

import static cn.tju.util.readMat.getGeneID;
@Slf4j
public class getGeneNameE {
    public static void main(String[] args) throws Exception {
        /*MatFileReader matFileReader = new MatFileReader("/Users/student/Desktop/日常/combineColumnsFilesDelete/mat_old/expmat/exptcgaLGG.mat");
        String geneID= getGeneID(matFileReader, "geneID");
        String[] split = geneID.split(" ");
        HashSet<String> geneNames = new HashSet<>();
        for(int k =0;k < split.length;k++){
            geneNames.add(split[k]);
        }
        FileInputStream fileInputStream = new FileInputStream("/Users/student/Desktop/genecytoexp.txt");
        InputStreamReader Reader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(Reader);
        bufferedReader.readLine();
        String temp;
        while ((temp= bufferedReader.readLine())!=null){
            if(!geneNames.contains(temp.split("\t")[0])){
                log.info("no");
                log.info(temp);
            }
        }
        bufferedReader.close();
        Reader.close();
        fileInputStream.close();*/


        /*HashMap<String, String> stringStringHashMap = productToHashMap();
        for(Map.Entry<String ,String> entry:stringStringHashMap.entrySet()){
            log.info(entry.getKey());
        }
        log.info(String.valueOf(stringStringHashMap.size()));*/


        LinkedHashSet<String> strings = productToHashSet();
        //增强for遍历
        for(String s:strings) {
            log.info(String.valueOf(s));
        }
    }

    public static LinkedHashMap<String, String> productToHashMap() throws IOException {
        MatFileReader matFileReader = new MatFileReader("/Users/student/Desktop/日常/combineColumnsFilesDelete/mat_old/expmat/exptcgaLGG.mat");
        String geneID= getGeneID(matFileReader, "geneID");
        String[] split = geneID.split(" ");
        LinkedHashMap<String,String> geneNames = new LinkedHashMap<String,String>();
        for(int k =0;k < split.length;k++){
            geneNames.put(split[k],"");
        }
        return geneNames;
    }

    public static LinkedHashSet<String> productToHashSet() throws IOException {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        FileInputStream fileInputStream = new FileInputStream("/Users/student/Desktop/日常/genecytoexp.txt");
        InputStreamReader Reader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(Reader);
        bufferedReader.readLine();
        String line;
        while ((line = bufferedReader.readLine())!=null){
            strings.add(line.split("\t")[0]);
        }
        bufferedReader.close();
        Reader.close();
        fileInputStream.close();
        return strings;
    }



    @Test
    public void productToTxt() throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/student/Desktop/日常/exp.txt");
        FileInputStream fileInputStream = new FileInputStream("/Users/student/Desktop/日常/genecytoexp.txt");
        InputStreamReader Reader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(Reader);
        bufferedReader.readLine();
        String line;
        while((line = bufferedReader.readLine())!=null){
            fileWriter.write(line.split("\t")[1]+"\t"+line.split("\t")[2]+"\t"+line.split("\t")[3]+"\t"+line.split("\t")[4]+"\t"+line.split("\t")[6]+"\t"+line.split("\t")[5]+"\n");
        }
        bufferedReader.close();
        Reader.close();
        fileInputStream.close();
        fileWriter.close();
    }
}
