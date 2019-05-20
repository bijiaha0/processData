package cn.tju.pojo;

public class SarcCNew {
    private Integer geneId;

    private String valueNL;

    private String valueNY;

    private String valueTL;

    private String valueTY;

    public SarcCNew(Integer geneId, String valueNL, String valueNY, String valueTL, String valueTY) {
        this.geneId = geneId;
        this.valueNL = valueNL;
        this.valueNY = valueNY;
        this.valueTL = valueTL;
        this.valueTY = valueTY;
    }

    public SarcCNew() {
        super();
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public String getValueNL() {
        return valueNL;
    }

    public void setValueNL(String valueNL) {
        this.valueNL = valueNL == null ? null : valueNL.trim();
    }

    public String getValueNY() {
        return valueNY;
    }

    public void setValueNY(String valueNY) {
        this.valueNY = valueNY == null ? null : valueNY.trim();
    }

    public String getValueTL() {
        return valueTL;
    }

    public void setValueTL(String valueTL) {
        this.valueTL = valueTL == null ? null : valueTL.trim();
    }

    public String getValueTY() {
        return valueTY;
    }

    public void setValueTY(String valueTY) {
        this.valueTY = valueTY == null ? null : valueTY.trim();
    }
}