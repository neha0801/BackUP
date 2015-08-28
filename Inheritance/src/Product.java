import java.text.NumberFormat;

public abstract class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Product() {}

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
    public String getFormattedPrice()
    {
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    //abstract method
    public abstract String toString();
    
    
    public static int getCount()
    {
        return count;
    }
    
    // method to get the class name
    public static String getName(Object obj){
		String className = obj.getClass().getName();
		return className;
    }
    
    //abstract method
    public abstract boolean equals(Object obj);
}