package project.z_v;


import com.mysql.cj.xdevapi.Session;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.boot.context.annotation.UserConfigurations;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.LoginDto;
import project.z_v.UserDB.User;
import project.z_v.UserDB.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @GetMapping("/duplicate/id")
    public void duplicateId(@RequestParam String loginId, Model model) {
        if(userRepository.existsByUserId(loginId)){
            model.addAttribute("isDuplicate", true);
        }
    }

    @PostMapping("/join")
    public String join(@ModelAttribute User user) {
        userRepository.save(user);
        return "main";
    }

    @GetMapping ("/login")
    public String login() { return "login";}


    @PostMapping("/main")
    public String main(LoginDto loginDto,Model model, HttpServletRequest request){

        User user = userRepository.findByUserId(loginDto.getLoginId());

        if (user==null){
            return "redirect:/login";
        }

        if (user.getUserId().equals(loginDto.getLoginId()) && user.getUser_PW().equals(loginDto.getPassword())){
            httpSession.setAttribute("user", user);
            return "main";
        } else {
            return "redirect:/login";
        }

    }

//    @PostMapping("/logout")
//    public String logout(HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        if(session != null) {
//            session.invalidate();
//        }
//        return "redirect:/main";
//    }


    @RequestMapping(value = "logout")
    public String logoutGET(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/main";
    }




    @GetMapping("/main")
    public String mainGo() {
        return "main";
    }



    @GetMapping("/manager")
    public String manager(){
        return "Manager"; }

    @GetMapping("/bestPage")
    public String bestPage(){
        return "bestPage"; }

    @GetMapping("/interest")
    public String interest(){
        return "interest"; }

    @GetMapping("/ShopRemove")
    public String ShopRemove(){
        return "ShopRemove"; }

    @GetMapping("/allPage")
    public String allPage(){
        return "allPage"; }

}