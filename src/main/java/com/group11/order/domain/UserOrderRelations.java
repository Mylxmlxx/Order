package com.group11.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user_order_relations
 */
@TableName(value ="user_order_relations")
@Data
public class UserOrderRelations implements Serializable {
    /**
     * 用户订单ID
     */
    @TableId(type = IdType.AUTO)
    private Integer userOrderId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 备注
     */
    private String note;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}