package cn.tju.vo;
import java.io.Serializable;
public class CMountain implements Serializable {
    private Integer id;
    private String chr;
    private String cancerName;
    private String NL;
    private String NY;
    private String TL;
    private String TY;
    public CMountain() {
    }
    public CMountain(Integer id, String chr, String cancerName, String NL, String NY, String TL, String TY) {
        this.id = id;
        this.chr = chr;
        this.cancerName = cancerName;
        this.NL = NL;
        this.NY = NY;
        this.TL = TL;
        this.TY = TY;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getChr() {
        return chr;
    }
    public void setChr(String chr) {
        this.chr = chr;
    }
    public String getCancerName() {
        return cancerName;
    }
    public void setCancerName(String cancerName) {
        this.cancerName = cancerName;
    }
    public String getNL() {
        return NL;
    }
    public void setNL(String NL) {
        this.NL = NL;
    }
    public String getNY() {
        return NY;
    }
    public void setNY(String NY) {
        this.NY = NY;
    }
    public String getTL() {
        return TL;
    }
    public void setTL(String TL) {
        this.TL = TL;
    }
    public String getTY() {
        return TY;
    }
    public void setTY(String TY) {
        this.TY = TY;
    }
    @Override
    public String toString() {
        return "CMountain{" +
                "id=" + id +
                ", chr='" + chr + '\'' +
                ", cancerName='" + cancerName + '\'' +
                ", NL='" + NL + '\'' +
                ", NY='" + NY + '\'' +
                ", TL='" + TL + '\'' +
                ", TY='" + TY + '\'' +
                '}';
    }
}
