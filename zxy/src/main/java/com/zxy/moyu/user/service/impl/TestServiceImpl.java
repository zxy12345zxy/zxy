package com.zxy.moyu.user.service.impl;

import com.zxy.moyu.user.entity.UserEntity;
import com.zxy.moyu.user.repository.UserEntityRepository;
import com.zxy.moyu.user.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl  implements TestService {
    @Autowired
    private UserEntityRepository userEntityRepository;
    @Override
    public List<UserEntity> select() {

        List<UserEntity>  list= userEntityRepository.findAll();
        return list;
    }
}
