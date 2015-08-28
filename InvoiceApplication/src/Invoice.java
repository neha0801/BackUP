import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice {

	private static ArrayList<LineItem> invoiceArray = new ArrayList<LineItem>();
	private String userChoice;
	private double invoiceTotal;
	NumberFormat currency;

	public Invoice() {

		this.userChoice = "y";
		this.currency = NumberFormat.getCurrencyInstance();
	}

	public String getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}

	public void addItem(LineItem myItem) {
		ProductDB myDB;
		myDB = new ProductDB(myItem.getMyProduct(), myItem.getMyProduct()
				.getItemCode());
		myItem.setMyProduct(myDB.getProductDetails());
		myItem.totalPrice();
		this.invoiceTotal += myItem.getTotalPrice();
		invoiceArray.add(myItem);
	}

	public ArrayList<LineItem> getLineItems() {
		return invoiceArray;
	}

	@Override
	public String toString() {
		String a = "";
		for (LineItem item : invoiceArray) {
			a += item;
		}
		return a + "\n\n\t\t\t\t\t\t\t\tInvoice Total = "
				+ currency.format(this.invoiceTotal);
	}

	public double getInvoiceTotal() {

		return this.invoiceTotal;

	}

}
