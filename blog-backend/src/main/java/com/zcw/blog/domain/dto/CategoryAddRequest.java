package com.zcw.blog.domain.dto;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 接收前端创建分类请求的参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryAddRequest implements Serializable {

    /**
     * 分类名称
     */
    private String name;


    private static final long serialVersionUID = 1L;
}