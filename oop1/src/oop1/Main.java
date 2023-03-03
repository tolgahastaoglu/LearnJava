package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1= new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitprice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(20);
		product1.setImageUrl("birsetler1.jpg");
		
		Product product2= new Product();
		product2.setName("smeg Kahve Makinesi");
		product2.setUnitprice(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(20);
		product2.setImageUrl("birsetler2.jpg");
		
		Product product3= new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitprice(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(20);
		product3.setImageUrl("birsetler3.jpg");
		
		
		Product[] products= {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getUnitprice());
			System.out.println(product.getUnitsInStock());
			System.out.println(product.getDiscount());
			System.out.println("--------------------");
			
			
			
			IndividualCustomer individualCustomer1 =new IndividualCustomer();
			individualCustomer1.setId(1);
			individualCustomer1.setCustomerNumber("055555555");
			individualCustomer1.setCustomerNumber("123456");
			individualCustomer1.setFirstName("Tolga");
			individualCustomer1.setLastName("Hastaoglu");
			
			
			CorporateCustomer corporateCustomer1=new CorporateCustomer();
			corporateCustomer1.setId(2);
			corporateCustomer1.setCustomerNumber("22233333");
			corporateCustomer1.setCompanyName("Tolga AŞ");
			corporateCustomer1.setTaxNumber("15845688");
			
			Customer[] customers= {individualCustomer1,corporateCustomer1};
			for(Customer customer : customers) {
				System.out.println(customer.getId());
				System.out.println(customer.getCustomerNumber());
			}
			
		}

	}

}
