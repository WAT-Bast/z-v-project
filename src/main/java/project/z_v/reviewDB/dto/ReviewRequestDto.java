package project.z_v.reviewDB.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ReviewRequestDto {
    private String reviewContent;
    private Double grade;
}
