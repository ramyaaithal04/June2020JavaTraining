package JavaTraining;

import java.util.ArrayList;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		int temp;
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		
		System.out.println("Using lamda");
		num.stream().forEach(ele -> System.out.println(ele));
		
		// program to reverse elements in a array list
		int j=0;
		System.out.println("---------Before Reversing----------");
		for(int i : num)
			{
				System.out.println(i);
			}
		for(int i=(num.size()-1);i>=(num.size()/2);i--)
		{
			temp=num.get(i);
			num.set(i, num.get(j));
			num.set(j, temp);
			j++;
			
		}
		
		System.out.println("---------After Reversing----------");
		for(int i : num)
			{
				System.out.println(i);
			}
		
		//program of swap two elements in an array list
		System.out.println("---------Before Swapping First and last elements----------");
		for(int i : num)
			{
				System.out.println(i);
			}
		
		temp=num.get(0);
		num.set(0, num.get(num.size()-1));
		num.set(num.size()-1, temp);
		
		System.out.println("---------After Swapping First and last elements----------");
		for(int i : num)
			{
				System.out.println(i);
			}
	//  program to print all the elements of a ArrayList using the position of the elements
			System.out.println("Printing arraylist using position of the element");
			for(int i=0; i<num.size();i++)
			{
				System.out.println("At index "+i+" element "+ num.get(i)+ " is present.");
			}
			
			
		
		//program to empty an array list
		System.out.println("---------Before Emptying----------");
		for(int i : num)
			{
				System.out.println(i);
			}
		num.clear();
		if (num.isEmpty())
		{
			System.out.println("ArrayList is empty now.");
		}
		
		
	
		
		
	}

}
