package com.zxy.moyu.user.repository;

import com.zxy.moyu.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author DELL
 */
public interface UserEntityRepository extends JpaRepository<UserEntity,Long> {
    @Override
    List<UserEntity>  findAll();
}
