package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/hello")
    public String sayHello() {
        return "main/hello";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "main/goodbye";
    }
}