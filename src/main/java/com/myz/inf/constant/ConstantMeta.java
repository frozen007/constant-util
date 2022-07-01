package com.myz.inf.constant;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhaomingyu
 * 2021/7/8 7:46 下午
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConstantMeta {

    /**
     * 常量名称
     * @return
     */
    String name();
}