package com.zxy.moyu.user.service;

import com.zxy.moyu.user.entity.UserEntity;

import java.util.List;

/**
 * @author DELL
 */
public interface TestService {

    List<UserEntity> select();
    UserEntity selectId(String id);
}
