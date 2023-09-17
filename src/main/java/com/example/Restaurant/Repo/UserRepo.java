package com.example.Restaurant.Repo;


import com.example.Restaurant.Entity.UserRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<UserRestaurant> userRestaurantList;

    public List<UserRestaurant> getUserRestaurantList(){
        return userRestaurantList;
    }
}
