package com.userservice.UserService.Service;


import com.userservice.UserService.CustomException.UserNotFoundException;
import com.userservice.UserService.Interfaces.UserServiceInter;
import com.userservice.UserService.Model.LoginObject;
import com.userservice.UserService.Model.User;
import com.userservice.UserService.Repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class UserServiceImp implements UserServiceInter {


    @Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User user) {
      return  userRepo.save(user);

    }

    @Override
    public boolean validateUser(LoginObject loginObject) throws UserNotFoundException {
        User user = userRepo.findByEmail(loginObject.getEmail());
        try {
            if (user.getEmail().equals(loginObject.getEmail()) && user.getPassword().equals(loginObject.getPassword())) {
                return true;
            }
        } catch (Exception e) {
             throw new UserNotFoundException("Invalid User", 404);
//             return false;
        }

        return false;
    }
    public List<User> getUsers(){
         return  userRepo.findAll();
    }

}
