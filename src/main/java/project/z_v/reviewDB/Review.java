package project.z_v.reviewDB;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.z_v.BaseEntity;
import project.z_v.manager.entity.managerEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Review extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY) //Hospital_number 자동으로 생성
    @Id
    private Long Review_number;
    private Double Grade;
    private String Review_message;
    @ManyToOne(fetch = FetchType.LAZY)
    private managerEntity managerEntity;

/*    @ManyToOne(fetch = FetchType.LAZY) => 회원
    private Users Users;*/

    public Review(Double grade, String review_message, project.z_v.manager.entity.managerEntity managerEntity) {
        Grade = grade;
        Review_message = review_message;
        this.managerEntity = managerEntity;
    }
}