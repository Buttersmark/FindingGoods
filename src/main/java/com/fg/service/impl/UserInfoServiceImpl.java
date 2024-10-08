package com.fg.service.impl;

import com.fg.entity.UserInfo;
import com.fg.mapper.UserInfoMapper;
import com.fg.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
