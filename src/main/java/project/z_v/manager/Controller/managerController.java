package project.z_v.manager.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    /*
        @PostMapping("/test")
        public String manager(managerDto dto, Model model) {
            managerEntity entity = dto.toManagerEntity();
            managerRepository.save(entity);
            model.addAttribute("manager", entity);
            return "hospital_information";
        }*/

    // 글 동록 api or 글 수정 api
    @PostMapping("/test/{id}")
    @Transactional
    public String manager(@PathVariable(required = false) Long id,managerDto dto, Model model) {

        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/main";
        } else {
            if (user.isAdmin() == false) {
                return "redirect:/main";
            }else {
                model.addAttribute("isAdmin",true);
            }
        }
        if(id != null) {
            managerEntity managerEntity = managerRepository.findById(id).orElseThrow(null);
            managerEntity.setADay(dto.isaDay());
            managerEntity.setAreaAddress(dto.getAreaAddress());
            managerEntity.setHospital_address(dto.getHospital_address());
            managerEntity.setHosptial_name(dto.getHosptial_name());
            managerEntity.setImage_information(dto.getImage_information());
            managerEntity.setTell(dto.getTell());
            managerEntity.setLocationlongitude(dto.getLocationlongitude());
            managerEntity.setLocationLatitude(dto.getLocationLatitude());
            managerEntity.setShop_number(dto.isShop_number());
            managerEntity.setTimeFri(dto.getTimeFri());
            managerEntity.setTimeMon(dto.getTimeMon());
            managerEntity.setTimeTues(dto.getTimeTues());
            managerEntity.setTimeWednes(dto.getTimeWednes());
            managerEntity.setTimeThurs(dto.getTimeThurs());
            managerEntity.setTimeSatur(dto.getTimeSatur());
            managerEntity.setTimeSun(dto.getTimeSun());
            managerEntity.setSite(dto.getSite());
            return "redirect:/test/" + managerEntity.getHospital_number();
        }

        managerEntity entity = dto.toManagerEntity();
        managerRepository.save(entity);
        model.addAttribute("manager", entity);
        return "allPage";
    }

    //병원 정보 상세보기
    @GetMapping("/test/{id}")
    public String manager(@PathVariable Long id, Model model) {
        managerEntity managerEntity = managerRepository.findById(id).orElse(null);
        model.addAttribute("manager", managerEntity);
        User user = (User) session.getAttribute("user");
        if(user != null && user.isAdmin() == true) {
            model.addAttribute("isAdmin",true);
        }else {
            model.addAttribute("isAdmin",false);
        }
        return "hospital_information";
    }

    // 병원 전체 보기

   @GetMapping("/hospital-list")
    public String hospitalList(@RequestParam(value = "keyword", required = false) String keyword,Model model) {
       List<managerEntity> managerEntityList = managerRepository.manager(keyword);
       List<ManagerResponseDto> managerResponseDtos = new ArrayList<>();
       for (managerEntity managerEntity : managerEntityList) {
           double grade = 0.0;
           List<Review> reviewList = reviewRepository.findAllByManagerEntity(managerEntity);
           if(reviewList.size() > 0) {
               for (Review review : reviewList) {
                   grade += review.getGrade();
               }
           }
           ManagerResponseDto managerResponseDto = new ManagerResponseDto(managerEntity.getHospital_number(),managerEntity.getHosptial_name(), grade/reviewList.size(), reviewList.size(), managerEntity.getImage_information());
           managerResponseDtos.add(managerResponseDto);
       }

        model.addAttribute("hospitial", managerResponseDtos);
        return "allPage";
    }


    private List<ManagerResponseDto> managerResponseDtos() {
        List<managerEntity> managerEntityList = managerRepository.findAll();
        List<ManagerResponseDto> managerResponseDtos = new ArrayList<>();
        for (managerEntity managerEntity : managerEntityList) {
            double grade = 0.0;
            List<Review> reviewList = reviewRepository.findAllByManagerEntity(managerEntity);
            for (Review review : reviewList) {
                grade += review.getGrade();
            }

            /*<!-- ManagerResponseDto managerResponseDto = new ManagerResponseDto(managerEntity.getHospital_number(), managerEntity.getHosptial_name(), grade / reviewList.size(), reviewList.size(), managerEntity.getImage_information());-->*/

            ManagerResponseDto managerResponseDto = new ManagerResponseDto(managerEntity.getHospital_number(),managerEntity.getHosptial_name(), grade/reviewList.size(), reviewList.size(), managerEntity.getImage_information());

            /*ManagerResponseDto managerResponseDto = new ManagerResponseDto(managerEntity.getHosptial_name(), grade / reviewList.size(), reviewList.size(), managerEntity.getImage_information());*/

            managerResponseDtos.add(managerResponseDto);
        }
        return managerResponseDtos;
    }

    // 병원 정보 삭제하기
    @PostMapping("/hospital/delete/{id}")
    public String deleteHospital(@PathVariable Long id, Model model) {
        managerRepository.deleteById(id);
        model.addAttribute("hospitial", managerResponseDtos());
        return "redirect:/hospital-list";
    }

    //병원 정보 수정할 수 있게 해당 페이지에 들어가주는 api
    @GetMapping("/hospital/{id}")
    public String updateBeforeView(@PathVariable Long id, Model model) {
            managerEntity managerEntity = managerRepository.findById(id).orElse(null);
            model.addAttribute("hospital", managerEntity);
            return "Manager";
    }



    @PostMapping("{id}")
    public String review(@PathVariable Long id, ReviewRequestDto reviewRequestDto, Model model) {
        managerEntity managerEntity = managerRepository.findById(id).orElse(null);
        reviewRepository.save(new Review(reviewRequestDto.getGrade(), reviewRequestDto.getReviewContent(), managerEntity));
        List<Review> reviewList = reviewRepository.findAllByManagerEntity(managerEntity);
        model.addAttribute("reviewList", reviewList);
        return "hospital_information";
    }

}
