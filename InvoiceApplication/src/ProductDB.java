/**
 * 
 */

/**
 * @author Neha
 *
 */
public class ProductDB {

	Product myProduct;
	String code;

	public ProductDB(Product myProd, String itemCode) {
		myProduct = myProd;
		this.code = itemCode;
	}

	public Product getProductDetails() {
		if (code.equalsIgnoreCase("J101")) {
			myProduct.setDescription("Just Java");
			myProduct.setPrice(49.99);
		} else if (code.equalsIgnoreCase("DB101")) {
			myProduct.setDescription("Database concepts");
			myProduct.setPrice(59.99);
		} else if (code.equalsIgnoreCase("java")) {
			myProduct.setDescription("Murach's Beginning Java");
			myProduct.setPrice(49.50);
		} else if (code.equalsIgnoreCase("jsps")) {
			myProduct.setDescription("Murach's Java Servlets and JSP");
			myProduct.setPrice(49.50);
		} else {
			myProduct.setDescription("Unknown");
			myProduct.setPrice(0.0);

		}
		return myProduct;
	}

}
