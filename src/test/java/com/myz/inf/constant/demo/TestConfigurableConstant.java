package com.myz.inf.constant.demo;

import com.myz.inf.constant.ConfigurableConstantsHelper;
import com.myz.inf.constant.ConfigurableConstantsManager;
import com.myz.inf.constant.dao.ConstantConfigMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @author zhaomingyu
 * 2022/6/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyTestConfiguration.class)
public class TestConfigurableConstant {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private ConstantConfigMapper constantConfigMapper;

    @Autowired
    private ConfigurableConstantsManager configurableConstantsManager;

    @Autowired
    private ConfigurableConstantsHelper configurableConstantsHelper;

    @Test
    public void testConstant() {
        // init
        configurableConstantsManager.setConstantConfigMapper(constantConfigMapper);
        configurableConstantsHelper.setConfigurableConstantsManager(configurableConstantsManager);

        System.out.println(dataSource.toString());
        System.out.println(configurableConstantsHelper.toString());
    }
}
