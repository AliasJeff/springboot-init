package com.alias.project.service;

import com.alias.project.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param account
     * @param password
     * @param checkPassword
     * @return 新用户id
     */
    Long register(String account, String password, String checkPassword);

    /**
     * 用户登录
     *
     * @param account
     * @param password
     * @return 脱敏后的信息
     */
    User login(HttpServletRequest request, String account, String password);

    User getLoginUser(HttpServletRequest request);

    boolean isAdmin(HttpServletRequest request);

    boolean logout(HttpServletRequest request);
}
