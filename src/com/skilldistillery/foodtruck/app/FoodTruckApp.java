package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();
		System.out.println("*** Welcome ***");
		app.op();
//	not ID();
	}

//	fleet of up to 5 truck,
	FoodTruck[] foodtruck = new FoodTruck[5];

	/*
	 * create op(); for loop: ask for input of name, ftype,rating "quit" break;
	 */
	public void op() {

		for (int i = 0; i < foodtruck.length; i++) {
			System.out.println("Enter name of the food truck you would like to rate! Enter \"Quit\" to Menu");
			String name = sc.next();
			sc.nextLine();

			if (name.equalsIgnoreCase("Quit")) {
				break;
			}

			System.out.println("What kind of cuisine or food type was it ?");
			String foodType = sc.next();
			sc.nextLine();

			System.out.println(
					"From scale of 1 to 5, how would you rate Food truck" + (i + 1) + "\n\t (1 - Worst, 5 - Best");
			int rating = sc.nextInt();
			sc.nextLine();

			FoodTruck tr = new FoodTruck(name, foodType, rating, rating);
			foodtruck[i] = tr;
		}
	}
	int choice;
	do {
		menu();
		choice = sc.nextInt();
		switch(choice) {
		case 1: existingTruck(); 
		case 2:	averageRating()
		case 3: highestRating()
		case 4:	System.out.println("Good Bye! U+1F600 ");
			default:
				System.out.println("Invalid input!");
		}
		
	}
	/*
	 * choice show menu() 4 case swithc loop while != 4
	 * 
	 * 
	 * 
	 * create void menu()
	 * 
	 * create void existingTruck()
	 * 
	 * create void averageRating()
	 * 
	 * create void highestRating()s
	 * 
	 * 
	 * 
	 */

}
