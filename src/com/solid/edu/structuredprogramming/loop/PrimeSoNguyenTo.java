package com.solid.edu.structuredprogramming.loop;

public class PrimeSoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 133;
		boolean prime = true;
		for (int i = 0; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				prime = false;
			}

		}
		System.out.println(prime ? n + "La so nguyen to" : n + " Khong la so nguyen to");
	}
}
