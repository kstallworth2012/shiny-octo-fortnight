package com.quickstart.quickstart.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@Configuration
public class DatabaseConfig{
	

	@Bean
	public JdbcTemplate jdbcTemplate(final DataSource _dataSource){
			return new JdbcTemplate(_dataSource);
	}
}