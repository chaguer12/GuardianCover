package app.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "insurances")
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;
    protected double base;
    protected String attachment;
    protected boolean is_accepted = false;
    @ManyToOne
    @JoinColumn(name = "user_id")
    protected User user;



    public Insurance(double base,String attachment, User user){
        this.base = base;
        this.attachment = attachment;
        this.user = user;

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
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
