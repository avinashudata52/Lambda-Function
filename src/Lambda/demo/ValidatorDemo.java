package Lambda.demo;

import java.util.Scanner;
//import javax.xml.transform.Source;
//import javax.xml.validation.Validator;

interface Validator
{
	boolean Validate(String input);
}
public class ValidatorDemo {

public static void main(String args[])
{
    String regex = "[A-Z]{5}[1-9]{4}[A-Z]{1}";
    Validator v = (input)->
    {
        boolean status = input.matches(regex);
        return status;
    };

    try (Scanner sc = new Scanner (System.in)) {
		System.out.println("Enter Pan Number");
		String pan = sc.next();
		boolean result = v.Validate(pan);
		if(result)
		{
		    System.out.println("Pan IS Valid");
		}
		else
		{
		    System.out.println("Pan IS not Valid");
		}
	}

}
}
