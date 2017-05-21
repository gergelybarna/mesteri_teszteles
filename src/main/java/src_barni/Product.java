package src_barni;

public class Product {

	private int Id;
	private String Title;
	private double price;

	public Product() {
	}

	public Product(int Id, String Title, double price) {
		this.Id = Id;
		this.Title = Title;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getTitle() {
		return this.Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}
}
