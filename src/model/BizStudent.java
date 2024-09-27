package model;

public class BizStudent extends Student {
    private double accounting;
    private double marketing;

    public BizStudent(String id, String fullName, Address address, double accounting, double marketing) {
        super(id, fullName, address);
        this.accounting = accounting;
        this.marketing = marketing;
    }

    public double getAccounting() {
        return accounting;
    }

    public void setAccounting(double accounting) {
        this.accounting = accounting;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public double calculateBizAvgScore(double accounting, double marketing) {
        return (accounting * 2 + marketing) / 3;
    }
}
