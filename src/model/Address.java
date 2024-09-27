package model;

public class Address {
    private String country;
    private String city;
    private String district;
    private String street;
    
    public Address() {
    }
    public Address(String country, String city, String district, String street) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    public String getDistrict() {
        return district;
    }
    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", country, city, district, street);
    }

    
}
