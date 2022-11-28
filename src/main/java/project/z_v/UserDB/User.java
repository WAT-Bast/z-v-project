package project.z_v.UserDB;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor

public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long user_number;
    private String userId;
    private String user_PW;
    private String user_name;
    private String user_email;
    private String animal;
    private String Area;



    public User(String userId, String user_PW, String user_name, String user_email, String animal, String Area) {
        this.userId = userId;
        this.user_PW = user_PW;
        this.user_name = user_name;
        this.user_email= user_email;
        this.animal = animal;
        this.Area = Area;
    }


}
