package com.quickstart.quickstart;

//TO START A  SPRING BOOT PROJECT GO TO https://start.spring.io/


import com.quickstart.quickstart.practice.components.WelcomeToTheShow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);

		var show = new WelcomeToTheShow();
		System.out.println(show.getWelcomeMessage());
	
	}

}
