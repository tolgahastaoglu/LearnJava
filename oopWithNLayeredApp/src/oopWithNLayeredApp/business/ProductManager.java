package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	public void add(Product product) throws Exception {
		//iş kuralları
		if (product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		JdbcProductDao productDao=new JdbcProductDao();
		productDao.add(product);
	
	}	
}
