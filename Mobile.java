package com.X_workz.oops;

public class Mobile {
	String brand;
	int price;
	String color;
	int ram;

	Mobile() {
		System.out.println("No parameter");

	}

	Mobile(String brand, int price, String color, int ram) {
		System.out.println("mobile invoked");
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
	}
	public void displayInfo() {

		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.ram);
	}

	public void switchingOn() {
		System.out.println("mobile switched on");
	}

	public void switchingOff() {
		System.out.println("mobile switched off");
	}

	public void playMusic() {
		System.out.println("music is playing");
	}

	public void playGames() {
		System.out.println("playing games");

	}
}