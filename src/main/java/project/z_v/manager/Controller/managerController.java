package project.z_v.manager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.z_v.manager.dto.managerDto;
import project.z_v.manager.entity.managerEntity;
import project.z_v.manager.repository.managerRepository;

@Controller
@RequestMapping
public class managerController {

    @Autowired
    managerRepository managerRepository;

    @PostMapping("/test")
    public String manager(managerDto dto, Model model) {
        managerEntity entity = dto.toManagerEntity();
        managerRepository.save(entity);
        model.addAttribute("manager", entity);
        return "hospital_information";
    }

}
