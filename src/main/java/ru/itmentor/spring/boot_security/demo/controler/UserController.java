package ru.itmentor.spring.boot_security.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itmentor.spring.boot_security.demo.service.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String userInfo(ModelMap modelMap, Principal principal) {
        modelMap.addAttribute("user", userService.loadUserByUsername(principal.getName()));
        return "user";
    }
}