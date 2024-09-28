package model;

public class Student {
    protected String id;
    protected String fullName;
    protected Address address;

    
    public Student() {
    }


    public Student(String id, String fullName, Address address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isPassed() {
        if (this instanceof ITStudent iTStudent) {
            return iTStudent.getItAvgScore() >= 5;
        } else if (this instanceof BizStudent bizStudent) {
            return bizStudent.getBizAvgScore() >= 5;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-50s", id, fullName, address);
    }

    
}
