package app.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "insurances")
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;
    protected double base;
    protected String attachment;
    protected boolean is_accepted = false;

    public Insurance(double base,String attachment){
        this.base = base;
        this.attachment = attachment;

    }
    public Insurance(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public boolean isIs_accepted() {
        return is_accepted;
    }

    public void setIs_accepted(boolean is_accepted) {
        this.is_accepted = is_accepted;
    }
}
