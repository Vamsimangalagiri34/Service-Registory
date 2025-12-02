package com.userservice.UserService.Model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class OrderObject {
    private Long orderId;
    private String orderStatus;
}
