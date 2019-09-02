package com.gyenno.ruiyun.datamigration.service.user;

import com.gyenno.ruiyun.datamigration.model.user.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> selectAllUsers();
    List<UserModel> selectAloneAllUsers();
}
