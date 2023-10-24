package com.example.vente.Controller;

import com.example.vente.Entity.UserEntity;
import com.example.vente.Service.IUser;
import com.example.vente.request.user.CreateUserReq;
import com.example.vente.request.user.UpdateUserReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUser userService;

    @PostMapping
    public UserEntity createUser(@RequestBody CreateUserReq user) {
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public UserEntity updateUser( @RequestBody UpdateUserReq user) {

        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.delete(id);

    }
}
