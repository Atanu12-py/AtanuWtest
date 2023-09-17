package com.example.UserMgmnSystem.BeanFactory;

import com.example.UserMgmnSystem.UserModel.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMake {
    @Bean
    public List<User> getUsers(){
        return new ArrayList<>();
    }

}
