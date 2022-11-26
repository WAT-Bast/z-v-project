package project.z_v;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.LoginDto;
import project.z_v.UserDB.User;
import project.z_v.UserDB.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final UserRepository userRepository;
    private final HttpSession httpSession;


    @GetMapping("/index")
    public String index() {
        return "asd";
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @GetMapping("/join")
    public String join() {
        return "join_test";
    }

    @GetMapping("duplicate/id")
    public void duplicateId(@RequestParam String loginId, Model model) {
        if(userRepository.existsByUserId(loginId)){
            model.addAttribute("isDuplicate", true);
        }
    }

    @PostMapping("/join")
    public String join(@ModelAttribute User user) {
        userRepository.save(user);
        return "join_test";
    }

    @GetMapping ("/login")
    public String login() { return "login";}


    @PostMapping("/login")
    public String login(LoginDto loginDto,Model model) {
        User user = userRepository.findByUserId(loginDto.getLoginId());
        System.out.println("user = " + user);
        String str = "hi";

        if (user==null){
            str = null;
            model.addAttribute("loginIdMessage", str) ;
            model.addAttribute("passwordMessage", str);
            return "redirect:/login";
        }

        if (user.getUser_PW().equals(loginDto.getPassword())){
            httpSession.setAttribute("user", user);
            return "main";
        } else {
            model.addAttribute("passwordMessage", "비밀번호를 다시 입력하세요");
            return "redirect:/login";
        }
    }



    @RequestMapping(value="/main", method = {RequestMethod.GET, RequestMethod.POST})
    public String main(Model model, HttpServletRequest request){

        HttpSession session = request.getSession(true);
        User user = (User)session.getAttribute("user");
        
        if(user != null) {
            System.out.println("user.getUserId() = " + user.getUserId());
        }
//
//        String userName = (String)session.getAttribute("userName");
//      System.out.println("user.getUserId() = " +  session.getId());
//        User user = (User)session.getAttribute("user");
//        System.out.println("user.getUserId() = " + user.getUserId());
//        model.addAttribute("user",user);
        return "/main";
    }


    @GetMapping("/manager")
    public String manager(){
        return "Manager"; }

    @GetMapping("/bestPage")
    public String bestPage(){
        return "bestPage"; }
}
