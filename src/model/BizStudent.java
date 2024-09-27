package model;

public class BizStudent extends Student {
    private double accounting;
    private double marketing;
    private double bizAvgScore;

    public BizStudent() {
    }

    public BizStudent(String id, String fullName, Address address, double accounting, double marketing, double bizAvgScore) {
        super(id, fullName, address);
        this.accounting = accounting;
        this.marketing = marketing;
        setBizAvgScore(bizAvgScore);
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

    public double getBizAvgScore() {
        return bizAvgScore;
    }

    public void setBizAvgScore(double bizAvgScore) {
        bizAvgScore = (accounting * 2 + marketing) / 3;
        this.bizAvgScore = bizAvgScore;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-50s %-10.2f %-10.2f %-10.2f", getId(), getFullName(), getAddress(), accounting, marketing, getBizAvgScore());
    }


}
