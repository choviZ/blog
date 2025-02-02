package com.zcw.blog.controller;

import com.zcw.blog.common.BaseResponse;
import com.zcw.blog.common.ResultUtils;
import com.zcw.blog.domain.dto.UserLoginRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 用户相关请求
* */
@RestController
@RequestMapping("/")
public class UserController {

    /**
     * 登录
     */
    public BaseResponse login(@RequestBody UserLoginRequest loginUser) {
        return ResultUtils.success(null);
    }
}
