package com.quickstart.quickstart;

//TO START A  SPRING BOOT PROJECT GO TO https://start.spring.io/

import com.quickstart.quickstart.practice.components.WelcomeToTheShow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.sql.DataSource;
import lombok.extern.java.Log; // For @Log
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;







@SpringBootApplication
// @Log
public class QuickstartApplication implements CommandLineRunner{



	private final DataSource dataSource;


	public QuickstartApplication(final DataSource _dataSource){
		this.dataSource = _dataSource;
	}


	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);

		var show = new WelcomeToTheShow();
		System.out.println(show.getWelcomeMessage());


	
	}


	@Override
	public void run(final String... args){
		// log.info("DataSource: "+ dataSource.toString());
		System.out.println("DataSource: "+ dataSource.toString());
		final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
		restTemplate.execute("SELECT 1");
	}

}
