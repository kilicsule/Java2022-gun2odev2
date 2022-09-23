package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.png");


		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.png");

		Product product3 = new Product();
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image3.png");
		
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05013585245");
		individualCustomer.setCustomerNumber("1325");
		individualCustomer.setFirstName("Şule");
		individualCustomer.setLastName("Kılıç");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("08354853232");
		corporateCustomer.setCustomerNumber("5253");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("12338525631");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
	}

}
