package project.z_v.reviewDB.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;
import project.z_v.UserDB.User;
import project.z_v.manager.dto.managerDto;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class HospitalReviewResponse {

    private managerDto managerDto;
    private ReviewResponse reviewResponse;



    @AllArgsConstructor
    @Getter
    public static class ReviewResponse {
        private Long reviewNumber;
        private String reviewContent;
        private String reviewCreateAt;
        private User user;
    }
}
