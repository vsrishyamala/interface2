package com.inter2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int s,y;
		String b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your car number");
		s=scan.nextInt();
		System.out.println("How many years old car do you have");
		y=scan.nextInt();
		System.out.println("Car brand");
		scan.nextLine();
		b=scan.nextLine();
		Car car = new Service(s,y,b);
		car.sum();
		car.brand();
		car.years();
		
		

	}

}
