package com.group11.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName dishes
 */
@TableName(value ="dishes")
@Data
public class Dishes implements Serializable {
    /**
     * 菜品ID
     */
    @TableId(type = IdType.AUTO)
    private Integer dishId;

    /**
     * 菜品名称
     */
    private String dishName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 口味
     */
    private String taste;

    /**
     * 描述
     */
    private String description;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}