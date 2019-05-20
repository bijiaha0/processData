package cn.tju.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Author: bijiaha0
 * Date: 2018-11-23
 * Time: 10:35 PM
 * Email: clickgwas@gmail.com
 */
/*
* JAVA快速统计大文本文件行数
* */
public class CountOfLines {

    public  static Integer getLineCount(String fileName) throws IOException {
        long count = Files.lines(Paths.get(new File(fileName).getPath())).count();
        return (int)count;
    }

    public static void main(String[] args) throws IOException {
        Integer lineCount = getLineCount("/Users/student/Desktop/combineColumnsFilesDelete/exp/l_brca_T.txt");
        System.out.println(lineCount);
    }


}
