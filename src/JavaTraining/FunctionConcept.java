package JavaTraining;

import java.util.Scanner;

public class FunctionConcept {

	public static void main(String[] args) {
		
		int a,b,c;
		FunctionConcept obj=new FunctionConcept();
		float r;
		
		Scanner num=new Scanner(System.in);
//		System.out.print("Enter the first no:");
//		a=num.nextInt();
//		System.out.print("Enter the second no:");
//		b=num.nextInt();
//		System.out.println("The sum of "+a+" and "+b+" is :"+obj.sumOfTwoNums(a, b));
//		
//		System.out.println("The product of "+a+" and "+b+" is :"+obj.productOfTwoNums(a, b));
//		
//		System.out.print("Enter the radius :");
//		r=num.nextFloat();
//		System.out.println("The circumference of circle with radius "+r+" is :"+obj.circumOfCircle(r));
//		System.out.println("The area of circle with radius "+r+" is :"+obj.areaOfCircle(r));
//			
//		System.out.print("Enter the first no:");
//		a=num.nextInt();
//		System.out.print("Enter the second no:");
//		b=num.nextInt();
//		System.out.print("Enter the third no:");
//		c=num.nextInt();
//		System.out.println("The maximum number among "+a+", "+b+" and "+c+" are :"+obj.maxNumber(a, b, c));
//		obj.minNumber(a, b, c);
		
		
		System.out.print("Enter the number:");
		a=num.nextInt();
		obj.oddOrEvenNum(a);
		
		System.out.print("Enter the age :");
		a=num.nextInt();
		boolean eligible=obj.checkEligibleToVote(a);
		if (eligible)
		{
			System.out.println("The person is eligible to vote.");
		}
		else
		{
			System.out.println("The person is NOT eligible to vote.");
		}
		
		System.out.print("Enter the number:");
		a=num.nextInt();
		obj.isPrimeOrNot(a);
		
		System.out.print("Enter the marks:");
		a=num.nextInt();
		System.out.println("The students grade is :"+obj.calculateGrade(a));
		
		System.out.print("Enter the number:");
		a=num.nextInt();
		System.out.println("The factorial of "+a+" is :"+obj.factorialNum(a));
	}

	
	
	//program to print the sum of two numbers entered by user by defining your own method
	public int sumOfTwoNums(int a, int b)
	{
		return a+b;
	}
	// method that returns the product of two numbers entered by user
	
	public int productOfTwoNums(int a, int b)
	{
		return a*b;
	}
	//program to print the circumference and area of a circle of radius entered by user by defining your own method.
	public float circumOfCircle(float r)
	{
		return (float)(2*3.14*r);
	}
	public float areaOfCircle(float r)
	{
		return (float)(3.14*r*r);
	}
	
	//methods to print the maximum number among three numbers entered by user
	public int maxNumber(int a, int b, int c)
	{
		if (a>b && a>c)		
			return a;		
		else if(b>a && b>c)		
			return b;		
		else		
		return c;
		
	}
	////methods to print the maximum number among three numbers entered by user
	public void minNumber(int a, int b, int c)
	{
		if (a<b && a<c)		
			System.out.println("The minimum number among "+a+", "+b+" and "+c+" are :"+a);		
		else if(b<a && b<c)		
			System.out.println("The minimum number among "+a+", "+b+" and "+c+" are :"+b);		
		else		
			System.out.println("The minimum number among "+a+", "+b+" and "+c+" are :"+c);
		
	}
	
	
	
	//program to find out whether a given number is even or odd
	public void oddOrEvenNum(int a)
	{
		if (a!=0)
		{
			if(a%2==0)			
				System.out.println(a+" is an EVEN number.");			
			else
				System.out.println(a+" is an ODD number.");			
		}
		else
		   System.out.println("Zero is neithre EVEN nor ODD number.");
		
	}
	
	//method to find out if he/she is elligible to vote
	public boolean checkEligibleToVote(int age)
	{
		if(age>=18)		
			return true;		
		else
			return false;
	}
	
	
	
	//method to find out if number is prime or not
	public void isPrimeOrNot(int num)
	{
		boolean prime;
		if(num==0 || num==1)		
			prime=false; 		
		else if (num==2)		
			prime=true; 		
		else
		{
			prime=true;
			for (int i=2;i<num;i++)			  
				 if (num%i==0)
				 {
					 prime=false;
					 break;
				 }			 			  
			
		}
		if (prime)		
			System.out.println(num +" is a prime number.");		
		else		
			System.out.println(num + " is NOT a prime number.");
		
	}
	
	
	//a method that will display grades according to the marks entered as below:
	public String calculateGrade(int marks)
	{
		if (marks>=91 && marks<=100)		
			return "AA";		
		else if (marks>=81 && marks<=90)
			return "AB";
		else if (marks>=71 && marks<=80)
			return "BB";
		else if (marks>=61 && marks<=70)
			return "BC";
		else if (marks>=51 && marks<=60)
			return "CD";
		else if (marks>=41 && marks<=50)
			return "DD";
		else
			return "Fail";
			
	}
	
	//program to print the factorial of a number
	public int factorialNum(int a)
	{
			int fact=1;
			for(int i=a;i>=1;i--)	
			{
				fact=fact*i;		
			}
			return fact;
		
	}
	
	
}
