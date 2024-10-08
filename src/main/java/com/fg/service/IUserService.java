package com.fg.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fg.dto.LoginFormDTO;
import com.fg.dto.Result;
import com.fg.entity.User;

import javax.servlet.http.HttpSession;

public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
