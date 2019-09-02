package com.gyenno.ruiyun.datamigration.mapper.user;

import com.gyenno.ruiyun.datamigration.model.user.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    List<UserModel> selectAllUsers();
    List<UserModel> selectAloneAllUsers();
}
