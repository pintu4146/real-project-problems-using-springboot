//package com.learning.realProjectProblems.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//    // we are not using secrete manager because of the cost on aws
//
//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.url(url);
//        dataSourceBuilder.username(username);
//        dataSourceBuilder.password(password);
//        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
//        return dataSourceBuilder.build();
//    }
//}
