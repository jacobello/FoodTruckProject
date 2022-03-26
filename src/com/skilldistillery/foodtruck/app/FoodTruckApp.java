package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();
		System.out.println("*************  Welcome  *************");
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
			System.out.println("Enter name of the food truck you would like to rate! \nEnter \"Quit\" to Menu");
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

		int choice;
		do {
			menu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				existingTruck();
				break;
			case 2:
				averageRating();
				break;
			case 3:
				highestRating();
				break;
			case 4:
				System.out.println("Good Bye! ");
				break;
			default:
				System.out.println("Invalid input!");
			}
		} while (choice != 4);
	}

	public void menu() {
		thirtyStars();
		fifteenStars();
		System.out.print("     MENU     ");
		fifteenStars();
		System.out.println("\n\t Press 1 for list of entered trucks");
		System.out.println();
		System.out.println("\t Press 2 for your rating average");
		System.out.println();
		System.out.println("\t Press 3 for the Highest rating Truck");
		System.out.println();
		System.out.println("\t Press 4 to Quit");
		thirtyStars();
		thirtyStars();
	}

	public void existingTruck() {
		for (FoodTruck tr : foodtruck) {
			if (tr != null) {
				System.out.println(tr);
			}

		}
	}

	public void averageRating() {
		double average = 0.0;
		double sum = 0.0;
		int i = 0;

		for (i = 0; i < foodtruck.length; i++) {
			if (foodtruck[i] == null) {
				break;
			}
			int rating2 = foodtruck[i].getRating();
			sum = sum + rating2;
		}
		average = sum / i;
		System.out.println("The average rating is: " + average);
		thirtyStars();
	}

//	public void highestRating() {
//		int i;
//	
//		for (i = 5; i > 0; i--) {
//			if (foodtruck[i] == null) {
//			break;
//		}
//			if ( foodtruck[i].getRating() == i) {
//				System.out.println("The highest rating is " + foodtruck[i].toString());
//				break;
//			}	
//			if (foodtruck[i].getRating() < i) {
//				highRating -= 1;
//			}
//			if (foodtruck[i].getRating() > highRating) {
//				highRating = foodtruck[i].getRating();
//			}
//				
//			}
//			
//		}
//	
	public void highestRating() {
		int i = 0;
		FoodTruck highRating = new FoodTruck();
		for (i = 0; i < foodtruck.length; i++) {
			if (foodtruck[i] == null) {
				break;
			}
//			if (foodtruck[i].getRating() < highRating) {
//				continue;
//			}
			if (foodtruck[i].getRating() > highRating.getRating()) {
				highRating = foodtruck[i];
			}
//			if (foodtruck[i].getRating() == highRating) {
		}
		System.out.println("The highest rating is " + highRating.toString());
	}

	public void fifteenStars() {
		System.out.print("***************");

	}

	public void thirtyStars() {
		System.out.println("*********************************************");

	}
}