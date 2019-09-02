package com.gyenno.ruiyun.datamigration.model.user;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserModel {
    private String id;

    private Integer activitisync;

    private String browser;

    private String password;

    private String realname;

    private Integer status;

    private String userkey;

    private String username;

    private String departid;

    private Integer deleteFlag;

    private String shareType;

    private String signature;

    private String email;

    private String mobilephone;

    private String officephone;

    private String signaturefile;

    private Integer jobPosition;

    private Integer jobTitle;

    private String beGoodAt;

    private String award;

    private String sex;

    private String office;

    private String subordinate;

    private String gyennoId;

    private Integer changePassword;

    private Date createDate;

    //统计用下属字段
    private String branch;
}
