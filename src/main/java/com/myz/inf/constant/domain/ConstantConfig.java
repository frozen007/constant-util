package com.myz.inf.constant.domain;

import java.util.Date;

/**
 * @author zhaomingyu
 * 2021/7/9 4:42 下午
 */
public class ConstantConfig {
    private Long id;

    private String constantName;

    private String constantCode;

    private Short constantValue;

    private String constantDesc;

    private Date createTime;

    private String createBy;

    private Date lastModifyTime;

    private String lastModifyBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName;
    }

    public String getConstantCode() {
        return constantCode;
    }

    public void setConstantCode(String constantCode) {
        this.constantCode = constantCode;
    }

    public Short getConstantValue() {
        return constantValue;
    }

    public void setConstantValue(Short constantValue) {
        this.constantValue = constantValue;
    }

    public String getConstantDesc() {
        return constantDesc;
    }

    public void setConstantDesc(String constantDesc) {
        this.constantDesc = constantDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }
}
