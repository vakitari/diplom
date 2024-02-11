package com.example.lastdemo.Service;

import com.example.lastdemo.Entity.Role;
import com.example.lastdemo.Entity.UserEntity;
import com.example.lastdemo.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    public void reg(UserEntity user){
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    user.setRoles(Collections.singletonList(Role.USER));
    userRepo.save(user);
    }
    
}
