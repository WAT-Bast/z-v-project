package project.z_v.manager.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.z_v.manager.dto.ManagerResponseDto;
import project.z_v.manager.dto.managerDto;
import project.z_v.manager.entity.managerEntity;
import project.z_v.manager.repository.managerRepository;
import project.z_v.reviewDB.Review;
import project.z_v.reviewDB.dto.ReviewRequestDto;
import project.z_v.reviewDB.repository.ReviewRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class managerController {

   private final managerRepository managerRepository;
   private final ReviewRepository reviewRepository;

    @PostMapping("/test")
    public String manager(managerDto dto, Model model) {
        managerEntity entity = dto.toManagerEntity();
        managerRepository.save(entity);
        model.addAttribute("manager", entity);
        return "hospital_information";
    }


    @GetMapping("/hospitial-list")
    public String hospitialList(Model model) {
        List<managerEntity> managerEntityList = managerRepository.findAll();
        List<ManagerResponseDto> managerResponseDtos = new ArrayList<>();
        for (managerEntity managerEntity : managerEntityList) {
            double grade = 0.0;
            List<Review> reviewList = reviewRepository.findAllByManagerEntity(managerEntity);
            for (Review review : reviewList) {
                grade += review.getGrade();
            }
            ManagerResponseDto managerResponseDto = new ManagerResponseDto(managerEntity.getHosptial_name(), grade/reviewList.size(), reviewList.size(), managerEntity.getImage_information());
            managerResponseDtos.add(managerResponseDto);
        }
        model.addAttribute("hospitial", managerResponseDtos);

        return "allPage";
    }


    @PostMapping("{id}")
    public String review(@PathVariable Long id, ReviewRequestDto reviewRequestDto, Model model) {
        managerEntity managerEntity = managerRepository.findById(id).orElse(null);
        Review review = reviewRepository.save(new Review(reviewRequestDto.getGrade(), reviewRequestDto.getReviewContent(), managerEntity));
        model.addAttribute("review", review);
        return "hospital_information";
    }

}
