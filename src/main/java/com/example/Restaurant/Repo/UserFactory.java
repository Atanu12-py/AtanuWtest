package com.example.Restaurant.Repo;

import com.example.Restaurant.Entity.UserRestaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserFactory {
    @Bean
    List<UserRestaurant> getUserResInit(){
        return new ArrayList<>();
    }

}
