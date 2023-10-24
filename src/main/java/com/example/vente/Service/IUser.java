package com.example.vente.Service;

import com.example.vente.Entity.UserEntity;
import com.example.vente.request.user.CreateUserReq;
import com.example.vente.request.user.UpdateUserReq;

import java.util.Optional;

public interface IUser {
    UserEntity save(CreateUserReq user);
    void delete(int id);
    Optional<UserEntity> getUser(int id);
    UserEntity update(UpdateUserReq user);

}
