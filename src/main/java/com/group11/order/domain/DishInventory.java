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
 * @TableName dish_inventory
 */
@TableName(value ="dish_inventory")
@Data
public class DishInventory implements Serializable {
    /**
     * 菜品ID
     */
    @TableId
    private Integer dishId;

    /**
     * 库存量
     */
    private Integer stockQuantity;

    /**
     * 销售量
     */
    private Integer salesQuantity;

    /**
     * 上架时间
     */
    private Date shelfTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}