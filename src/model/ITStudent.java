package model;

public class ITStudent extends Student {
    private double javaScore;
    private double cssScore;
    private double itAvgScore;
    
    
    public ITStudent() {
    }

    public ITStudent(String id, String fullName, Address address, double javaScore, double cssScore, double itAvgScore) {
        super(id, fullName, address);
        this.javaScore = javaScore;
        this.cssScore = cssScore;
        setItAvgScore(itAvgScore);
    }


    public double getJavaScore() {
        return javaScore;
    }


    public void setJavaScore(double javaScore) {
        this.javaScore = javaScore;
    }


    public double getCssScore() {
        return cssScore;
    }


    public void setCssScore(double cssScore) {
        this.cssScore = cssScore;
    }

    public double getItAvgScore() {
        return itAvgScore;
    }

    public void setItAvgScore(double itAvgScore) {
        itAvgScore = (3 * getJavaScore() + getCssScore()) / 4;
        this.itAvgScore = itAvgScore;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-50s %-10.2f %-10.2f %-10.2f", getId(), getFullName(), getAddress(), javaScore, cssScore, itAvgScore);
    }


}
