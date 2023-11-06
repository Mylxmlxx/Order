package com.group11.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Orders implements Serializable {
    /**
     * 订单ID
     */
    @TableId(type = IdType.AUTO)
    private Integer orderId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 订单状态
     */
    private String orderStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}