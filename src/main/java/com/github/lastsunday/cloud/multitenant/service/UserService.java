package com.github.lastsunday.cloud.multitenant.service;

import com.github.lastsunday.cloud.multitenant.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getUserAndAddr(String userName);

}
