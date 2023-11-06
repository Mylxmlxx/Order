package com.group11.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName tables
 */
@TableName(value ="tables")
@Data
public class Tables implements Serializable {
    /**
     * 餐桌ID
     */
    @TableId(type = IdType.AUTO)
    private Integer tableId;

    /**
     * 容纳人数
     */
    private Integer seatingCapacity;

    /**
     * 位置描述
     */
    private String locationDescription;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}