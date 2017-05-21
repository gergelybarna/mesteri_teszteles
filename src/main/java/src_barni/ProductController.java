package src_barni;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
	private List<Product> productList;

	public ProductController() {
		this.productList = new ArrayList<Product>();
	}

	public void addProduct(Product product) {
		this.productList.add(product);
	}

	public List<Product> getProductsbyTitle(String title) {
		List<Product> result = new ArrayList<Product>();

		for (Product product : this.productList) {
			if (product.getTitle().equals(title)) {
				result.add(product);
			}
		}
		return result;
	}

	public int getListSize() {
		return productList.size();
	}
}
