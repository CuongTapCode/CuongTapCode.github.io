package lesson04.com.solid.edu.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Truy xuat va in ra
		int[] data = intialNumber();
		// 2.In ra

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		// In ra 2:
		displayNumber(data);
		// 3.1 Copy array
		int[] data1 = data;
		System.out.println("=======");
		displayNumber(data1);
		// 3.2 Copy dung phuong thuc cua lop Arrays
		int[] data2 = Arrays.copyOf(data, data.length);
		// 3.3 copy
		int[] data3 = new int[data.length];
		System.arraycopy(data, 0, data3, 0, data.length);
		// 4.Sap xep mot mang
		int[] data4 = data;
		sortNumber(data);
		System.out.println("********");
		displayNumber(data4);
	}

	public static int[] sortNumber(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int minValue = list[i];
			int index = i;
			for (int j = i + 1; j < list.length; j++) {
				if (minValue > list[j]) {
					minValue = list[j];
					index = j;
				}
			}
			// Hoaìn viò viò triì ğâÌu tiên i=0 võìi minValue vaÌ index
			if (index != i) {
				list[index] = list[i];
				list[i] = minValue;
			}
		}
	}

	public static void displayNumber(int[] arrNumber) {
		for (int i : arrNumber) {
			if (i == arrNumber.length - 1)
				System.out.println(i);
			else
				System.out.println(i + " . ");

		}
	}

	public static int[] intialNumber() {
		// Lay ngau nhien so
		final int CUI = 200;
		Random rd = new Random();
		int[] tempData = new int[CUI];
		for (int i = 0; i < CUI; i++) {
			tempData[i] = rd.nextInt(6969);
		}
		return tempData;
	}

}
