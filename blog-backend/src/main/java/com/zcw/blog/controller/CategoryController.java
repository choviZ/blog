package com.zcw.blog.controller;

import com.zcw.blog.common.BaseResponse;
import com.zcw.blog.common.ResultUtils;
import com.zcw.blog.domain.dto.CategoryAddRequest;
import com.zcw.blog.domain.entity.Category;
import com.zcw.blog.exception.ErrorCode;
import com.zcw.blog.exception.ThrowUtils;
import com.zcw.blog.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 分类接口
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    /**
     * 创建分类
     */
    @PostMapping("/add")
    public BaseResponse<Boolean> createCategory(@RequestBody CategoryAddRequest categoryAddRequest) {
        // TODO 校验参数
        // 先查询分类是否存在
        Category category = categoryService.findCategoryByName(categoryAddRequest.getName());
        ThrowUtils.throwIf(category != null, ErrorCode.PARAMS_ERROR, "分类已存在");
        // 不存在，再写入数据库
        category = Category.builder().name(categoryAddRequest.getName()).build();
        int result = categoryService.getBaseMapper().insert(category);
        return ResultUtils.success(result != 0);
    }
}
