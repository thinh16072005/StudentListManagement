package model;

public class ITStudent extends Student {
    private double javaScore;
    private double cssScore;
    

    public ITStudent(String id, String fullName, Address address, double javaScore, double cssScore) {
        super(id, fullName, address);
        this.javaScore = javaScore;
        this.cssScore = cssScore;
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

    public double calculateItAvgScore(double javaScore, double cssScore) {
        return (3 * javaScore + cssScore) / 4;
    }
}
