package project.z_v.reviewDB.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
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
        private Long Review_number;
        private Double Grade;
        private String Review_message;
        private LocalDateTime Review_create_day;
    }
}
