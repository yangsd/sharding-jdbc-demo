package com.model;

import com.mybatisplus.annotations.TableId;
import com.mybatisplus.annotations.TableName;

/**
 * @author sdyang
 * @create 2017-12-29 10:41
 **/
@TableName("t_order")
public class Order {

    @TableId
    private long order_id;

    private int user_id;

    private String status;

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
