package com.userservice.UserService.Interfaces;

import com.userservice.UserService.CustomException.UserNotFoundException;
import com.userservice.UserService.Model.LoginObject;
import com.userservice.UserService.Model.OrderObject;
import com.userservice.UserService.Model.User;

import java.util.List;

public interface UserServiceInter {

    public User createUser(User user);

    public boolean validateUser(LoginObject loginObject) throws UserNotFoundException;

  public List<OrderObject> userOrders(Long userId);
}
