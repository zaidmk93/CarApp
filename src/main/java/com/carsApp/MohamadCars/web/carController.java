package com.carsApp.MohamadCars.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsApp.MohamadCars.domain.Car;
import com.carsApp.MohamadCars.domain.CarRepository;

@RestController
public class carController {

	@Autowired
	private CarRepository carRepository;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars(){
		return carRepository.findAll();
		
	}
}
