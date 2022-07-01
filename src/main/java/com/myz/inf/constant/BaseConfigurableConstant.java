package com.myz.inf.constant;

/**
 * @author zhaomingyu
 * 2021/7/8 6:43 下午
 */
public abstract class BaseConfigurableConstant implements ConfigurableConstant {

    private String code;
    private Short value;
    private String desc;

    public BaseConfigurableConstant(String code, Short value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public Short value() {
        return value;
    }

    @Override
    public String desc() {
        return desc;
    }

}