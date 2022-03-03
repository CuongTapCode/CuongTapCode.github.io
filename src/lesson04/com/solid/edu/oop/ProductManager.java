package lesson04.com.solid.edu.oop;

public class ProductManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private Product[] arrProduct; // Lưu ds các product (sau này sẽ gọi vào database
		private int size = 0; // số lượng sản phẩm trong mảng

		public ProductManager() {
			this.arrProduct = new Product[1];
			this.size = 0;

		}

		public ProductManager(Product[] arrProduct) {
			this.arrProduct = arrProduct;
		}

		public Product[] getArrProduct() {
			return arrProduct;
		}

		public void setArrProduct(Product[] arrProduct) {
			this.arrProduct = arrProduct;
		}

		public void add(Product p) {
			// check xem arrProduct có đủ chỗ để add p vào ko?
			if (this.size >= this.arrProduct.length - 1) {
				// 1. Tạo ra mảng mới
				Product[] temp = new Product[this.size * 2 + 1];
				// 2. Copy data từ mảng cũ sang
				System.arraycopy(this.arrProduct, 0, temp, 0, this.size);
				this.arrProduct = temp;

			}
			this.arrProduct[this.size++] = p;

		}

		public void print() {
			for (Product p : arrProduct) {
				if (p != null)
					System.out.println(p);
			}
		}
	}

}
