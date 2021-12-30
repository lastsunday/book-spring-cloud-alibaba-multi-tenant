package com.github.lastsunday.cloud.multitenant.service;

import com.github.lastsunday.cloud.multitenant.entity.UserEntity;
import com.github.lastsunday.cloud.multitenant.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserEntity> getUserAndAddr(String userName) {
        return userMapper.getUserAndAddr(userName);
    }

}
