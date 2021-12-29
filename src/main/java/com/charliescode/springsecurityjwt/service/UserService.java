package com.charliescode.springsecurityjwt.service;

import com.charliescode.springsecurityjwt.entity.UserEntity;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserEntity saveUser(UserEntity user);
    UserEntity getUserById(UUID user_id);
    UserEntity getUserByEmail(String email);
    List<UserEntity> getAllUsers();
}
