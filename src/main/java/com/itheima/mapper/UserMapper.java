package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //被该注解标记的接口，会在程序运行期间为该接口生成代理类（动态代理），并且会交给Spring IOC管理
public interface UserMapper {
    @Select("select * from user")
    List<User> queryAll();
}
