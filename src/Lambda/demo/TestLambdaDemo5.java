package Lambda.demo;

abstract class Product
{
	private String productName;
	private double productPrice;

	//abstract String productName();
	//abstract double productPrice();
	
	public Product(String productName,double productPrice)
	{
		this.productName=productName;
		this.productPrice=productPrice;
	}
	public String getproductName()
	{
		return productName;
	}
	
	public double getproductPrice()
	{
		return productPrice;
	}
}

interface ProductService
{
	boolean checkProductName(ProductService productObj);

	String productName();
}


public class TestLambdaDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductService Pservice = null;
		
		Pservice=(input)->{
			
			String pn = input.getproductName();
			double pp = input.getproductPrice();
			
			if(pn.equalsIgnoreCase("TV") && pp.equals("15000.55"))
			{
				return "Thank you for purchars";
			}
			else
			{
				return "Sorry in Saficient Amount";
			}
		};
		
		ProductService productObj = new ProductService("TV","15000.55");
		System.out.println(Pservice.checkProductName(productObj));
	}

}
