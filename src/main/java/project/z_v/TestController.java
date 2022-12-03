package project.z_v;


import lombok.RequiredArgsConstructor;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.z_v.UserDB.User;
import project.z_v.UserDB.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
        if (userRepository.existsByUserId(loginId)) {
            model.addAttribute("isDuplicate", true);
        }
    }

    /**
     * @PostMapping("/join") public String join(@RequestParam String userId,@ModelAttribute User user, Model model) {
     * if(userRepository.existsByUserId(userId)) {
     * model.addAttribute("userId", userId);
     * model.addAttribute("duplicate", true);
     * return "join_test";
     * }else if(!userRepository.existsByUserId(userId)) {
     * model.addAttribute("userId", userId);
     * model.addAttribute("duplicate", false);
     * return "join_test";
     * }
     * userRepository.save(user);
     * return "main";
     * }
     **/


    @PostMapping("/join")
    public String join(@ModelAttribute User user) {
        if(user.getUserId().equals("admin")){
            user.setAdmin(true);

        }
        userRepository.save(user);
        return "main";
    }

    @GetMapping("/login")
    public String login(LoginDto loginDto, Model model) {
//        User admin = userRepository.findByUserIdAndUserPW(loginDto.getAdminId(), loginDto.getAdminPW());
//        if (admin.getUserId().equals(loginDto.getAdminId()) && admin.getUserPW().equals(loginDto.getAdminPW())) {
//            model.addAttribute("adminTrue", true);
//            return "main";
//        } else {
//            return "redirect:/login";
//        }
        return "/login";
    }
    @PostMapping("/login")
    public String loginPost( LoginDto loginDto, Model model) {
        User user = userRepository.findByUserIdAndUserPW(loginDto.getLoginId(), loginDto.getPassword());
        if(user == null) {
            return "redirect:/login";
        }
        else if(user.isAdmin() == true ){
            model.addAttribute("adminTrue", true);
        }else if(user.isAdmin() == false) {
            model.addAttribute("adminTrue", false);
        }
        httpSession.setAttribute("user", user);

        return "/main";
    }



 /*   @PostMapping("/main")
    public String main(LoginDto loginDto, Model model, HttpServletRequest request) {
*/
        //User user = userRepository.findByUserId(loginDto.getLoginId());
//        User admin = userRepository.findByUserIdAndUserPW(loginDto.getLoginId(), loginDto.getPassword());
//
//        if (admin == null) {
//            return "redirect:/login";
//        }
//    if(admin.getUserId().equals(loginDto.getLoginId()) && loginDto.getPassword() == null) {
//        if(admin.getIsAdmin() == true) {
//            model.addAttribute("adminTrue", true);
//            return "/main";
//        }
//    }
//        else if (admin.getUserId().equals(loginDto.getLoginId()) && admin.getUserPW() == null) {
//            httpSession.setAttribute("user", admin);
//            return "main";
//        } else {
//            return "redirect:/login";
//        }

       /* User user = userRepository.findByUserIdAndUserPW(loginDto.getLoginId(), loginDto.getPassword());

        if (user == null) {
            return "redirect:/login";
        }

        if (user.getUserId().equals(loginDto.getLoginId()) && user.getUserPW().equals(loginDto.getPassword())) {
                httpSession.setAttribute("user", user);
                return "main";
            } else {
            httpSession.setAttribute("user", user);
            return "redirect:/login";
        }

    }
*/

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if(session != null) {
            session.invalidate();
        }
        return "redirect:/main";
    }


//    @RequestMapping(value = "logout")
//    public String logoutGET(HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        session.invalidate();
//        return "redirect:/main";
//    }




    @GetMapping("/main")
    public String mainGo(Model model) {
        User user = (User) httpSession.getAttribute("user");
        if(user == null || user.isAdmin() == false) {
            model.addAttribute("adminTrue", false);
        }
        else if(user != null && user.isAdmin() == true) {
            model.addAttribute("adminTrue", true);
        }
        return "main";
    }



    @GetMapping("/bestPage")
    public String bestPage() {
        return "bestPage";
    }

    @GetMapping("/interest")
    public String interest() {
        return "interest";
    }

    @GetMapping("/ShopRemove")
    public String ShopRemove() {
        return "ShopRemove";
    }

    @GetMapping("/allPage")
    public String allPage() {
        return "allPage";
    }

}