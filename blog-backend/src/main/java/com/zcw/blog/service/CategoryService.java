package com.zcw.blog.service;

import com.zcw.blog.domain.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author zcw
* @description 针对表【blog_category(文章分类表)】的数据库操作Service
* @createDate 2025-02-01 22:15:06
*/
public interface CategoryService extends IService<Category> {

    /**
     * 根据分类名称查询单个分类
     */
    Category findCategoryByName(String categoryName);
}
