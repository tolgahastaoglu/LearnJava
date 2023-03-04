package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao {
	public void add(Product product) {
		//sadece db erişim kodları buaya yazılır.
		System.out.println("JDBC ile veritabanına eklendi.");
	}
	

}
