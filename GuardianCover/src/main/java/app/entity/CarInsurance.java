package app.entity;

import app.entity.enums.CarType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "carInsurances")
public class CarInsurance extends Insurance{
    private int age;
    @Enumerated(EnumType.STRING)
    private CarType carType;
    private boolean is_pro;
    private String carDescription;
    private double price;

    public CarInsurance(double base, String attachment,User user, int age, CarType carType, boolean is_pro, String carDescription, double price) {
        super(base, attachment,user);
        this.age = age;
        this.carType = carType;
        this.is_pro = is_pro;
        this.carDescription = carDescription;
        this.price = price;
    }
    public CarInsurance(){
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public boolean isIs_pro() {
        return is_pro;
    }

    public void setIs_pro(boolean is_pro) {
        this.is_pro = is_pro;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
