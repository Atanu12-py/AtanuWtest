package com.example.UserMgmnSystem.Service;

import com.example.UserMgmnSystem.Repository.UserRepo;
import com.example.UserMgmnSystem.UserModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String addUser(User u){
        List<User> users=getalluser();
        users.add(u);
        return "USer added";
    }

    public List<User> getalluser(){
        return userRepo.getUsers();
    }

    public User getUser(Integer id){
        List<User> users=getalluser();
        for(User i:users){
            if(id.equals(i.getUserId())){
                return i;
            }
        }
        throw new IllegalStateException("id not found");
    }
    public String updateContact(Integer id,String contact){
        List<User> users=getalluser();
        for(User i:users){
            if(id.equals(i.getUserId())){
                i.setContactNo(contact);
                return "Contact updated";
            }
        }
        return "Invalid id";
    }
    public String deleteUser(Integer id){
        List<User> users=getalluser();
        for(User i:users){
            if(id.equals(i.getUserId())){
                users.remove(i);
                return "User deleted";
            }
        }
        return "Invalid id";
    }
}
