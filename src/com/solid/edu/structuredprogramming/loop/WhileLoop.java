package com.solid.edu.structuredprogramming.loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Thi du 2 : Tinh tong cac so tu 1 -> n
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Please input n : ");
		// int n, i = 0, k = 0;
		// n = sc.nextInt();
		// while (i <= n) {
		// k += i;
		// i++;
		// System.out.println("Tong can tim la : " + k);
		// }
		// System.out.println("Tong can tim la : " + k);
		/*
		 * Thi du 3 : Tinh tong day so sau S = 1/1 + 1/2 + ... 1/n
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("Please input n : ");
		 * int n, i = 0; double sum = 0; n = sc.nextInt(); while (i < n) { sum += 1 / i;
		 * i++; } System.out.println("Tong S = " + sum);
		 */
		/*
		 * Scannersc = new Scanner(System.in); System.out.println("Please input n : ");
		 * int i=0,n; n = sc.NextInt();
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input n : ");
		int i = 0, n;
		n = sc.nextInt();

		do {
			String str = sc.nextLine();
			if (str.equals("N")) {
				break;
			}

			i += n;
			System.out.println(" Tong cua " + i);
		} while (true);
		System.out.println("The end !!! Thanks ");

	}
}
