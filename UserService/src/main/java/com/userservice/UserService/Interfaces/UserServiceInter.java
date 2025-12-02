package com.userservice.UserService.Interfaces;

import com.userservice.UserService.CustomException.UserNotFoundException;
import com.userservice.UserService.Model.LoginObject;
import com.userservice.UserService.Model.User;

public interface UserServiceInter {

    public User createUser(User user);

    public boolean validateUser(LoginObject loginObject) throws UserNotFoundException;
}
