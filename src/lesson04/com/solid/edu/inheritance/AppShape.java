package lesson04.com.solid.edu.inheritance;

import java.util.Date;

public class AppShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.setColor("Blau");
		r.setCreateDate(new Date());
		r.setHeight(1111);
		r.setWidth(9999);
		System.out.println(r.getArea());
	}

}
