package lesson04.com.solid.edu.inheritance;
//Sub calss ( lop dan xuat )

import java.util.Date;

public class Rectangle extends Shape {
	// Thuoc tinh rieng cua Rectangle
	private double height;
	private double width;

	public Rectangle() {

	}

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public Rectangle(double height, double width, String color, Date createDate) {
		super(color, createDate);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height * this.width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.height + this.width) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", getHeight()=" + getHeight() + ", getWidth()="
				+ getWidth() + ", getColor()=" + getColor() + ", getCreateDate()=" + getCreateDate() + "]";
	}
}

// anotation => decoration
