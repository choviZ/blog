package com.zcw.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zcw.blog.domain.entity.Category;
import com.zcw.blog.exception.ErrorCode;
import com.zcw.blog.exception.ThrowUtils;
import com.zcw.blog.service.CategoryService;
import com.zcw.blog.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author zcw
* @description 针对表【blog_category(文章分类表)】的数据库操作Service实现
* @createDate 2025-02-01 22:15:06
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public Category findCategoryByName(String categoryName) {
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Category::getName, categoryName);
        return categoryMapper.selectOne(queryWrapper);
    }
}




