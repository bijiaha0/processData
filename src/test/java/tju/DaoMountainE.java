package tju;

import cn.tju.dao.*;
import cn.tju.pojo.*;
import cn.tju.util.ClassInstanceFactory;
import cn.tju.util.DataStatisticsUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.HashMap;
/**
 * Author: bijiaha0
 * Date: 2018-12-02
 * Time: 2:59 PM
 * Email: clickgwas@gmail.com
 */
public class DaoMountainE extends TestBase{
    @Autowired
    private eNLNewMoutainMapper eNLNewMoutainMapper;
    @Autowired
    private eNLOldMoutainMapper eNLOldMoutainMapper;
    @Autowired
    private eNYNewMoutainMapper eNYNewMoutainMapper;
    @Autowired
    private eNYOldMoutainMapper eNYOldMoutainMapper;
    @Autowired
    private eTLNewMoutainMapper eTLNewMoutainMapper;
    @Autowired
    private eTLOldMoutainMapper eTLOldMoutainMapper;
    @Autowired
    private eTYNewMoutainMapper eTYNewMoutainMapper;
    @Autowired
    private eTYOldMoutainMapper eTYOldMoutainMapper;

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


    public static double[] productDoubleArray(String[] value){
        double[] doublesValue = new double[value.length];
        for(int l = 0 ; l < value.length; l++){
            doublesValue[l]=Double.parseDouble(value[l]);
        }
        return doublesValue;
    }
    /*
     * 读取属性值,得到mean和value
     * */
    public static HashMap<String, HashMap<String,Double>> readAttributeValue(Object obj) throws IllegalAccessException {
        HashMap<String, HashMap<String,Double>> result = new HashMap<>();
        //得到class
        Class cls = obj.getClass();
        //得到所有属性
        Field[] fields = cls.getDeclaredFields();
        for (int i=0;i<fields.length;i++){//遍历
            //得到属性
            Field field = fields[i];
            //打开私有访问
            field.setAccessible(true);
            //获取属性
            String name = field.getName();
            //获得基因Id
            if(name.equals("geneId")){
                HashMap<String, Double> geneIdValue = new HashMap<>();
                geneIdValue.put("geneId",Double.valueOf(field.get(obj).toString()));
                result.put(name,geneIdValue);
            }else {
                Double mean = null;
                Double median = null;

                HashMap<String, Double> meanMedainValue = new HashMap<>();
                //获取其他属性值
                if(field.get(obj) != null && name.indexOf("value") != -1){

                    String value = (String)field.get(obj);
                    //分割
                    String[] valueArray = value.split(" ");
                    //String数组转double数组
                    double[] doublesArray = productDoubleArray(valueArray);
                    //求平均值
                    mean = DataStatisticsUtils.getMean(doublesArray);
                    //求中位数
                    median = DataStatisticsUtils.getMedian(doublesArray);
                }
                meanMedainValue.put("mean",mean);
                meanMedainValue.put("median",median);
                result.put(name,meanMedainValue);
            }
        }
        return result;
    }

    //插入NewMoutain
    public void adapterInsertNew(Object pojo, String cancerName,int id) throws IllegalAccessException, ClassNotFoundException {
        HashMap<String, HashMap<String, Double>> stringHashMapHashMap = readAttributeValue(pojo);

        String valueNL = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueNL").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueNL").get("mean");
        String valueNY = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueNY").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueNY").get("mean");
        String valueTL = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueTL").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueTL").get("mean");
        String valueTY = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueTY").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueTY").get("mean");
        //需补充
        eNLNewMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.eNLNewMoutain"),valueNL));
        eNYNewMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.eNYNewMoutain"),valueNY));
        eTLNewMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.eTLNewMoutain"),valueTL));
        eTYNewMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.eTYNewMoutain"),valueTY));

    }
    //插入OldMoutain
    public void adapterInsertOld(Object pojo, String cancerName,int id) throws IllegalAccessException, ClassNotFoundException {
        HashMap<String, HashMap<String, Double>> stringHashMapHashMap = readAttributeValue(pojo);

        String valueNL = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueNL").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueNL").get("mean");
        String valueNY = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueNY").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueNY").get("mean");
        String valueTL = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueTL").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueTL").get("mean");
        String valueTY = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueTY").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueTY").get("mean");
        //需补充
        eNLOldMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.eNLOldMoutain"),valueNL));
        eNYOldMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.eNYOldMoutain"),valueNY));
        eTLOldMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.eTLOldMoutain"),valueTL));
        eTYOldMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.eTYOldMoutain"),valueTY));
    }

    @Test
    public void selectInsertNew() throws IllegalAccessException, ClassNotFoundException {
        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};
        int id = 1 ;
        int geneLength = 60446;
        for(int k = 0; k < strings.length; k++){
            String cancerName = strings[k];
            if("acc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    AccENew accENew = accENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(accENew,cancerName,id);
                    id++;
                }
            }else if("blca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    BlcaENew blcaENew = blcaENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(blcaENew,cancerName,id);
                    id++;
                }
            }else if("brca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    BrcaENew brcaENew = brcaENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(brcaENew,cancerName,id);
                    id++;
                }
            }else if("cesc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CescENew cescENew = cescENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(cescENew,cancerName,id);
                    id++;
                }
            }else if("chol".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CholENew cholENew = cholENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(cholENew,cancerName,id);
                    id++;
                }
            }else if("coad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CoadENew coadENew = coadENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(coadENew,cancerName,id);
                    id++;
                }
            }else if("dlbc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    DlbcENew dlbcENew = dlbcENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(dlbcENew,cancerName,id);
                    id++;
                }
            }else if("esca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    EscaENew escaENew = escaENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(escaENew,cancerName,id);
                    id++;
                }
            }else if("gbm".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    GbmENew gbmENew = gbmENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(gbmENew,cancerName,id);
                    id++;
                }
            }else if("hnsc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    HnscENew hnscENew = hnscENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(hnscENew,cancerName,id);
                    id++;
                }
            }else if("kich".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KichENew kichENew = kichENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(kichENew,cancerName,id);
                    id++;
                }
            }else if("kirc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KircENew kircENew = kircENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(kircENew,cancerName,id);
                    id++;
                }
            }else if("kirp".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KirpENew kirpENew = kirpENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(kirpENew,cancerName,id);
                    id++;
                }
            }else if("laml".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LamlENew lamlENew = lamlENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(lamlENew,cancerName,id);
                    id++;
                }
            }else if("lgg".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LggENew lggENew = lggENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(lggENew,cancerName,id);
                    id++;
                }
            }else if("lihc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LihcENew lihcENew = lihcENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(lihcENew,cancerName,id);
                    id++;
                }
            }else if("luad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LuadENew luadENew = luadENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(luadENew,cancerName,id);
                    id++;
                }
            }else if("lusc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LuscENew luscENew = luscENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(luscENew,cancerName,id);
                    id++;
                }
            }else if("meso".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    MesoENew mesoENew = mesoENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(mesoENew,cancerName,id);
                    id++;
                }
            }else if("ov".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    OvENew ovENew = ovENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(ovENew,cancerName,id);
                    id++;
                }
            }else if("paad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PaadENew paadENew = paadENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(paadENew,cancerName,id);
                    id++;
                }
            }else if("pcpg".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PcpgENew pcpgENew = pcpgENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(pcpgENew,cancerName,id);
                    id++;
                }
            }else if("prad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PradENew pradENew = pradENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(pradENew,cancerName,id);
                    id++;
                }
            }else if("read".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ReadENew readENew = readENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(readENew,cancerName,id);
                    id++;
                }
            }else if("sarc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    SarcENew sarcENew = sarcENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(sarcENew,cancerName,id);
                    id++;
                }
            }else if("skcm".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    SkcmENew skcmENew = skcmENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(skcmENew,cancerName,id);
                    id++;
                }
            }else if("stad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    StadENew stadENew = stadENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(stadENew,cancerName,id);
                    id++;
                }
            }else if("tgct".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    TgctENew tgctENew = tgctENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(tgctENew,cancerName,id);
                    id++;
                }
            }else if("thca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ThcaENew thcaENew = thcaENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(thcaENew,cancerName,id);
                    id++;
                }
            }else if("thym".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ThymENew thymENew = thymENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(thymENew,cancerName,id);
                    id++;
                }
            }else if("ucec".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    UcecENew ucecENew = ucecENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(ucecENew,cancerName,id);
                    id++;
                }
            }else if("ucs".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    UcsENew ucsENew = ucsENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(ucsENew,cancerName,id);
                    id++;
                }
            }else {
                for(int j = 1; j <= geneLength; j++){
                    UvmENew uvmENew = uvmENewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(uvmENew,cancerName,id);
                    id++;
                }
            }
        }
    }

    @Test
    public void selectInsertOld() throws IllegalAccessException, ClassNotFoundException {
        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};
        int id = 1 ;
        int geneLength = 20439;
        for(int k = 0; k < strings.length; k++){
            String cancerName = strings[k];
            if("acc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    AccEOld accEOld = accEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(accEOld,cancerName,id);
                    id++;
                }
            }else if("blca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    BlcaEOld blcaEOld = blcaEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(blcaEOld,cancerName,id);
                    id++;
                }
            }else if("brca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    BrcaEOld brcaEOld = brcaEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(brcaEOld,cancerName,id);
                    id++;
                }
            }else if("cesc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CescEOld cescEOld = cescEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(cescEOld,cancerName,id);
                    id++;
                }
            }else if("chol".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CholEOld cholEOld = cholEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(cholEOld,cancerName,id);
                    id++;
                }
            }else if("coad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CoadEOld coadEOld = coadEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(coadEOld,cancerName,id);
                    id++;
                }
            }else if("dlbc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    DlbcEOld dlbcEOld = dlbcEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(dlbcEOld,cancerName,id);
                    id++;
                }
            }else if("esca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    EscaEOld escaEOld = escaEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(escaEOld,cancerName,id);
                    id++;
                }
            }else if("gbm".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    GbmEOld gbmEOld = gbmEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(gbmEOld,cancerName,id);
                    id++;
                }
            }else if("hnsc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    HnscEOld hnscEOld = hnscEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(hnscEOld,cancerName,id);
                    id++;
                }
            }else if("kich".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KichEOld kichEOld = kichEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(kichEOld,cancerName,id);
                    id++;
                }
            }else if("kirc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KircEOld kircEOld = kircEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(kircEOld,cancerName,id);
                    id++;
                }
            }else if("kirp".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KirpEOld kirpEOld = kirpEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(kirpEOld,cancerName,id);
                    id++;
                }
            }else if("laml".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LamlEOld lamlEOld = lamlEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(lamlEOld,cancerName,id);
                    id++;
                }
            }else if("lgg".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LggEOld lggEOld = lggEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(lggEOld,cancerName,id);
                    id++;
                }
            }else if("lihc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LihcEOld lihcEOld = lihcEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(lihcEOld,cancerName,id);
                    id++;
                }
            }else if("luad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LuadEOld luadEOld = luadEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(luadEOld,cancerName,id);
                    id++;
                }
            }else if("lusc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LuscEOld luscEOld = luscEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(luscEOld,cancerName,id);
                    id++;
                }
            }else if("meso".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    MesoEOld mesoEOld = mesoEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(mesoEOld,cancerName,id);
                    id++;
                }
            }else if("ov".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    OvEOld ovEOld = ovEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(ovEOld,cancerName,id);
                    id++;
                }
            }else if("paad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PaadEOld paadEOld = paadEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(paadEOld,cancerName,id);
                    id++;
                }
            }else if("pcpg".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PcpgEOld pcpgEOld = pcpgEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(pcpgEOld,cancerName,id);
                    id++;
                }
            }else if("prad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PradEOld pradEOld = pradEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(pradEOld,cancerName,id);
                    id++;
                }
            }else if("read".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ReadEOld readEOld = readEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(readEOld,cancerName,id);
                    id++;
                }
            }else if("sarc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    SarcEOld sarcEOld = sarcEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(sarcEOld,cancerName,id);
                    id++;
                }
            }else if("skcm".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    SkcmEOld skcmEOld = skcmEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(skcmEOld,cancerName,id);
                    id++;
                }
            }else if("stad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    StadEOld stadEOld = stadEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(stadEOld,cancerName,id);
                    id++;
                }
            }else if("tgct".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    TgctEOld tgctEOld = tgctEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(tgctEOld,cancerName,id);
                    id++;
                }
            }else if("thca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ThcaEOld thcaEOld = thcaEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(thcaEOld,cancerName,id);
                    id++;
                }
            }else if("thym".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ThymEOld thymEOld = thymEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(thymEOld,cancerName,id);
                    id++;
                }
            }else if("ucec".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    UcecEOld ucecEOld = ucecEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(ucecEOld,cancerName,id);
                    id++;
                }
            }else if("ucs".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    UcsEOld ucsEOld = ucsEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(ucsEOld,cancerName,id);
                    id++;
                }
            }else {
                for(int j = 1; j <= geneLength; j++){
                    UvmEOld uvmEOld = uvmEOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(uvmEOld,cancerName,id);
                    id++;
                }
            }
        }
    }
}
