package com.example.greenfoxacademy.listingtodoswithh2;

import com.example.greenfoxacademy.listingtodoswithh2.models.Todo;
import com.example.greenfoxacademy.listingtodoswithh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodoswithh2Application implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Listingtodoswithh2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Feed the dog"));
		todoRepository.save(new Todo("Go to cinema"));
		todoRepository.save(new Todo("Do the homework"));
	}
}
