package com.example.demo.test;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

@Repository
@Mapper
public interface UserDao {


    void selectDao(String id);

}
