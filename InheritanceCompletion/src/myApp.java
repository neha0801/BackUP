/* * @author Neha
 *
 */
public class myApp {

	/**
	 * test app to get the class name
	 * @param args
	 */
	public static void main(String[] args) {
		Book myBook = new Book();
		Software mySoftware = new Software();
		// getName method is a static method so I don't need an object to instantiate 
		String name = Product.getName(myBook);		
		System.out.println(name);
		// try another object
		name = Product.getName(mySoftware);
		System.out.println(name);

	}
}
