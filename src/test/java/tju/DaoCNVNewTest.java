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
 * Date: 2018-11-22
 * Time: 9:56 PM
 * Email: clickgwas@gmail.com
 */
public class DaoCNVNewTest extends TestBase {
    @Autowired
    private AccCNewMapper accCNewMapper;
    @Autowired
    private BlcaCNewMapper blcaCNewMapper;
    @Autowired
    private BrcaCNewMapper brcaCNewMapper;
    @Autowired
    private CescCNewMapper cescCNewMapper;
    @Autowired
    private CholCNewMapper cholCNewMapper;
    @Autowired
    private CoadCNewMapper coadCNewMapper;
    @Autowired
    private DlbcCNewMapper dlbcCNewMapper;
    @Autowired
    private EscaCNewMapper escaCNewMapper;
    @Autowired
    private GbmCNewMapper gbmCNewMapper;
    @Autowired
    private HnscCNewMapper hnscCNewMapper;
    @Autowired
    private KichCNewMapper kichCNewMapper;
    @Autowired
    private KircCNewMapper kircCNewMapper;
    @Autowired
    private KirpCNewMapper kirpCNewMapper;
    @Autowired
    private LamlCNewMapper lamlCNewMapper;
    @Autowired
    private LggCNewMapper lggCNewMapper;
    @Autowired
    private LihcCNewMapper lihcCNewMapper;
    @Autowired
    private LuadCNewMapper luadCNewMapper;
    @Autowired
    private LuscCNewMapper luscCNewMapper;
    @Autowired
    private MesoCNewMapper mesoCNewMapper;
    @Autowired
    private OvCNewMapper ovCNewMapper;
    @Autowired
    private PaadCNewMapper paadCNewMapper;
    @Autowired
    private PcpgCNewMapper pcpgCNewMapper;
    @Autowired
    private PradCNewMapper pradCNewMapper;
    @Autowired
    private ReadCNewMapper readCNewMapper;
    @Autowired
    private SarcCNewMapper sarcCNewMapper;
    @Autowired
    private SkcmCNewMapper skcmCNewMapper;
    @Autowired
    private StadCNewMapper stadCNewMapper;
    @Autowired
    private TgctCNewMapper tgctCNewMapper;
    @Autowired
    private ThcaCNewMapper thcaCNewMapper;
    @Autowired
    private ThymCNewMapper thymCNewMapper;
    @Autowired
    private UcecCNewMapper ucecCNewMapper;
    @Autowired
    private UcsCNewMapper ucsCNewMapper;
    @Autowired
    private UvmCNewMapper uvmCNewMapper;
    //CNVNew
    @Test
    public void testDao() throws IOException, ClassNotFoundException {
        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};
        for(int jj = 0 ; jj < strings.length; jj++){
            MatFileReader matFileReader = new MatFileReader("/Users/student/Desktop/日常/combineColumnsFilesDelete/matCNV_New/cnvtcga"+strings[jj].toUpperCase()+".mat");
            double[][] cnvns = getValue(matFileReader, "cnvn");
            double[][] cnvts = getValue(matFileReader, "cnvt");
            for(int i = 0;i<cnvts.length;i++){
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
                    accCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("blca".equals(strings[jj])){
                    blcaCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("brca".equals(strings[jj])){
                    brcaCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("cesc".equals(strings[jj])){
                    cescCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("chol".equals(strings[jj])){
                    cholCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("coad".equals(strings[jj])){
                    coadCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("dlbc".equals(strings[jj])){
                    dlbcCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("esca".equals(strings[jj])){
                    escaCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("gbm".equals(strings[jj])){
                    gbmCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("hnsc".equals(strings[jj])){
                    hnscCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("kich".equals(strings[jj])){
                    kichCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("kirc".equals(strings[jj])){
                    kircCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("kirp".equals(strings[jj])){
                    kirpCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("laml".equals(strings[jj])){
                    lamlCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("lgg".equals(strings[jj])){
                    lggCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("lihc".equals(strings[jj])){
                    lihcCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("luad".equals(strings[jj])){
                    luadCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("lusc".equals(strings[jj])){
                    luscCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("meso".equals(strings[jj])){
                    mesoCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("ov".equals(strings[jj])){
                    ovCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("paad".equals(strings[jj])){
                    paadCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("pcpg".equals(strings[jj])){
                    pcpgCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("prad".equals(strings[jj])){
                    pradCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("read".equals(strings[jj])){
                    readCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("sarc".equals(strings[jj])){
                    sarcCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("skcm".equals(strings[jj])){
                    skcmCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("stad".equals(strings[jj])){
                    stadCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("tgct".equals(strings[jj])){
                    tgctCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("thca".equals(strings[jj])){
                    thcaCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("thym".equals(strings[jj])){
                    thymCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("ucec".equals(strings[jj])){
                    ucecCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else if("ucs".equals(strings[jj])){
                    ucsCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }else {
                    uvmCNewMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo."+ StringUtils.initcap(strings[jj]) +"CNew"), value));
                }
            }
        }
    }
}