package project.z_v.manager.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.z_v.UserDB.User;
import project.z_v.UserDB.repository.UserRepository;
import project.z_v.manager.dto.ManagerResponseDto;
import project.z_v.manager.dto.managerDto;
import project.z_v.manager.entity.managerEntity;
import project.z_v.manager.repository.managerRepository;
import project.z_v.reviewDB.Review;
import project.z_v.reviewDB.dto.ReviewRequestDto;
import project.z_v.reviewDB.repository.ReviewRepository;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class managerController {

    private final managerRepository managerRepository;
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final HttpSession session;

    @GetMapping("/manager")
    public String managerPage() {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/main";
        } else {
            if (user.isAdmin() == false) {
                return "redirect:/main";
            }
        }
        return "Manager";

    }

    @PostMapping("/test")
    public String manager(managerDto dto, Model model) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/main";
        } else {
            if (user.isAdmin() == false) {
                return "redirect:/main";
            }
        }

        managerEntity entity = dto.toManagerEntity();
        managerRepository.save(entity);
        model.addAttribute("manager", entity);
        return "hospital_information";
    }
/*    @PostMapping("/test/{b_no}")
    public String manager(@PathVariable("b_no") int b_no, managerDto dto, Model model) {
        model.addAttribute("test",manager(b_no));
    managerEntity entity = dto.toManagerEntity();
    managerRepository.save(entity);
    model.addAttribute("manager", entity);
    return "hospital_information";
}*/

/*    @RequestMapping("/test/{hospital_number}")
    public String allpage_manager(@PathVariable("hospital_number") Long hospital_number, Model model) {
        model.addAttribute("test", allpage_manager(hospital_number));
        return "hospital_information";
    }*/

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

            ManagerResponseDto managerResponseDto = new ManagerResponseDto(managerEntity.getHospital_number(),managerEntity.getHosptial_name(), grade/reviewList.size(), reviewList.size(), managerEntity.getImage_information());

            /*ManagerResponseDto managerResponseDto = new ManagerResponseDto(managerEntity.getHosptial_name(), grade / reviewList.size(), reviewList.size(), managerEntity.getImage_information());*/
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


//    @GetMapping("/Filter")
//    public String filter(Model model, @PageableDefault(page = 0, size = 10, sort="id", direction = Sort.Direction.DESC)
//            Pageable pageable, String Hospital_address, boolean a_day, boolean Shop_number) {
//
//        Page<managerEntity> list = null;
//
//        if(Hospital_address == null) {
//            list = filterBorder.filter(pageable);
//        }else {
//            list = filterBorder.filterSearchList(Hospital_address, a_day, Shop_number, pageable);
//        }
//        return "/main";
//    }




}
