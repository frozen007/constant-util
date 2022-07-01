package com.myz.inf.constant;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author zhaomingyu
 * 2021/7/13 3:01 下午
 */
public class ConfigurableConstantsHelper {

    private static ConfigurableConstantsHelper configurableConstantsHelper;

    private ConfigurableConstantsManager configurableConstantsManager;

    public void setConfigurableConstantsManager(ConfigurableConstantsManager configurableConstantsManager) {
        this.configurableConstantsManager = configurableConstantsManager;
    }

    public void setInstance() {
        configurableConstantsHelper = this;
    }

    public static <T extends ConfigurableConstant> T getByCode(Class<T> type, String code) {
        return configurableConstantsHelper.configurableConstantsManager.getByCode(type, code);
    }

    public static <T extends ConfigurableConstant> T getByValue(Class<T> type, short value) {
        return configurableConstantsHelper.configurableConstantsManager.getByValue(type, value);
    }
}