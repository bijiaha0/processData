package cn.tju.util;

import com.jmatio.io.MatFileWriter;
import com.jmatio.types.MLArray;
import com.jmatio.types.MLCell;
import com.jmatio.types.MLChar;
import com.jmatio.types.MLDouble;

import java.io.*;
import java.util.ArrayList;

public class writerMat {
    public static void main(String[] args) throws IOException {
        writeToMLCell();
    }
    //写出到Cell
    public static void writeToMLCell() throws IOException {
        ArrayList<MLArray> list = new ArrayList<MLArray>();
        int i = 0;
        String[] ucChrom = new String[14569];
        double[] ucStart = new double[14569];
        double[] ucStop = new double[14569];
        String[] geneID = new String[14569];
        //【1】创建文件对象
        FileInputStream fis = new  FileInputStream("/Users/BJH/Desktop"+ File.separator+"result.txt");   //盘符不分大小写
        //【2】将字节转换成字符流
        Reader r = new InputStreamReader(fis,"utf-8");
        //【3】字符流读取的缓冲区
        BufferedReader br = new BufferedReader(r);
        //【4】声明变量存储接收到的缓冲区取来的数据
        String line;
        //【5】循环读取
        while((line=br.readLine())!=null){   //一次读一行
            String[] split = line.split("\t");
            ucChrom[i]=split[1];
            ucStart[i]=Double.parseDouble(split[2]);
            ucStop[i]=Double.parseDouble(split[3]);
            geneID[i]=split[4];
            i++;
        }
        //【6】关闭流
        br.close();
        r.close();
        fis.close();

        MLCell ucChromCell = new MLCell("ucChrom", new int[]{14569, 1});
        MLCell ucGeneIDCell = new MLCell("geneID", new int[]{14569, 1});
        for(int j = 0; j < ucChrom.length; j++){
            ucChromCell.set(new MLChar("name", ucChrom[j]),j);
            ucGeneIDCell.set(new MLChar("name", geneID[j]),j);
        }
        MLDouble ucStartMLDouble = new MLDouble("ucStart", ucStart, 14569);
        MLDouble ucStopMLDouble = new MLDouble("ucStop", ucStop, 14569);
        list.add(ucChromCell);
        list.add(ucGeneIDCell);
        list.add(ucStartMLDouble);
        list.add(ucStopMLDouble);
        new MatFileWriter( "/Users/BJH/Desktop/ucscannotation.mat", list);
    }



}
