package com.gopi.SptingCore;

public class Traveller {

	Vehicle vehicle;
	
	public Traveller(Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	
	public void startJourney() {
		vehicle.move();
	}
	
	
}
