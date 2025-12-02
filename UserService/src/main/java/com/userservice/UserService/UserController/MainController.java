package com.userservice.UserService.UserController;

import com.userservice.UserService.CustomException.UserNotFoundException;
import com.userservice.UserService.FeignInter.OrderInterface;
import com.userservice.UserService.Model.LoginObject;
import com.userservice.UserService.Model.User;
//import com.userservice.UserService.Service.UserService;
import com.userservice.UserService.Service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.*;

@RestController
@RequestMapping("/user")
public class MainController {

    @Autowired
    UserServiceImp userServiceImp;

    @Autowired
    OrderInterface orderInterface;

    @GetMapping(produces = "application/json")
    public ResponseEntity<?> helloGuest(){
        Map<String,String> guest=new HashMap<>();
        guest.put("name","Guest");
        return ResponseEntity.ok(guest);
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
     User user1=userServiceImp.createUser(user);
     return  ResponseEntity.ok(user1);
    }

    @GetMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginObject loginObject) throws UserNotFoundException {
         return userServiceImp.validateUser(loginObject)?ResponseEntity.ok("valid user"):ResponseEntity.badRequest().body("Not a valid user");
    }

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(userServiceImp.getUsers());
    }

    @GetMapping("/myOrders")
    public  ResponseEntity<?> getOrders(){
   List<?> data=orderInterface.getOrdersById(101l);
    return ResponseEntity.ok(data);
    }

    @GetMapping("/showOrders")
    public ResponseEntity showOrders(){
        return ResponseEntity.ok(orderInterface.showOrders());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleException(RuntimeException exception){
        return ResponseEntity.badRequest().build();
    }


}
