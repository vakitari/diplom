package com.example.lastdemo.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/profile")
    public String openProfile(){
        return "profile";
    }
}
