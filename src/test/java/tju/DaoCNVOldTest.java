package tju;

import cn.tju.dao.*;
import cn.tju.util.ClassInstanceFactory;
import cn.tju.util.StringUtils;
import cn.tju.util.reservesDecimal;
import com.jmatio.io.MatFileReader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static cn.tju.util.readMat.getValue;

/**
 * Author: bijiaha0
 * Date: 2018-11-24
 * Time: 11:07 AM
 * Email: clickgwas@gmail.com
 */
public class DaoCNVOldTest extends TestBase {
    @Autowired
    private AccCOldMapper accCOldMapper;
    @Autowired
    private BlcaCOldMapper blcaCOldMapper;
    @Autowired
    private BrcaCOldMapper brcaCOldMapper;
    @Autowired
    private CescCOldMapper cescCOldMapper;
    @Autowired
    private CholCOldMapper cholCOldMapper;
    @Autowired
    private CoadCOldMapper coadCOldMapper;
    @Autowired
    private DlbcCOldMapper dlbcCOldMapper;
    @Autowired
    private EscaCOldMapper escaCOldMapper;
    @Autowired
    private GbmCOldMapper gbmCOldMapper;
    @Autowired
    private HnscCOldMapper hnscCOldMapper;
    @Autowired
    private KichCOldMapper kichCOldMapper;
    @Autowired
    private KircCOldMapper kircCOldMapper;
    @Autowired
    private KirpCOldMapper kirpCOldMapper;
    @Autowired
    private LamlCOldMapper lamlCOldMapper;
    @Autowired
    private LggCOldMapper lggCOldMapper;
    @Autowired
    private LihcCOldMapper lihcCOldMapper;
    @Autowired
    private LuadCOldMapper luadCOldMapper;
    @Autowired
    private LuscCOldMapper luscCOldMapper;
    @Autowired
    private MesoCOldMapper mesoCOldMapper;
    @Autowired
    private OvCOldMapper ovCOldMapper;
    @Autowired
    private PaadCOldMapper paadCOldMapper;
    @Autowired
    private PcpgCOldMapper pcpgCOldMapper;
    @Autowired
    private PradCOldMapper pradCOldMapper;
    @Autowired
    private ReadCOldMapper readCOldMapper;
    @Autowired
    private SarcCOldMapper sarcCOldMapper;
    @Autowired
    private SkcmCOldMapper skcmCOldMapper;
    @Autowired
    private StadCOldMapper stadCOldMapper;
    @Autowired
    private TgctCOldMapper tgctCOldMapper;
    @Autowired
    private ThcaCOldMapper thcaCOldMapper;
    @Autowired
    private ThymCOldMapper thymCOldMapper;
    @Autowired
    private UcecCOldMapper ucecCOldMapper;
    @Autowired
    private UcsCOldMapper ucsCOldMapper;
    @Autowired
    private UvmCOldMapper uvmCOldMapper;

    //CNVOld
    @Test
    public void testDao() throws IOException, ClassNotFoundException {
        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};
        for(int jj = 0 ; jj < strings.length; jj++){
            MatFileReader matFileReader = new MatFileReader("/Users/student/Desktop/日常/combineColumnsFilesDelete/mat_old/cnvmat/cnvtcga"+strings[jj].toUpperCase()+".mat");
            double[][] cnvns = getValue(matFileReader, "cnvn");
            double[][] cnvts = getValue(matFileReader, "cnvt");
            for(int i = 0;i<cnvns.length;i++){
                String stringNL = "";
                String stringNY = "";
                String stringTL = "";
                String stringTY = "";
                for(int j=0;j<cnvns[i].length;j++){
                    stringNL=stringNL + reservesDecimal.getValue(cnvns[i][j],6)+" ";
                    stringNY=stringNY + reservesDecimal.getValue(Math.pow(2,cnvns[i][j]+1),6)+" ";
                }
                stringNL=stringNL.trim();
                stringNY=stringNY.trim();
                for(int j=0;j<cnvts[i].length;j++){
                    stringTL=stringTL + reservesDecimal.getValue(cnvts[i][j],6)+" ";
                    stringTY=stringTY + reservesDecimal.getValue(Math.pow(2, cnvts[i][j] + 1),6)+" ";
                }
                stringTL=stringTL.trim();
                stringTY=stringTY.trim();
                String value = "geneId:"+(i+1)+"|"+"valueNL:"+stringNL+"|"+"valueNY:"+stringNY+"|"+"valueTL:"+stringTL+"|"+"valueTY:"+stringTY;
                if("acc".equals(strings[jj])){
                    accCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("blca".equals(strings[jj])){
                    blcaCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("brca".equals(strings[jj])){
                    brcaCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("cesc".equals(strings[jj])){
                    cescCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("chol".equals(strings[jj])){
                    cholCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("coad".equals(strings[jj])){
                    coadCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("dlbc".equals(strings[jj])){
                    dlbcCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("esca".equals(strings[jj])){
                    escaCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("gbm".equals(strings[jj])){
                    gbmCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("hnsc".equals(strings[jj])){
                    hnscCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("kich".equals(strings[jj])){
                    kichCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("kirc".equals(strings[jj])){
                    kircCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("kirp".equals(strings[jj])){
                    kirpCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("laml".equals(strings[jj])){
                    lamlCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("lgg".equals(strings[jj])){
                    lggCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("lihc".equals(strings[jj])){
                    lihcCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("luad".equals(strings[jj])){
                    luadCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("lusc".equals(strings[jj])){
                    luscCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("meso".equals(strings[jj])){
                    mesoCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("ov".equals(strings[jj])){
                    ovCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("paad".equals(strings[jj])){
                    paadCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("pcpg".equals(strings[jj])){
                    pcpgCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("prad".equals(strings[jj])){
                    pradCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("read".equals(strings[jj])){
                    readCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("sarc".equals(strings[jj])){
                    sarcCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("skcm".equals(strings[jj])){
                    skcmCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("stad".equals(strings[jj])){
                    stadCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("tgct".equals(strings[jj])){
                    tgctCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("thca".equals(strings[jj])){
                    thcaCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("thym".equals(strings[jj])){
                    thymCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("ucec".equals(strings[jj])){
                    ucecCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else if("ucs".equals(strings[jj])){
                    ucsCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }else {
                    uvmCOldMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"COld"), value));
                }
            }
        }
    }
}
