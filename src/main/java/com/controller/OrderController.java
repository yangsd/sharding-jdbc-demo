package com.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.model.Order;
import com.service.OrderService;
import io.shardingjdbc.core.keygen.DefaultKeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author sdyang
 * @create 2017-12-29 10:45
 **/
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private DefaultKeyGenerator defautKeyGenerator;

    @RequestMapping(value = "test",method = {RequestMethod.GET})
    @ResponseBody
    public String sendMsgPage() {

        for(int i=1;i<20;i++) {
            Number id = defautKeyGenerator.generateKey();
            Order order = new Order();
            order.setOrder_id(defautKeyGenerator.generateKey().longValue());
            order.setUser_id(i);
            order.setStatus("启用");
            orderService.insert(order);
        }

        return "success";
    }

    @RequestMapping(value = "query",method = {RequestMethod.GET})
    @ResponseBody
    public String query() {

      List<Order> orders = orderService.findAll();

        return JSON.toJSONString(orders);
    }
}
