package test_barni;

import static org.junit.Assert.*;

import org.junit.Test;

import src_barni.Product;

public class ProductObjectTest {
	
	private static int PRODUCT_ID = 1;
	private static String PRODUCT_TITLE = "Apple";
	private static double PRODUCT_PRICE = 10.2;
	
	@Test
	public void canCreateProduct() {
		
		Product product = new Product(PRODUCT_ID, PRODUCT_TITLE, PRODUCT_PRICE);

		assertEquals(PRODUCT_TITLE, product.getTitle());
		assertEquals(PRODUCT_ID, product.getId());
		assertTrue(PRODUCT_PRICE == product.getPrice());
	}
	
	@Test
	public void checkGetSetMethods(){
		Product product = new Product();
		product.setId(PRODUCT_ID);
		product.setPrice(PRODUCT_PRICE);
		product.setTitle(PRODUCT_TITLE);
		
		assertEquals(PRODUCT_ID, product.getId());
		assertTrue(PRODUCT_PRICE==product.getPrice());
		assertEquals(PRODUCT_TITLE, product.getTitle());
	}
	
}
