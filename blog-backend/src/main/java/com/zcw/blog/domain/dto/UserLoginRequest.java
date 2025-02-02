package com.zcw.blog.domain.dto;

import lombok.Data;

/**
 * 接受用户登录请求参数
 */
@Data
public class UserLoginRequest {

    private String username;

    private String password;
}
