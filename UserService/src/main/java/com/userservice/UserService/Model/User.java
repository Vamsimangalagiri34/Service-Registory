package com.userservice.UserService.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "userEcom")
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String mobileNumber;

    private String password;

    private String role; // USER / ADMIN

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String pincode;
    @ElementCollection
    private List<OrderObject> orders;



//    private boolean active = true;
}
