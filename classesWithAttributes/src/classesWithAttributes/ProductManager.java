package classesWithAttributes;

public class ProductManager {

	public void add(Product product) {

		System.out.println("Ürün eklendi: " + product.getName());
	}

	public void add(int id, String name, String description, int stockAmount, double price) {

	}
}
