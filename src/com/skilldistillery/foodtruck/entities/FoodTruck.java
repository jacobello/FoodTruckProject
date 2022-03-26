package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int currentTruckId;
	private String name;
	private String foodType;
	private int truckId;
	private int rating;
	

	public FoodTruck() {
		
	}
	
	// get & set, constructor,

	public int getNextTruckId() {
		return currentTruckId;
	}

	public void setNextTruckId(int nextTruckId) {
		FoodTruck.currentTruckId = nextTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	//create new Truck
	public FoodTruck(String name, String foodType, int truckId, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.truckId = truckId;
		this.rating = rating;
	}
	//sysout..
	public String toString() {
		return "**Truck Name: " + name + "- ID:" + truckId + ", serving: " + foodType + ". Rating: " + rating + "**"; 
	}
	
	
}
