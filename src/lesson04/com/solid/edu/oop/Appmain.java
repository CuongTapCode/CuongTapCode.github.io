package lesson04.com.solid.edu.oop;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductManager pm = new ProductManager();
		// 1 Tạo ra 3 sản phẩm để đua mảng
		Product p1 = new Product();
		p1.setProductID(1);
		p1.setProductName("Máy laptop Dell 2022");
		p1.setListPrice(1500);

		Product p2 = new Product();
		p2.setProductID(2);
		p2.setProductName("Macbook Pro 2022");
		p2.setListPrice(3500);

		Product p3 = new Product();
		p3.setProductID(3);
		p3.setProductName("RAM 64GB");
		p3.setListPrice(500);

		// 2. Sử dụng chức năng thêm vào
		pm.add(p1);
		pm.add(p2);
		pm.add(p3);

		// 2. in ra
		pm.print();

	}

}
