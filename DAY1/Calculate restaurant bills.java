

  public class Main
{
	public static void main(String args[]) 
	{
	    double product1 = 15.5;
	    double product2 = 4.5;
	    double product3 = 30;
	    double tax_percentage  = 5;
	    double tax_amount;
	    double sum;
	    double total;
	   
	    System.out.println(product1);
	   
	    System.out.println(product2);
	   
	    System.out.println(product3);
	    
	    
	    sum = (product1 + product2 + product3);

	    System.out.println(tax_percentage);
	    
	    tax_amount = (tax_percentage/100)*(sum);
	    
	    total = (product1 + product2 + product3 + tax_amount);
	    System.out.println("Total is : " + total);
	}
}
