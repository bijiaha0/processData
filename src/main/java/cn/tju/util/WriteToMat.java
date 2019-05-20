package cn.tju.util;

import com.jmatio.io.MatFileWriter;
import com.jmatio.types.MLArray;
import com.jmatio.types.MLCell;
import com.jmatio.types.MLChar;
import com.jmatio.types.MLDouble;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: bijiaha0
 * Date: 2018-11-23
 * Time: 5:33 PM
 * Email: clickgwas@gmail.com
 */

public class WriteToMat {

    public static void main(String[] args) throws IOException {

        writeToMLDouble();
    }


    public static String[] getGeneId() throws IOException {
        List<String> list = new ArrayList<String>();
        //【1】创建文件对象
        FileInputStream fis = new  FileInputStream("/Users/student/Desktop/refGene/newEXPCytoBandDelectTitle.txt");
        //【2】将字节转换成字符流
        Reader r = new InputStreamReader(fis,"utf-8");
        //【3】字符流读取的缓冲区
        BufferedReader br = new BufferedReader(r);
        String line;
        while ((line = br.readLine())!=null){
            list.add(line.split("\t")[1]);
        }
        String[] geneID = list.toArray(new String[list.size()]);
        //【6】关闭流
        br.close();
        r.close();
        fis.close();
        return geneID;
    }



    public static void writeToMLDouble() throws IOException {
        ArrayList<MLArray> list = new ArrayList<MLArray>();
        //【1】创建文件对象
        FileInputStream fis_t = new  FileInputStream("/Users/student/Desktop/combineColumnsFilesDelete/exp/l_brca_T.txt");
        //【2】将字节转换成字符流
        Reader r_t = new InputStreamReader(fis_t,"utf-8");
        //【3】字符流读取的缓冲区
        BufferedReader br_t = new BufferedReader(r_t);
        String sample_id_tumor = br_t.readLine();
        //sample_id_tumor
        String[] pIDt = new String[sample_id_tumor.split(" ").length];
        for(int t =0; t < sample_id_tumor.split(" ").length; t++){
            pIDt[t] = sample_id_tumor.split(" ")[t];
        }

        //【4】声明变量存储接收到的缓冲区取来的数据
        String line_t;
        //【5】循环读取
        ArrayList<String> stringList_t = new ArrayList<>();
        while((line_t=br_t.readLine())!=null){   //一次读一行
            stringList_t.add(line_t);
        }
        //【6】关闭流
        br_t.close();
        r_t.close();
        fis_t.close();

        /***************************************************************************************************************/

        ArrayList<String> stringList_n = new ArrayList<>();
        File file = new File("/Users/student/Desktop/combineColumnsFilesDelete/exp/l_brca_N.txt");
        String sample_id_normal;
        String[] pIDn;
        if(file.length() != 0){
            //【1】创建文件对象
            FileInputStream fis_n = new  FileInputStream("/Users/student/Desktop/combineColumnsFilesDelete/exp/l_brca_N.txt");
            //【2】将字节转换成字符流
            Reader r_n = new InputStreamReader(fis_n,"utf-8");
            //【3】字符流读取的缓冲区
            BufferedReader br_n = new BufferedReader(r_n);
            sample_id_normal = br_n.readLine();

            //sample_id_normal
            pIDn = new String[sample_id_normal.split(" ").length];
            for(int n =0; n < sample_id_normal.split(" ").length;n++){
                pIDn[n] = sample_id_normal.split(" ")[n];
            }

            //【4】声明变量存储接收到的缓冲区取来的数据
            String line_n;
            //【5】循环读取
            while((line_n=br_n.readLine())!=null){   //一次读一行
                stringList_n.add(line_n);
            }
            //【6】关闭流
            br_n.close();
            r_n.close();
            fis_n.close();
        }else {
            pIDn = new String[0];
        }

        //normal矩阵数据
        double[][] expn = new double[stringList_n.size()][];

        //tumor矩阵数据
        double[][] expt = new double[stringList_t.size()][];

        for(int nn = 0; nn < stringList_n.size(); nn++){

            String[] s_n = stringList_n.get(nn).split(" ");

            expn[nn] = new double[s_n.length];

            for(int nnn = 0; nnn < s_n.length; nnn++){
                expn[nn][nnn]=Double.parseDouble(s_n[nnn]);

            }
        }

        for(int tt = 0; tt < stringList_t.size(); tt++){

            String[] s_t = stringList_t.get(tt).split(" ");

            expt[tt] = new double[s_t.length];

            for(int ttt = 0; ttt < s_t.length; ttt++){

                expt[tt][ttt]=Double.parseDouble(s_t[ttt]);

            }
        }

        //gene_id数据
        String[] geneID = getGeneId();

        MLCell ucGeneIDCell = new MLCell("geneID", new int[]{60446, 1});
        for(int j = 0; j < geneID.length; j++){
            ucGeneIDCell.set(new MLChar("name", geneID[j]),j);
        }

        MLCell pIDtCell = new MLCell("pIDt", new int[]{pIDt.length, 1});
        for(int j = 0; j < pIDt.length; j++){
            pIDtCell.set(new MLChar("name", pIDt[j]),j);
        }

        MLCell pIDnCell = new MLCell("pIDn", new int[]{pIDn.length, 1});
        for(int j = 0; j < pIDn.length; j++){
            pIDnCell.set(new MLChar("name", pIDn[j]),j);
        }

        MLDouble expnMLDouble = new MLDouble("expn", expn);
        MLDouble exptMLDouble = new MLDouble("expt", expt);
        list.add(ucGeneIDCell);
        list.add(pIDtCell);
        list.add(pIDnCell);
        list.add(expnMLDouble);
        list.add(exptMLDouble);

        new MatFileWriter( "/Users/Student/Desktop/demo.mat", list);
    }
}
