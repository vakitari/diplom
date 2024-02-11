package com.example.lastdemo.Repo;

import com.example.lastdemo.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername (String Username);
}
