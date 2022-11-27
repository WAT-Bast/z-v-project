package project.z_v.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ManagerResponseDto {

    private String hospital;
    private double grade;
    private int reviewCount;
    private String image_information;
}
