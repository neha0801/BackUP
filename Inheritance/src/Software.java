public final class Software extends Product
{
    private String version ="";
    String code = "";
    String description = "";
    double price =0.0;
    
    public Software()
    {
        super();
        count++;
    }

    public String getVersion()
    {
        return version;
    }

	public void setVersion(String version) {
		this.version = version;
	}
	
    @Override
    public String toString()
    {
    	return "Code:        " + code + "\n" +
                "Description: " + description + "\n" +
                "Price:       " + this.getFormattedPrice() + 
                "\n"            + "Version:     " +
            version + "\n";
    }
    
    // Inheritance activity#2
    @Override
    public boolean equals(Object obj){
    	if (obj instanceof Software){
    		return this.code ==((Software)obj).code;
    	}
    	return false;
    }

}