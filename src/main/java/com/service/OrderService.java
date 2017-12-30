package com.service;

import com.mapper.OrderMapper;
import com.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sdyang
 * @create 2017-12-29 10:46
 **/
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public void insert(Order order){
        orderMapper.insert(order);
    }
}
