package app.entity;

import app.entity.enums.HouseType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity(name = "houseInsurances")
public class HouseInsurance extends Insurance{
    private double price;
    @Enumerated(EnumType.STRING)
    private HouseType houseType;
    private String location;
    private String security;

    public HouseInsurance(double base, String attachment, double price,HouseType houseType,String location,String security){
        super(base, attachment);
        this.price = price;
        this.houseType = houseType;
        this.location = location;
        this.security = security;


    }
    public HouseInsurance(){
        super();

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }
}
