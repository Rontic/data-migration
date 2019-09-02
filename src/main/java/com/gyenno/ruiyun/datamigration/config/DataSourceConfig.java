package com.gyenno.ruiyun.datamigration.config;

import com.gyenno.ruiyun.datamigration.datasource.DynamicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {
    /**
     * dbalone数据库配置
     */
    @Bean("dbalone")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.dbalone")
    public DataSource dbaloneSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * dbcloud数据库配置
     */
    @Bean("dbcloud")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.dbcloud")
    public DataSource dbcloudSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据库配置
     */
    @Bean(name = "dynamicDataSource")
    @Primary
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dbaloneSource());

        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap(5);
        dsMap.put("dbalone", dbaloneSource());
        dsMap.put("dbcloud", dbcloudSource());

        dynamicDataSource.setTargetDataSources(dsMap);

        return dynamicDataSource;
    }

    /**
     * 配置@Transactional注解事物
     * @return
     */
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }
}
