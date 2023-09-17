package com.example.Restaurant.Controller;

import com.example.Restaurant.Entity.UserRestaurant;
import com.example.Restaurant.Repo.UpdateSpecialty;
import com.example.Restaurant.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserControll {
    @Autowired
    UserService userService;

    @GetMapping("restaurant/id/{id}")
    public UserRestaurant getRestById(@PathVariable Integer id){
        return userService.getResById(id);
    }

    @GetMapping("restaurants")
    public List<UserRestaurant> getAllRest(){
        return userService.getAllRestaurant();
    }

    @PostMapping("restaurant")
    public String addRest(@RequestBody @Valid UserRestaurant rest){
        return userService.addRest(rest);
    }

    @PutMapping("rest")
    public String updateRest(@RequestBody @Valid UpdateSpecialty specialty){
        return userService.updateRest(specialty.getId(),specialty.getSpecialty());
    }

    @DeleteMapping("Restaurant/id/{id}")
    public String deleteRest(@PathVariable Integer id){
        return userService.deleteRest(id);
    }
}
