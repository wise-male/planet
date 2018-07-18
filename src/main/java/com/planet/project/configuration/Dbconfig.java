package com.planet.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class Dbconfig {

    @Resource
    private DataSource dataSource;

    @Bean("dataSource")
    public DataSource getDadaSource(){

        return  dataSource;
    }

}
