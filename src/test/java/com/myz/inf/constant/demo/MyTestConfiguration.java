package com.myz.inf.constant.demo;

import com.myz.inf.constant.ConfigurableConstantsHelper;
import com.myz.inf.constant.ConfigurableConstantsManager;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author zhaomingyu
 * 2022/6/30
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@MapperScan({"com.myz.inf.constant.dao","com.myz.inf.constant.demo.dao"})
public class MyTestConfiguration {

    @Autowired
    private Environment env;

    @Bean
    @Primary
    public DataSource dataSource() throws Exception {
        Properties prop = new Properties();

        prop.put("username", env.getProperty("database.username"));
        prop.put("password", env.getProperty("database.password"));
        prop.put("url", env.getProperty("database.url"));
        prop.put("driverClassName", env.getProperty("database.driverClassName"));
        prop.put("initialSize", env.getProperty("database.initialSize"));
        prop.put("maxTotal", env.getProperty("database.maxTotal"));
        prop.put("maxIdle", env.getProperty("database.maxIdle"));
        prop.put("minIdle", env.getProperty("database.minIdle"));

        prop.put("validationQuery",env.getProperty("database.validationQuery"));

        return BasicDataSourceFactory.createDataSource(prop);
    }

    @Bean
    public ConfigurableConstantsManager configurableConstantsManager() {
        ConfigurableConstantsManager configurableConstantsManager = new ConfigurableConstantsManager();
        return configurableConstantsManager;
    }

    @Bean
    public ConfigurableConstantsHelper configurableConstantsHelper() {
        ConfigurableConstantsHelper configurableConstantsHelper = new ConfigurableConstantsHelper();
        configurableConstantsHelper.setInstance();
        return configurableConstantsHelper;
    }
}
