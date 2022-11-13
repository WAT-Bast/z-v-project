package project.z_v;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.z_v.UserDB.User;
import project.z_v.UserDB.repository.UserRepository;

@Controller
public class TestController {

    private final UserRepository userRepository;

    @Autowired
    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
        return "join test";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute User user) {
        userRepository.save(user);
        return "main";
    }

    @GetMapping ("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/manager")
    public String manager(){
        return "Manager"; }

    @GetMapping("/bestPage")
    public String bestPage(){
        return "bestPage"; }
}
