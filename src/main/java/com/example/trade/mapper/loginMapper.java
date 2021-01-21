package com.example.trade.mapper;

import com.example.trade.provider.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface loginMapper {

    //根据用户ID修改密码
    @Select("select * from user_info where username=#{username} and password=#{password}")
    User login(User user);
}
