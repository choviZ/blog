package com.zcw.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * 文章分类表
 * @TableName blog_category
 */
@TableName(value ="blog_category")
@Data
@Builder
public class Category implements Serializable {
    /**
     * 分类id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 最后一次更新时间
     */
    private Date update_time;

    /**
     * 逻辑删除标志位：0：未删除 1：已删除
     */
    private Integer is_deleted;

    @TableField(exist = false)
    @TableLogic
    private static final long serialVersionUID = 1L;
}