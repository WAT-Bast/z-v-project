package project.z_v.UserDB;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

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
    private String userPW;
    private String user_name;
    private String user_email;
    private String animal;
    private String Area;

    private boolean isAdmin;



    public User(String userId, String userPW, String user_name, String user_email, String animal, String Area, Boolean isAdmin) {
        this.userId = userId;
        this.userPW = userPW;
        this.user_name = user_name;
        this.user_email= user_email;
        this.animal = animal;
        this.Area = Area;
        this.isAdmin = isAdmin;
    }


}
