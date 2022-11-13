package project.z_v.UserDB;

import javax.persistence.*;

@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long user_number;
    private String user_ID;
    private String user_PW;
    private String user_name;
    private String user_email;
    private String animal;
    private String Area;

    public User(){}

    public User(String user_ID, String user_PW, String user_name, String user_email, String animal, String Area) {
        this.user_ID = user_ID;
        this.user_PW = user_PW;
        this.user_name = user_name;
        this.user_email= user_email;
        this.animal = animal;
        this.Area = Area;
    }

    public Long getId() {
        return user_number;
    }

    public void setId(Long id) {
        this.user_number = id;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getUser_PW() {
        return user_PW;
    }

    public void setUser_PW(String user_PW) {
        this.user_PW = user_PW;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }
}
