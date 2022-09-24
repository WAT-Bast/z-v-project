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
    @GetMapping("/test1")
    public String test1() {
        return "join";
    }

    @GetMapping("/join")
    public String join() {
        return "join test";
    }

}
