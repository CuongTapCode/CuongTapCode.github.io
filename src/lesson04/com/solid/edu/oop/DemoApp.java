package lesson04.com.solid.edu.oop;

import java.util.Date;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer(2, "Moi tap Code", new Date(2002, 04, 26), (byte) 0, "Lang bat");
		System.out.println(c);
		c.display();

	}
}
