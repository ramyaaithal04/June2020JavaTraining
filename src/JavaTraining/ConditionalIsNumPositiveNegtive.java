package JavaTraining;
import java.util.Scanner;


public class ConditionalIsNumPositiveNegtive {

	public static void main(String[] args) 
	{
		
		String n;
		char c;
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=num.next();
		
		c=n.charAt(0);
		
	
		System.out.println(c);
		
		if (c == '-')
		{
			System.out.println(n +" is negative number.");
		}
		else
		{
			System.out.println(n +" is positive number.");
		}
		
				
	}

}
