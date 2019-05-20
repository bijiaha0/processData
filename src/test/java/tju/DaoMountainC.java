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
 * Time: 9:20 AM
 * Email: clickgwas@gmail.com
 */

public class DaoMountainC extends TestBase{
    @Autowired
    private cNLNewMoutainMapper cNLNewMoutainMapper;
    @Autowired
    private cNLOldMoutainMapper cNLOldMoutainMapper;
    @Autowired
    private cNYNewMoutainMapper cNYNewMoutainMapper;
    @Autowired
    private cNYOldMoutainMapper cNYOldMoutainMapper;
    @Autowired
    private cTLNewMoutainMapper cTLNewMoutainMapper;
    @Autowired
    private cTLOldMoutainMapper cTLOldMoutainMapper;
    @Autowired
    private cTYNewMoutainMapper cTYNewMoutainMapper;
    @Autowired
    private cTYOldMoutainMapper cTYOldMoutainMapper;




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
        cNLNewMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.cNLNewMoutain"),valueNL));
        cNYNewMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.cNYNewMoutain"),valueNY));
        cTLNewMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.cTLNewMoutain"),valueTL));
        cTYNewMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.cTYNewMoutain"),valueTY));

    }
    //插入OldMoutain
    public void adapterInsertOld(Object pojo, String cancerName,int id) throws IllegalAccessException, ClassNotFoundException {
        HashMap<String, HashMap<String, Double>> stringHashMapHashMap = readAttributeValue(pojo);

        String valueNL = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueNL").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueNL").get("mean");
        String valueNY = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueNY").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueNY").get("mean");
        String valueTL = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueTL").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueTL").get("mean");
        String valueTY = "id:"+id+"|"+"geneId:"+stringHashMapHashMap.get("geneId").get("geneId").intValue()+"|"+"cancerName:"+cancerName+"|"+"mid:"+stringHashMapHashMap.get("valueTY").get("median")+"|"+"mean:"+stringHashMapHashMap.get("valueTY").get("mean");
        //需补充
        cNLOldMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.cNLOldMoutain"),valueNL));
        cNYOldMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.cNYOldMoutain"),valueNY));
        cTLOldMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.cTLOldMoutain"),valueTL));
        cTYOldMoutainMapper.insert(ClassInstanceFactory.create(Class.forName("cn.tju.pojo.cTYOldMoutain"),valueTY));
    }

    @Test
    public void selectInsertNew() throws IllegalAccessException, ClassNotFoundException {
        String[] strings = new String[]{"acc","blca","brca","cesc","chol","coad","dlbc","esca","gbm","hnsc","kich","kirc","kirp","laml","lgg",
                "lihc","luad","lusc","meso","ov","paad","pcpg","prad","read","sarc","skcm","stad","tgct","thca","thym","ucec","ucs","uvm"};
        int id = 1 ;
        int geneLength = 14569;
        for(int k = 0; k < strings.length; k++){
            String cancerName = strings[k];
            if("acc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    AccCNew accCNew = accCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(accCNew,cancerName,id);
                    id++;
                }
            }else if("blca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    BlcaCNew blcaCNew = blcaCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(blcaCNew,cancerName,id);
                    id++;
                }
            }else if("brca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    BrcaCNew brcaCNew = brcaCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(brcaCNew,cancerName,id);
                    id++;
                }
            }else if("cesc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CescCNew cescCNew = cescCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(cescCNew,cancerName,id);
                    id++;
                }
            }else if("chol".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CholCNew cholCNew = cholCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(cholCNew,cancerName,id);
                    id++;
                }
            }else if("coad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CoadCNew coadCNew = coadCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(coadCNew,cancerName,id);
                    id++;
                }
            }else if("dlbc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    DlbcCNew dlbcCNew = dlbcCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(dlbcCNew,cancerName,id);
                    id++;
                }
            }else if("esca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    EscaCNew escaCNew = escaCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(escaCNew,cancerName,id);
                    id++;
                }
            }else if("gbm".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    GbmCNew gbmCNew = gbmCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(gbmCNew,cancerName,id);
                    id++;
                }
            }else if("hnsc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    HnscCNew hnscCNew = hnscCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(hnscCNew,cancerName,id);
                    id++;
                }
            }else if("kich".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KichCNew kichCNew = kichCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(kichCNew,cancerName,id);
                    id++;
                }
            }else if("kirc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KircCNew kircCNew = kircCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(kircCNew,cancerName,id);
                    id++;
                }
            }else if("kirp".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KirpCNew kirpCNew = kirpCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(kirpCNew,cancerName,id);
                    id++;
                }
            }else if("laml".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LamlCNew lamlCNew = lamlCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(lamlCNew,cancerName,id);
                    id++;
                }
            }else if("lgg".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LggCNew lggCNew = lggCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(lggCNew,cancerName,id);
                    id++;
                }
            }else if("lihc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LihcCNew lihcCNew = lihcCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(lihcCNew,cancerName,id);
                    id++;
                }
            }else if("luad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LuadCNew luadCNew = luadCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(luadCNew,cancerName,id);
                    id++;
                }
            }else if("lusc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LuscCNew luscCNew = luscCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(luscCNew,cancerName,id);
                    id++;
                }
            }else if("meso".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    MesoCNew mesoCNew = mesoCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(mesoCNew,cancerName,id);
                    id++;
                }
            }else if("ov".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    OvCNew ovCNew = ovCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(ovCNew,cancerName,id);
                    id++;
                }
            }else if("paad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PaadCNew paadCNew = paadCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(paadCNew,cancerName,id);
                    id++;
                }
            }else if("pcpg".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PcpgCNew pcpgCNew = pcpgCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(pcpgCNew,cancerName,id);
                    id++;
                }
            }else if("prad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PradCNew pradCNew = pradCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(pradCNew,cancerName,id);
                    id++;
                }
            }else if("read".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ReadCNew readCNew = readCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(readCNew,cancerName,id);
                    id++;
                }
            }else if("sarc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    SarcCNew sarcCNew = sarcCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(sarcCNew,cancerName,id);
                    id++;
                }
            }else if("skcm".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    SkcmCNew skcmCNew = skcmCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(skcmCNew,cancerName,id);
                    id++;
                }
            }else if("stad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    StadCNew stadCNew = stadCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(stadCNew,cancerName,id);
                    id++;
                }
            }else if("tgct".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    TgctCNew tgctCNew = tgctCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(tgctCNew,cancerName,id);
                    id++;
                }
            }else if("thca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ThcaCNew thcaCNew = thcaCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(thcaCNew,cancerName,id);
                    id++;
                }
            }else if("thym".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ThymCNew thymCNew = thymCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(thymCNew,cancerName,id);
                    id++;
                }
            }else if("ucec".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    UcecCNew ucecCNew = ucecCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(ucecCNew,cancerName,id);
                    id++;
                }
            }else if("ucs".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    UcsCNew ucsCNew = ucsCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(ucsCNew,cancerName,id);
                    id++;
                }
            }else {
                for(int j = 1; j <= geneLength; j++){
                    UvmCNew uvmCNew = uvmCNewMapper.selectByPrimaryKey(j);
                    adapterInsertNew(uvmCNew,cancerName,id);
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
        int geneLength = 24702;
        for(int k = 0; k < strings.length; k++){
            String cancerName = strings[k];
            if("acc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    AccCOld accCOld = accCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(accCOld,cancerName,id);
                    id++;
                }
            }else if("blca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    BlcaCOld blcaCOld = blcaCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(blcaCOld,cancerName,id);
                    id++;
                }
            }else if("brca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    BrcaCOld brcaCOld = brcaCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(brcaCOld,cancerName,id);
                    id++;
                }
            }else if("cesc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CescCOld cescCOld = cescCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(cescCOld,cancerName,id);
                    id++;
                }
            }else if("chol".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CholCOld cholCOld = cholCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(cholCOld,cancerName,id);
                    id++;
                }
            }else if("coad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    CoadCOld coadCOld = coadCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(coadCOld,cancerName,id);
                    id++;
                }
            }else if("dlbc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    DlbcCOld dlbcCOld = dlbcCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(dlbcCOld,cancerName,id);
                    id++;
                }
            }else if("esca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    EscaCOld escaCOld = escaCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(escaCOld,cancerName,id);
                    id++;
                }
            }else if("gbm".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    GbmCOld gbmCOld = gbmCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(gbmCOld,cancerName,id);
                    id++;
                }
            }else if("hnsc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    HnscCOld hnscCOld = hnscCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(hnscCOld,cancerName,id);
                    id++;
                }
            }else if("kich".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KichCOld kichCOld = kichCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(kichCOld,cancerName,id);
                    id++;
                }
            }else if("kirc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KircCOld kircCOld = kircCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(kircCOld,cancerName,id);
                    id++;
                }
            }else if("kirp".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    KirpCOld kirpCOld = kirpCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(kirpCOld,cancerName,id);
                    id++;
                }
            }else if("laml".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LamlCOld lamlCOld = lamlCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(lamlCOld,cancerName,id);
                    id++;
                }
            }else if("lgg".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LggCOld lggCOld = lggCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(lggCOld,cancerName,id);
                    id++;
                }
            }else if("lihc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LihcCOld lihcCOld = lihcCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(lihcCOld,cancerName,id);
                    id++;
                }
            }else if("luad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LuadCOld luadCOld = luadCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(luadCOld,cancerName,id);
                    id++;
                }
            }else if("lusc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    LuscCOld luscCOld = luscCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(luscCOld,cancerName,id);
                    id++;
                }
            }else if("meso".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    MesoCOld mesoCOld = mesoCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(mesoCOld,cancerName,id);
                    id++;
                }
            }else if("ov".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    OvCOld ovCOld = ovCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(ovCOld,cancerName,id);
                    id++;
                }
            }else if("paad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PaadCOld paadCOld = paadCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(paadCOld,cancerName,id);
                    id++;
                }
            }else if("pcpg".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PcpgCOld pcpgCOld = pcpgCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(pcpgCOld,cancerName,id);
                    id++;
                }
            }else if("prad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    PradCOld pradCOld = pradCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(pradCOld,cancerName,id);
                    id++;
                }
            }else if("read".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ReadCOld readCOld = readCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(readCOld,cancerName,id);
                    id++;
                }
            }else if("sarc".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    SarcCOld sarcCOld = sarcCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(sarcCOld,cancerName,id);
                    id++;
                }
            }else if("skcm".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    SkcmCOld skcmCOld = skcmCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(skcmCOld,cancerName,id);
                    id++;
                }
            }else if("stad".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    StadCOld stadCOld = stadCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(stadCOld,cancerName,id);
                    id++;
                }
            }else if("tgct".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    TgctCOld tgctCOld = tgctCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(tgctCOld,cancerName,id);
                    id++;
                }
            }else if("thca".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ThcaCOld thcaCOld = thcaCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(thcaCOld,cancerName,id);
                    id++;
                }
            }else if("thym".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    ThymCOld thymCOld = thymCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(thymCOld,cancerName,id);
                    id++;
                }
            }else if("ucec".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    UcecCOld ucecCOld = ucecCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(ucecCOld,cancerName,id);
                    id++;
                }
            }else if("ucs".equals(cancerName)){
                for(int j = 1; j <= geneLength; j++){
                    UcsCOld ucsCOld = ucsCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(ucsCOld,cancerName,id);
                    id++;
                }
            }else {
                for(int j = 1; j <= geneLength; j++){
                    UvmCOld uvmCOld = uvmCOldMapper.selectByPrimaryKey(j);
                    adapterInsertOld(uvmCOld,cancerName,id);
                    id++;
                }
            }
        }
    }
}
