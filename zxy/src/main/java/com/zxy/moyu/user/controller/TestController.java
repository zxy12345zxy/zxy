package com.zxy.moyu.user.controller;

import com.zxy.moyu.user.entity.UserEntity;
import com.zxy.moyu.user.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author DELL
 */
@RestController
public class TestController {
@Autowired
private TestService   testService;
Logger  logger= LoggerFactory.getLogger(TestController.class);
    @RequestMapping("select")
    public List<UserEntity> getName(){
        logger.info("查询人员信息");
        List<UserEntity> list=testService.select();
        return list;
    }
}
