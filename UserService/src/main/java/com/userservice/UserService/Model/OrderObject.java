package com.userservice.UserService.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Embeddable
@Data
public class OrderObject {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // Reference to user service

    private String orderStatus;  // PENDING, PLACED, SHIPPED, DELIVERED, CANCELLED

    private Double totalAmount;
    private String orderName;


    private String paymentMethod;  // COD, UPI, CARD

    private String paymentStatus;  // PENDING, SUCCESS, FAILED

    private LocalDateTime orderDate = LocalDateTime.now();

    private LocalDateTime deliveryDate;


}
