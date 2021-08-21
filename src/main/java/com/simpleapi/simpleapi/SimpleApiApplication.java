package com.simpleapi.simpleapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.simpleapi.simpleapi.identity.DogType;
import com.simpleapi.simpleapi.service.DogService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class SimpleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(DogService dogService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<DogType>> typeReference = new TypeReference<List<DogType>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/data/apidata.json");

			try {
				List<DogType> dogs = mapper.readValue(inputStream,typeReference);
				dogService.save(dogs);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

}
