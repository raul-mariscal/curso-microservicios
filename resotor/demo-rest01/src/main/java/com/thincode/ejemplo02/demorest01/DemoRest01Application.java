package com.thincode.ejemplo02.demorest01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRest01Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoRest01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring corriendo");
		
	}

}
