package com.myz.inf.constant;

import com.myz.inf.constant.dao.ConstantConfigMapper;
import com.myz.inf.constant.domain.ConstantConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhaomingyu
 * 2021/7/8 6:39 下午
 */
public class ConfigurableConstantsManager {
    private static final Logger log = LoggerFactory.getLogger(ConfigurableConstantsManager.class);

    private ConstantConfigMapper constantConfigMapper;

    public void setConstantConfigMapper(ConstantConfigMapper constantConfigMapper) {
        this.constantConfigMapper = constantConfigMapper;
    }

    public <T extends ConfigurableConstant> List<T> getConstants(Class<T> type) {
        log.info("获取常量列表：{}", type.getSimpleName());
        ConstantMeta constantMeta = type.getAnnotation(ConstantMeta.class);
        if (constantMeta == null) {
            throw new IllegalArgumentException("Constant not found:" + type);
        }
        try {
            List<ConstantConfig> constantConfigs = constantConfigMapper.selectConstantConfig(constantMeta.name());
            if (constantConfigs != null) {
                List<T> constList = new ArrayList<>();

                Constructor<T> constructor = type.getConstructor(String.class, Short.class, String.class);

                for (ConstantConfig constantConfig : constantConfigs) {
                    String constantCode = constantConfig.getConstantCode();
                    Short constantValue = constantConfig.getConstantValue();
                    String constantDesc = constantConfig.getConstantDesc();
                    T instance = constructor.newInstance(constantCode, constantValue, constantDesc);
                    constList.add(instance);
                }
                return constList;
            }
        } catch (Exception e) {
            log.error("获取常量报错：" + type, e);
            throw new RuntimeException("获取常量报错", e);
        }

        return Collections.emptyList();
    }

    public <T extends ConfigurableConstant> T getByCode(Class<T> type, String code) {
        log.info("获取常量: type={}, code={}", type.getSimpleName(), code);
        for (T constant : getConstants(type)) {
            if (constant.code().equals(code)) {
                return constant;
            }
        }

        return null;
    }

    public <T extends ConfigurableConstant> T getByValue(Class<T> type, short value) {
        log.info("获取常量: type={}, value={}", type.getSimpleName(), value);
        for (T constant : getConstants(type)) {
            if (constant.value().shortValue() == value) {
                return constant;
            }
        }

        return null;
    }

}