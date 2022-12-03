package project.z_v.manager.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
//<!--import org.springframework.web.bind.annotation.*;-->
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

//<!--import java.awt.print.Pageable;-->
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/test/{id}")
    public String manager(@PathVariable Long id, Model model) {
        managerEntity managerEntity = managerRepository.findById(id).orElse(null);
        model.addAttribute("manager", managerEntity);
        return "hospital_information";
    }


    @GetMapping("/hospital-list")
    public String hospitialList(Model model) {
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

    /*@GetMapping("{id}")
    public String hospitialList(@PathVariable long id, Model model) {
        managerEntity managerEntity = (project.z_v.manager.entity.managerEntity) managerRepository.findAll();
        model.addAttribute("managerEntity", managerEntity);
        return "hospital_information";
    }


    <!--@Repository
    public class ItemRepository {
        private final Map<Long, managerEntity> store = new HashMap<>();
        private static long sequence = 0L;-->
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


        public managerEntity save(managerEntity item){
            item.setId(++sequence);
            store.put(item.getId(), item);
            return item;
        }

        public managerEntity findById(Long itemId){
            return store.get(itemId);
        }

        public List<managerEntity> findAll(){
            return new ArrayList<>(store.values());
        }
    }*/
}
