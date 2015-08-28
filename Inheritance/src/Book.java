public final class Book extends Product
{
    private String author ="";
    String code = "";
    String description = "";
    double price =0.0;
    
    public Book()
    {
        super();
    	count++;
    }

    public String getAuthor() {
		return author;
	}

	public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
    	return "Code:        " + code + "\n" +
                "Description: " + description + "\n" +
                "Price:       " + this.getFormattedPrice() + 
                "\n"            + "Author:      " +
            author + "\n";
    }
    
    // Inheritance activity#2
    @Override
    public boolean equals(Object obj){
    	if (obj instanceof Book){
    		return  this.author ==((Book)obj).author;
    	}
    	return false;
    }
}
