package com.controller;

import com.model.Order;
import com.service.OrderService;
import io.shardingjdbc.core.keygen.DefaultKeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sdyang
 * @create 2017-12-29 10:45
 **/
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "test",method = {RequestMethod.GET})
    @ResponseBody
    public String sendMsgPage() {

        DefaultKeyGenerator defaultKeyGenerator = new DefaultKeyGenerator();

        for(int i=1;i<20000;i++) {
            Number id = defaultKeyGenerator.generateKey();
            Order order = new Order();
            order.setOrder_id(id.longValue());
            order.setUser_id(i);
            order.setStatus("启用");
            orderService.insert(order);
        }

        return "success";
    }
}
