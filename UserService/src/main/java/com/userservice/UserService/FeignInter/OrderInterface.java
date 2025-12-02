package com.userservice.UserService.FeignInter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@FeignClient("ORDER-SERVICE")

public interface OrderInterface {

    @GetMapping("/order")
  public List<?> getOrdersById(@RequestParam Long id);

    @GetMapping("/order/showOrders")
    public List<?> showOrders();

}
