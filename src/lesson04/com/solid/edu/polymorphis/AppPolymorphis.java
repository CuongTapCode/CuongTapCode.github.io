package lesson04.com.solid.edu.polymorphis;

import java.util.Date;

import lesson04.com.solid.edu.inheritance.Rectangle;
import lesson04.com.solid.edu.inheritance.Shape;

public class AppPolymorphis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Rectangle(112, 114, "Blauu", new Date());
		Rectangle r = new Rectangle(311, 4110, null, null);
		System.out.println(s1.getColor());
		display(r);

	}

	public static void display(Shape s) {
		System.out.println(r);
	}
}
