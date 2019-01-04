package com.carsApp.MohamadCars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.carsApp.MohamadCars.domain.Car;
import com.carsApp.MohamadCars.domain.CarRepository;
import com.carsApp.MohamadCars.domain.Owner;
import com.carsApp.MohamadCars.domain.OwnerRepository;

@SpringBootApplication
public class MohamadCarsApplication {

	private static final Logger logger = LoggerFactory.getLogger(MohamadCarsApplication.class);

	@Autowired 
    private CarRepository repository;
	@Autowired
	private OwnerRepository ownerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MohamadCarsApplication.class, args);
		logger.info("Hello Spring Boot");
	}
	
	@Bean
    CommandLineRunner runner(){
      return args -> {
        // Save demo data to database
    	  Owner owner1=new Owner("mohamad","zaid");
    	  Owner owner2=new Owner("Asala","katash");
    	  Owner owner3=new Owner("hanen","omari");
    	  ownerRepository.save(owner1);
    	  ownerRepository.save(owner2);
    	  ownerRepository.save(owner3);
        repository.save(new Car("Ford", "Mustang", "Red",
         "ADF-1121", 2017, 59000,owner1));
        repository.save(new Car("Nissan", "Leaf", "White",
         "SSJ-3002", 2014, 29000,owner2));    
         repository.save(new Car("Toyota", "Prius", "Silver",
         "KKO-0212", 2018, 39000,owner3));
      };
	}

}

