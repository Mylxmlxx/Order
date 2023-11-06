package com.group11.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName table_order_relations
 */
@TableName(value ="table_order_relations")
@Data
public class TableOrderRelations implements Serializable {
    /**
     * 餐桌订单ID
     */
    @TableId(type = IdType.AUTO)
    private Integer tableOrderId;

    /**
     * 餐桌ID
     */
    private Integer tableId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 就餐人数
     */
    private Integer numberOfDiners;

    /**
     * 备注
     */
    private String note;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}