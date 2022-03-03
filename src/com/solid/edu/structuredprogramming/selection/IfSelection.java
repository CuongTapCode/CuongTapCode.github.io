package com.solid.edu.structuredprogramming.selection;

import java.util.Scanner;

public class IfSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double point;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban hay nhap diem vao di ....");
		point = sc.nextDouble();

		if (point < 0 || point > 10) {
			System.out.println("Point invalid...");
		} else {
			System.out.println("Valid ...");
		}
		if (point >= 0 && point < 5) {
			System.out.println("Hoc kem qua !!!");
		} else if (point >= 5 && point < 7) {
			System.out.println("Hoc cung trung binh thoi !!!");
		} else {
			System.out.println("Hoc gioi qua !!!");
		}
	}

}
