package com.solid.edu.structuredprogramming.loop;

import java.util.Scanner;

public class WhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("Please input n : ");

		do {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			i = i + n;
			System.out.println(" Tong cua " + n + " là :  " + i);
			String str = sc.nextLine();
			if (str.equals("N")) {
				break;
			}

		} while (true);
		System.out.println("The end !!! Thanks ");
	}

}
