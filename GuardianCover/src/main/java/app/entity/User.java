package app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String tel;
    private String password;
    private String address;

    public User(String firstName,String lastName,String email,String tel,String password,String address){
        this.firstName = firstName;
        this.lastName= lastName;
        this.email= email;
        this.tel = tel;
        this.password = password;
        this.address = address;
    }
    public User(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
