package com.example.Restaurant.Service;

import com.example.Restaurant.Entity.UserRestaurant;
import com.example.Restaurant.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<UserRestaurant> getAllRestaurant(){
        return userRepo.getUserRestaurantList();
    }

    public UserRestaurant getResById(Integer id){
        for(UserRestaurant user:getAllRestaurant()){
            if(user.getRestId().equals(id)){
                return user;
            }
        }
        throw new RuntimeException("Restaurant not found");
    }

    public String addRest(UserRestaurant restaurant){
        getAllRestaurant().add(restaurant);
        return "Restaurant added";
    }

    public String updateRest(Integer id,String specialty){
        for(UserRestaurant user:getAllRestaurant()){
            if(user.getRestId().equals(id)){
                user.setSpecialty(specialty);
                return "Updated ";
            }
        }
        return "Specialty updated for restaurant id "+id;
    }

    public String deleteRest(Integer id){
        for(UserRestaurant user:getAllRestaurant()){
            if(user.getRestId().equals(id)){
                getAllRestaurant().remove(user);
            }
        }
        return "Restaurant deleted successfull";
    }
}
