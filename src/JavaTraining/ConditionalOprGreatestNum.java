package JavaTraining;
import java.util.Scanner;


//Take three numbers from the user and print the greatest number

public class ConditionalOprGreatestNum {

	public static void main(String[] args) 
	{
		int firstnum;
		int secondnum;
		int thirdnum;
		
		Scanner number = new Scanner(System.in);		
		System.out.print("Input the 1st number: ");
        firstnum= number.nextInt();
        System.out.print("Input the 2nd number: ");
        secondnum= number.nextInt();
        System.out.print("Input the 3rd number: ");
        thirdnum= number.nextInt();
        
        if (firstnum > secondnum && firstnum > thirdnum)
        {
        	System.out.print("The greatest number is "+firstnum);
        }
        else if (secondnum > firstnum && secondnum > thirdnum)
        {
        	System.out.print("The greatest number is "+secondnum);
        }
        else
        {       
        	System.out.print("The greatest number is "+thirdnum);
        	
        }
        
        number.close();
	}

}
