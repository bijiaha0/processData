package tju;

import cn.tju.dao.*;
import cn.tju.util.ClassInstanceFactory;
import cn.tju.util.LogArithm;
import cn.tju.util.StringUtils;
import cn.tju.util.reservesDecimal;
import com.jmatio.io.MatFileReader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

/**
 * Author: bijiaha0
 * Date: 2018-11-22
 * Time: 9:56 PM
 * Email: clickgwas@gmail.com
 */
public class DaoEXPNewTest extends TestBase{
    @Autowired
    private AccENewMapper accENewMapper;
    @Autowired
    private BlcaENewMapper blcaENewMapper;
    @Autowired
    private BrcaENewMapper brcaENewMapper;
    @Autowired
    private CescENewMapper cescENewMapper;
    @Autowired
    private CholENewMapper cholENewMapper;
    @Autowired
    private CoadENewMapper coadENewMapper;
    @Autowired
    private DlbcENewMapper dlbcENewMapper;
    @Autowired
    private EscaENewMapper escaENewMapper;
    @Autowired
    private GbmENewMapper gbmENewMapper;
    @Autowired
    private HnscENewMapper hnscENewMapper;
    @Autowired
    private KichENewMapper kichENewMapper;
    @Autowired
    private KircENewMapper kircENewMapper;
    @Autowired
    private KirpENewMapper kirpENewMapper;
    @Autowired
    private LamlENewMapper lamlENewMapper;
    @Autowired
    private LggENewMapper lggENewMapper;
    @Autowired
    private LihcENewMapper lihcENewMapper;
    @Autowired
    private LuadENewMapper luadENewMapper;
    @Autowired
    private LuscENewMapper luscENewMapper;
    @Autowired
    private MesoENewMapper mesoENewMapper;
    @Autowired
    private OvENewMapper ovENewMapper;
    @Autowired
    private PaadENewMapper paadENewMapper;
    @Autowired
    private PcpgENewMapper pcpgENewMapper;
    @Autowired
    private PradENewMapper pradENewMapper;
    @Autowired
    private ReadENewMapper readENewMapper;
    @Autowired
    private SarcENewMapper sarcENewMapper;
    @Autowired
    private SkcmENewMapper skcmENewMapper;
    @Autowired
    private StadENewMapper stadENewMapper;
    @Autowired
    private TgctENewMapper tgctENewMapper;
    @Autowired
    private ThcaENewMapper thcaENewMapper;
    @Autowired
    private ThymENewMapper thymENewMapper;
    @Autowired
    private UcecENewMapper ucecENewMapper;
    @Autowired
    private UcsENewMapper ucsENewMapper;
    @Autowired
    private UvmENewMapper uvmENewMapper;


    @Autowired
    private AccEOldMapper accEOldMapper;
    @Autowired
    private BlcaEOldMapper blcaEOldMapper;
    @Autowired
    private BrcaEOldMapper BrcaEOldMapper;
    @Autowired
    private CescEOldMapper cescEOldMapper;
    @Autowired
    private CholEOldMapper cholEOldMapper;
    @Autowired
    private CoadEOldMapper coadEOldMapper;
    @Autowired
    private DlbcEOldMapper dlbcEOldMapper;
    @Autowired
    private EscaEOldMapper escaEOldMapper;
    @Autowired
    private GbmEOldMapper gbmEOldMapper;
    @Autowired
    private HnscEOldMapper hnscEOldMapper;
    @Autowired
    private KichEOldMapper kichEOldMapper;
    @Autowired
    private KircEOldMapper kircEOldMapper;
    @Autowired
    private KirpEOldMapper kirpEOldMapper;
    @Autowired
    private LamlEOldMapper lamlEOldMapper;
    @Autowired
    private LggEOldMapper lggEOldMapper;
    @Autowired
    private LihcEOldMapper lihcEOldMapper;
    @Autowired
    private LuadEOldMapper luadEOldMapper;
    @Autowired
    private LuscEOldMapper luscEOldMapper;
    @Autowired
    private MesoEOldMapper mesoEOldMapper;
    @Autowired
    private OvEOldMapper ovEOldMapper;
    @Autowired
    private PaadEOldMapper paadEOldMapper;
    @Autowired
    private PcpgEOldMapper pcpgEOldMapper;
    @Autowired
    private PradEOldMapper pradEOldMapper;
    @Autowired
    private ReadEOldMapper readEOldMapper;
    @Autowired
    private SarcEOldMapper sarcEOldMapper;
    @Autowired
    private SkcmEOldMapper skcmEOldMapper;
    @Autowired
    private StadEOldMapper stadEOldMapper;
    @Autowired
    private TgctEOldMapper tgctEOldMapper;
    @Autowired
    private ThcaEOldMapper thcaEOldMapper;
    @Autowired
    private ThymEOldMapper thymEOldMapper;
    @Autowired
    private UcecEOldMapper ucecEOldMapper;
    @Autowired
    private UcsEOldMapper ucsEOldMapper;
    @Autowired
    private UvmEOldMapper uvmEOldMapper;


    //EXPNew
    @Test
    public void testDao() throws IOException, ClassNotFoundException {

        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};

        for(int jj = 0 ; jj < strings.length; jj++){
            FileInputStream fis_y_t = new  FileInputStream("/Users/student/Desktop/日常/combineColumnsFilesDelete/exp_New/y_"+strings[jj]+"_T.txt");
            FileInputStream fis_l_t = new  FileInputStream("/Users/student/Desktop/日常/combineColumnsFilesDelete/exp_New/l_"+strings[jj]+"_T.txt");//盘符不分大小写
            File file_y_n = new File("/Users/student/Desktop/日常/combineColumnsFilesDelete/exp_New/y_"+strings[jj]+"_N.txt");
            File file_l_n = new File("/Users/student/Desktop/日常/combineColumnsFilesDelete/exp_New/l_"+strings[jj]+"_N.txt");
            int kk = 0;
            if(file_y_n.length() == 0) {
                Reader r_y_t = new InputStreamReader(fis_y_t);
                BufferedReader br_y_t = new BufferedReader(r_y_t);
                br_y_t.readLine();//先读取一行

                Reader r_l_t = new InputStreamReader(fis_l_t);
                BufferedReader br_l_t = new BufferedReader(r_l_t);
                br_l_t.readLine();//先读取一行

                String line_y_t;

                while((line_y_t=br_y_t.readLine())!=null){   //一次读一行
                    String stringNL = "";
                    String stringNY = "";
                    String stringTL ;
                    String stringTY ;

                    stringTY = line_y_t;
                    stringTL = br_l_t.readLine();

                    String value = "geneId:"+(++kk)+"|"+"valueNL:"+stringNL+"|"+"valueNY:"+stringNY+"|"+"valueTL:"+stringTL+"|"+"valueTY:"+stringTY;
                    if("acc".equals(strings[jj])){
                        accENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("blca".equals(strings[jj])){
                        blcaENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("brca".equals(strings[jj])){
                        brcaENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("cesc".equals(strings[jj])){
                        cescENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("chol".equals(strings[jj])){
                        cholENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("coad".equals(strings[jj])){
                        coadENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("dlbc".equals(strings[jj])){
                        dlbcENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("esca".equals(strings[jj])){
                        escaENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("gbm".equals(strings[jj])){
                        gbmENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("hnsc".equals(strings[jj])){
                        hnscENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("kich".equals(strings[jj])){
                        kichENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("kirc".equals(strings[jj])){
                        kircENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("kirp".equals(strings[jj])){
                        kirpENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("laml".equals(strings[jj])){
                        lamlENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("lgg".equals(strings[jj])){
                        lggENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("lihc".equals(strings[jj])){
                        lihcENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("luad".equals(strings[jj])){
                        luadENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("lusc".equals(strings[jj])){
                        luscENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("meso".equals(strings[jj])){
                        mesoENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("ov".equals(strings[jj])){
                        ovENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("paad".equals(strings[jj])){
                        paadENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("pcpg".equals(strings[jj])){
                        pcpgENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("prad".equals(strings[jj])){
                        pradENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("read".equals(strings[jj])){
                        readENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("sarc".equals(strings[jj])){
                        sarcENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("skcm".equals(strings[jj])){
                        skcmENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("stad".equals(strings[jj])){
                        stadENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("tgct".equals(strings[jj])){
                        tgctENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("thca".equals(strings[jj])){
                        thcaENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("thym".equals(strings[jj])){
                        thymENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("ucec".equals(strings[jj])){
                        ucecENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("ucs".equals(strings[jj])){
                        ucsENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else {
                        uvmENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }
                }
                br_y_t.close();
                r_y_t.close();
                fis_y_t.close();

                br_l_t.close();
                r_l_t.close();
                fis_l_t.close();

            }else {
                FileInputStream fis_y_n = new  FileInputStream(file_y_n);
                Reader r_y_n = new InputStreamReader(fis_y_n);
                BufferedReader br_y_n = new BufferedReader(r_y_n);
                br_y_n.readLine();//先读取一行


                FileInputStream fis_l_n = new  FileInputStream(file_l_n);
                Reader r_l_n = new InputStreamReader(fis_l_n);
                BufferedReader br_l_n = new BufferedReader(r_l_n);
                br_l_n.readLine();//先读取一行





                Reader r_y_t = new InputStreamReader(fis_y_t);
                BufferedReader br_y_t = new BufferedReader(r_y_t);
                br_y_t.readLine();//先读取一行
                String line_y_t;


                Reader r_l_t = new InputStreamReader(fis_l_t);
                BufferedReader br_l_t = new BufferedReader(r_l_t);
                br_l_t.readLine();//先读取一行




                while((line_y_t=br_y_t.readLine())!=null){//一次读一行
                    String stringNL;
                    String stringNY;
                    String stringTL;
                    String stringTY;



                    stringTY=line_y_t;
                    stringTL=br_l_t.readLine();
                    stringNY=br_y_n.readLine();
                    stringNL=br_l_n.readLine();
                    String value = "geneId:"+(++kk)+"|"+"valueNL:"+stringNL+"|"+"valueNY:"+stringNY+"|"+"valueTL:"+stringTL+"|"+"valueTY:"+stringTY;
                    if("acc".equals(strings[jj])){
                        accENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("blca".equals(strings[jj])){
                        blcaENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("brca".equals(strings[jj])){
                        brcaENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("cesc".equals(strings[jj])){
                        cescENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("chol".equals(strings[jj])){
                        cholENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("coad".equals(strings[jj])){
                        coadENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("dlbc".equals(strings[jj])){
                        dlbcENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("esca".equals(strings[jj])){
                        escaENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("gbm".equals(strings[jj])){
                        gbmENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("hnsc".equals(strings[jj])){
                        hnscENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("kich".equals(strings[jj])){
                        kichENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("kirc".equals(strings[jj])){
                        kircENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("kirp".equals(strings[jj])){
                        kirpENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("laml".equals(strings[jj])){
                        lamlENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("lgg".equals(strings[jj])){
                        lggENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("lihc".equals(strings[jj])){
                        lihcENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("luad".equals(strings[jj])){
                        luadENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("lusc".equals(strings[jj])){
                        luscENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("meso".equals(strings[jj])){
                        mesoENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("ov".equals(strings[jj])){
                        ovENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("paad".equals(strings[jj])){
                        paadENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("pcpg".equals(strings[jj])){
                        pcpgENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("prad".equals(strings[jj])){
                        pradENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("read".equals(strings[jj])){
                        readENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("sarc".equals(strings[jj])){
                        sarcENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("skcm".equals(strings[jj])){
                        skcmENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("stad".equals(strings[jj])){
                        stadENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("tgct".equals(strings[jj])){
                        tgctENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("thca".equals(strings[jj])){
                        thcaENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("thym".equals(strings[jj])){
                        thymENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("ucec".equals(strings[jj])){
                        ucecENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else if("ucs".equals(strings[jj])){
                        ucsENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }else {
                        uvmENewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"ENew"), value));
                    }
                }


                br_l_n.close();
                r_l_n.close();
                fis_l_n.close();

                br_y_n.close();
                r_y_n.close();
                fis_y_n.close();


                br_y_t.close();
                r_y_t.close();
                fis_y_t.close();

                br_l_t.close();
                r_l_t.close();
                fis_l_t.close();


            }
        }
    }
}
