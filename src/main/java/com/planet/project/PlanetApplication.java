package com.planet.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.planet.project.mapper")
@ComponentScan(basePackages = {"com.planet.project"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class PlanetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanetApplication.class, args);
	}
}
