package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int currentTruckId = 1;
	private String name;
	private String foodType;
	private int truckId = 0;
	private int rating;
	

	public FoodTruck() {
		
	}
	
	// get & set, constructor,

	public int getcurrentTruckId() {
		return currentTruckId;
	}

	public void setcurrentTruckId(int currentTruckId) {
		FoodTruck.currentTruckId = currentTruckId;
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
		this.truckId = currentTruckId ++;
		this.rating = rating;
	}
	//sysout..
	public String toString() {
		return "Truck Name: " + name + "- ID:" + truckId + ". Serving: " + foodType + ". Rating: " + rating ; 
	}
	public int id() {
		truckId++;
		return truckId;
	}

	public int getId() {
		return truckId;
	}

	public void setId(int id) {
		this.truckId = id;
	}
	
}
