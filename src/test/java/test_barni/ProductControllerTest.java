package test_barni;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import src_barni.Product;
import src_barni.ProductController;

public class ProductControllerTest {

	@Test
	public void testProductListCreation() {
		ProductController products = new ProductController();
		assertEquals(0, products.getListSize());

		products.addProduct(new Product(1, "Latop", 10.2));
		assertEquals(1, products.getListSize());

		Product p1 = new Product(2, "banana", 2);
		products.addProduct(p1);
		assertEquals(2, products.getListSize());
	}

	@Test
	public void testgetProductsbyTitle() {
		Product p = new Product(1, "mobile", 1.09);
		ProductController products = new ProductController();
		for (int i = 0; i < 5; i++) {
			products.addProduct(p);
		}
		List<Product> result = products.getProductsbyTitle("mobile");
		assertEquals(result.size(), 5);
	}
}
