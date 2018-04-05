package com.greenfoxacademy.balazs.dependencypractice;

import com.greenfoxacademy.balazs.dependencypractice.models.GreenColor;
import com.greenfoxacademy.balazs.dependencypractice.models.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencypracticeApplication implements CommandLineRunner {

	@Autowired
	Printer printer;

	@Autowired
  GreenColor greenColor;

	public static void main(String[] args) {
		SpringApplication.run(DependencypracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(greenColor.printColor());
	}
}
