package project.z_v.reviewDB;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.z_v.BaseEntity;
import project.z_v.UserDB.User;
import project.z_v.manager.entity.managerEntity;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Review extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY) //Hospital_number 자동으로 생성
    @Id
    private Long Review_number;
    private Double Grade;
    private String reviewMessage;
    @ManyToOne(fetch = FetchType.LAZY)
    private managerEntity managerEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

/*    @ManyToOne(fetch = FetchType.LAZY) => 회원
    private Users Users;*/

    public Review(Double grade, String reviewMessage, project.z_v.manager.entity.managerEntity managerEntity, User user) {
        Grade = grade;
        this.reviewMessage = reviewMessage;
        this.managerEntity = managerEntity;
        this.user = user;
    }
}