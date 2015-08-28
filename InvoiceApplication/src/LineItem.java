import java.text.NumberFormat;

/**
 * @author Neha
 *
 */
public class LineItem
{
	// Variables for the class
    private int quantity;
    private double totalPrice;
    private Product myProduct;
    NumberFormat currency = NumberFormat.getCurrencyInstance();

	public LineItem(Product myProd, int quan){
		this.myProduct = myProd;
		this.quantity =quan;
	}
	
	public Product getMyProduct() {
		return myProduct;
	}

	public void setMyProduct(Product myProduct) {
		this.myProduct = myProduct;
	}
	


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	/**
	 * method to compute the total price based on the number of items requested
	 * @param quantity
	 * @return total price of the all items
	 */

	public void totalPrice()
	{
		this.totalPrice = this.quantity*this.myProduct.getPrice();
	}
	

	@Override
	public String toString(){
		return "\n" + String.format("%-10s %-35s %-20s %-10s %-20s",this.myProduct.getItemCode()
				,this.myProduct.getDescription(),currency.format(this.myProduct.getPrice()),
				this.quantity,currency.format(this.totalPrice));
	}
}