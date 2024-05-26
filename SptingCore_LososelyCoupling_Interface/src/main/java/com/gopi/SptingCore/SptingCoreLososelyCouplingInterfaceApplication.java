package com.gopi.SptingCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

;

@SpringBootApplication
public class SptingCoreLososelyCouplingInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SptingCoreLososelyCouplingInterfaceApplication.class, args);
		Vehicle veh = new Bike();   //here we can use any object which implements the Vehicle 
		/*
		 * It is not the good approach to create the object using the new key word ,in real time we are having the thousands of objects
		 * We should have some frame work that can manage objects for us 
		 * Spring Ioc container creates and manages the objects 
		 * */
		
		
		Traveller t = new Traveller(veh); 
		t.startJourney();
	}

}
