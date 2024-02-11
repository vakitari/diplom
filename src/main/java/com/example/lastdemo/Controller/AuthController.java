package com.example.lastdemo.Controller;

import com.example.lastdemo.Entity.UserEntity;
import com.example.lastdemo.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping("/registration")
    public String openRegPage(){
        return "regPage";
    }

    @PostMapping("/registration")
    public String regUser(UserEntity user){
        userService.reg(user);

        return "redirect:/login";
    }
    @GetMapping("/login")
    public String openLogPage(){
        return "login";
    }
}
