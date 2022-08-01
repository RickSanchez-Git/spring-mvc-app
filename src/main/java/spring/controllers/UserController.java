package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping("/userList")
    public String getUsers(){
        return "userManager/userList";
    }

    @GetMapping("/getUser")
    public String getUser(HttpServletRequest request){
        String name = request.getParameter("name");

        System.out.println("User requested: " + name);
        return "userManager/userList";
    }

    @GetMapping("/regUser")
    public String regUser(@RequestParam(value = "name", required = false) String name,
                          Model model) {

        if (name == null) {
            name = "default name";
        }

        model.addAttribute("name", "User registered: " + name);
        return "userManager/regUser";
    }
}
