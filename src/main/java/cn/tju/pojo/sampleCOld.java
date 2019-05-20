package cn.tju.pojo;

public class sampleCOld {
    private String cancerName;

    private String sampleIdN;

    private String sampleIdT;

    public sampleCOld(String cancerName, String sampleIdN, String sampleIdT) {
        this.cancerName = cancerName;
        this.sampleIdN = sampleIdN;
        this.sampleIdT = sampleIdT;
    }

    public sampleCOld() {
        super();
    }

    public String getCancerName() {
        return cancerName;
    }

    public void setCancerName(String cancerName) {
        this.cancerName = cancerName == null ? null : cancerName.trim();
    }

    public String getSampleIdN() {
        return sampleIdN;
    }

    public void setSampleIdN(String sampleIdN) {
        this.sampleIdN = sampleIdN == null ? null : sampleIdN.trim();
    }

    public String getSampleIdT() {
        return sampleIdT;
    }

    public void setSampleIdT(String sampleIdT) {
        this.sampleIdT = sampleIdT == null ? null : sampleIdT.trim();
    }
}