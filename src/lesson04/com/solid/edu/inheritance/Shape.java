package lesson04.com.solid.edu.inheritance;

import java.util.Date;

public class Shape {
	private String color;
	private Date createDate;

	public Shape() {
	}

	public Shape(String color, Date createDate) {
		this.color = color;
		this.createDate = createDate;

	}

	public double getArea() {
		return 0.0;
	}

	public double getPerimeter() {
		return 0.0
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
