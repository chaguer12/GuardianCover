package app.entity;

import jakarta.persistence.Entity;

@Entity(name = "healthInsurances")
public class HealthInsurance extends Insurance{
    private int age;
    private String healthState;
    private boolean is_premium;

    public HealthInsurance(double base, String attachment,User user,int age, String healthState,boolean is_premium){
        super(base,attachment,user);
        this.age = age;
        this.healthState = healthState;
        this.is_premium = is_premium;

    }
    public HealthInsurance(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealthState() {
        return healthState;
    }

    public void setHealthState(String healthState) {
        this.healthState = healthState;
    }

    public boolean isIs_premium() {
        return is_premium;
    }

    public void setIs_premium(boolean is_premium) {
        this.is_premium = is_premium;
    }
}
