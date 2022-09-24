package project.z_v;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {



    @GetMapping("/index")
    public String index() {
        return "asd";
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @GetMapping("subintest")
    public String subintet() {
        return "testes";
    }
<<<<<<< HEAD
    @GetMapping("/test1")
    public String test1() {
        return "join";
    }

    @GetMapping("/join")
    public String join() {
        return "join test";
    }

=======

    @GetMapping("/login")
    public String login() {
        return "login";
    }
>>>>>>> 8273ae5a3dc64d8baea4363f5b9a42a68f88360c
}
