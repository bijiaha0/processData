package cn.tju.pojo;

public class eNLNewMoutain {
    private Integer id;

    private Integer geneId;

    private String cancerName;

    private Double mid;

    private Double mean;

    public eNLNewMoutain(Integer id, Integer geneId, String cancerName, Double mid, Double mean) {
        this.id = id;
        this.geneId = geneId;
        this.cancerName = cancerName;
        this.mid = mid;
        this.mean = mean;
    }

    public eNLNewMoutain() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGeneId() {
        return geneId;
    }

    public void setGeneId(Integer geneId) {
        this.geneId = geneId;
    }

    public String getCancerName() {
        return cancerName;
    }

    public void setCancerName(String cancerName) {
        this.cancerName = cancerName == null ? null : cancerName.trim();
    }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }
}