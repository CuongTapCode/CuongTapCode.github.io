package lesson04.com.solid.edu.oop;

import java.util.Date;

public class Customer {
// Co gi ? => Tinh chat (thuoc tinh / attributes / properties )
	// fields/data
	// Truu tuong : mo ta chung chung khach hang
	private int id;
	private String fullName;
	private Date dob;
	private byte sex; // 0 is woman - 1 is men - 2 is khac
	private String address;

	// Constructor => Ham tao
	public Customer() {
		// TODO Auto-generated constructor stub
		this.id = 1;
		this.fullName = "";
		this.dob = new Date(2002, 04, 26);
		this.sex = 0;
		this.address = "";

	}

	public Customer(int id, String fullName, Date dob, byte sex, String address) {
		// super();
		this.id = id;
		this.fullName = fullName;
		this.dob = dob;
		this.sex = sex;
		this.address = address;
	}

	public void display() {
		System.out.println("Khach hang co ma " + this.id + " ,  co ten la :" + this.fullName
				+ ", Ngay thang nam sinh la :  " + this.dob + " Co gioi tinh la : " + this.sex);
	}

}
