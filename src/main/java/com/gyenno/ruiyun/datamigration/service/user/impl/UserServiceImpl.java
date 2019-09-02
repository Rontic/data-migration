package com.gyenno.ruiyun.datamigration.service.user.impl;

import com.gyenno.ruiyun.datamigration.annotation.DataBase;
import com.gyenno.ruiyun.datamigration.mapper.user.UserMapper;
import com.gyenno.ruiyun.datamigration.model.user.UserModel;
import com.gyenno.ruiyun.datamigration.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @DataBase("dbcloud")
    public List<UserModel> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    @DataBase("dbalone")
    public List<UserModel> selectAloneAllUsers() {
        return userMapper.selectAllUsers();
    }
}
