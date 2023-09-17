package com.example.UserMgmnSystem.Controller;


import com.example.UserMgmnSystem.Service.UserService;
import com.example.UserMgmnSystem.UserModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControl {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String add(@RequestBody User u){
        return userService.addUser(u);
    }

    @GetMapping("alluser")
    public List<User> getAllUser(){
        return userService.getalluser();
    }

    @GetMapping("user/{id}")
    public User getOneUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    @PutMapping("userup/{id}/number/{num}")
    public String updateUser(@PathVariable Integer id,String num){
        return userService.updateContact(id,num);
    }

    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}
