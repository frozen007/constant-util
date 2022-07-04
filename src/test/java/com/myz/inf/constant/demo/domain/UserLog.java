package com.myz.inf.constant.demo.domain;

import com.myz.inf.constant.demo.PhoneTypeEnum;

import java.util.Date;

/**
 * @author zhaomingyu
 * 2022/7/4
 */
public class UserLog {
    private Long id;
    private String userName;
    private PhoneTypeEnum phoneType;
    private Date accessTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PhoneTypeEnum getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneTypeEnum phoneType) {
        this.phoneType = phoneType;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }
}
