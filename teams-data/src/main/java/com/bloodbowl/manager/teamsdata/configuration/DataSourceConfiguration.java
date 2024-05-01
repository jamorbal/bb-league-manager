package com.bloodbowl.manager.teamsdata.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties dataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    public DataSource getDataSource(DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().build();
    }
}
