package com.myz.inf.constant.demo;

import com.myz.inf.constant.BaseConfigurableConstant;
import com.myz.inf.constant.ConstantMeta;

/**
 * @author zhaomingyu
 * 2022/6/30
 */
@ConstantMeta(name="phone_type")
public class PhoneTypeEnum extends BaseConfigurableConstant {

    public PhoneTypeEnum(String code, Short value, String desc) {
        super(code, value, desc);
    }
}
