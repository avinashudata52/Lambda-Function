package Exception;

import java.io.InvalidClassException;

class Flipkart 
{
	int productPrice = 5000;
	void buyProduct(int custAmount) throws InvalidClassException
	{
		if(productPrice==custAmount)
		{
			System.out.println("The Payment is Successfull");	
		}
		else if(productPrice > custAmount)
		{
			System.out.println("Insafficient amount transfer");
		}
		else if(productPrice <= custAmount)
		{
			System.out.println("Amount is more than Product price");
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
}
public class Sample 
{
	public static void main(String[] args) throws InvalidClassException 
	{
		// TODO Auto-generated method stub	
		Flipkart samp1 = new Flipkart();
		samp1.buyProduct(5);
	}

}
