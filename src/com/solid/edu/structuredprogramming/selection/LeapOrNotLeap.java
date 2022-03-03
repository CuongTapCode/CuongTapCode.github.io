package com.solid.edu.structuredprogramming.selection;

import java.util.Scanner;

public class LeapOrNotLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input year you want : ");
		int year;
		year = sc.nextInt();

//		if (year % 4 == 0 && year % 100 != 0) {
//			System.out.println("Leap Year !!!");
//		} else if (year % 400 == 0) {
//			System.out.println("Leap Year !!!");
//		} else {
//			System.out.println(" Not leap year!!!!");
//		}
		String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? " is Leap year"
				: " is not leap year";
		System.out.println("Year " + year + "" + result);
	}

}
