/**
 * @author Neha
 *
 */
public class Product {
	// Variables for the class
	private String itemCode;
	private String description;
	private double price;

	public Product() {
		this.price = 0.0;
		this.description = "";
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}