package tju;

import cn.tju.dao.*;
import cn.tju.util.ClassInstanceFactory;
import cn.tju.util.StringUtils;
import cn.tju.util.reservesDecimal;
import com.jmatio.io.MatFileReader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import static cn.tju.getGeneNameE.productToHashMap;
import static cn.tju.getGeneNameE.productToHashSet;
import static cn.tju.util.readMat.getValue;

/**
 * Author: bijiaha0
 * Date: 2018-11-24
 * Time: 11:10 AM
 * Email: clickgwas@gmail.com
 */
public class DaoEXPOldTest extends TestBase {

    @Autowired
    private AccEOldMapper accEOldMapper;
    @Autowired
    private BlcaEOldMapper blcaEOldMapper;
    @Autowired
    private BrcaEOldMapper brcaEOldMapper;
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

    //EXPOld,需要调整顺序，按照UCSC的染色体基因顺序来
    @Test
    public void testDao() throws IOException, ClassNotFoundException {

        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};
        for(int jj = 0 ; jj < strings.length; jj++){
            MatFileReader matFileReader = new MatFileReader("/Users/student/Desktop/日常/combineColumnsFilesDelete/mat_old/expmat/exptcga"+strings[jj].toUpperCase()+".mat");
                double[][] expns = getValue(matFileReader, "expn");
                double[][] expts = getValue(matFileReader, "expt");
            LinkedHashMap<String, String> NL = productToHashMap();
            LinkedHashMap<String, String> NY = productToHashMap();
            LinkedHashMap<String, String> TL = productToHashMap();
            LinkedHashMap<String, String> TY = productToHashMap();
            int i = 0;
            for(Map.Entry<String,String> entry:NL.entrySet()){
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
                String geneName = entry.getKey();
                NL.put(geneName,stringNL);
                NY.put(geneName,stringNY);
                TL.put(geneName,stringTL);
                TY.put(geneName,stringTY);
                i++;
            }
            //for(int i = 0;i<expts.length;i++){
            //        String stringNL = "";
            //        String stringNY = "";
            //        String stringTL = "";
            //        String stringTY = "";
            //        if(expns.length==0){
            //            stringNL = "";
            //            stringNY = "";
            //        }else {
            //            for(int j=0;j<expns[i].length;j++){
            //                stringNL=stringNL + reservesDecimal.getValue(expns[i][j],6)+" ";
            //                stringNY=stringNY + reservesDecimal.getValue(Math.pow(2,expns[i][j]),6)+" ";
            //            }
            //        }
            //        stringNL=stringNL.trim();
            //        stringNY=stringNY.trim();
            //        for(int j=0;j<expts[i].length;j++){
            //            stringTL=stringTL+reservesDecimal.getValue(expts[i][j],6)+" ";
            //            stringTY=stringTY+ reservesDecimal.getValue(Math.pow(2, expts[i][j]),6)+" ";
            //        }
            //        stringTL=stringTL.trim();
            //        stringTY=stringTY.trim();

                //String value = "geneId:"+(i+1)+"|"+"valueNL:"+stringNL+"|"+"valueNY:"+stringNY+"|"+"valueTL:"+stringTL+"|"+"valueTY:"+stringTY;

            LinkedHashSet<String> set = productToHashSet();
            //增强for遍历
            int index =0;
            for(String s: set) {
                String value = "geneId:"+(index+1)+"|"+"valueNL:"+NL.get(s)+"|"+"valueNY:"+NY.get(s)+"|"+"valueTL:"+TL.get(s)+"|"+"valueTY:"+TY.get(s);
                if("acc".equals(strings[jj])){
                    accEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("blca".equals(strings[jj])){
                    blcaEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("brca".equals(strings[jj])){
                    brcaEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("cesc".equals(strings[jj])){
                    cescEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("chol".equals(strings[jj])){
                    cholEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("coad".equals(strings[jj])){
                    coadEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("dlbc".equals(strings[jj])){
                    dlbcEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("esca".equals(strings[jj])){
                    escaEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("gbm".equals(strings[jj])){
                    gbmEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("hnsc".equals(strings[jj])){
                    hnscEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("kich".equals(strings[jj])){
                    kichEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("kirc".equals(strings[jj])){
                    kircEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("kirp".equals(strings[jj])){
                    kirpEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("laml".equals(strings[jj])){
                    lamlEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("lgg".equals(strings[jj])){
                    lggEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("lihc".equals(strings[jj])){
                    lihcEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("luad".equals(strings[jj])){
                    luadEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("lusc".equals(strings[jj])){
                    luscEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("meso".equals(strings[jj])){
                    mesoEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("ov".equals(strings[jj])){
                    ovEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("paad".equals(strings[jj])){
                    paadEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("pcpg".equals(strings[jj])){
                    pcpgEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("prad".equals(strings[jj])){
                    pradEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("read".equals(strings[jj])){
                    readEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("sarc".equals(strings[jj])){
                    sarcEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("skcm".equals(strings[jj])){
                    skcmEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("stad".equals(strings[jj])){
                    stadEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("tgct".equals(strings[jj])){
                    tgctEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("thca".equals(strings[jj])){
                    thcaEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("thym".equals(strings[jj])){
                    thymEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("ucec".equals(strings[jj])){
                    ucecEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else if("ucs".equals(strings[jj])){
                    ucsEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }else {
                    uvmEOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"EOld"), value));
                }
                index++;
            }
            //}
        }
    }
}
