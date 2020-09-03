package JavaTraining;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//Program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("RED");
		colours.add("YELLOW");
		colours.add("WHITE");
		colours.add("GREEN");
		colours.add("BLACK");
		colours.add("PINK");
				
		for(String c : colours)
		{
			System.out.println(c);
		}
		
		//Program to insert an element into the array list at the first and last positions.
		System.out.println("-------------------------------------------");
		System.out.println("After adding elements at first and last index");
		colours.add(0,"GREY");
		colours.add(colours.size(),"BROWN");
		
		for(String c : colours)
		{
			System.out.println(c);
		}
		
		// Program to retrieve an element (at a specified index) from a given array list
		System.out.println("-------------------------------------------");
		System.out.println("The data present at index 4 is - " + colours.get(4));
		
		//Program to update specific array element by given element.
		System.out.println("-------------------------------------------");
		System.out.println("The data present at index 1 is - "+colours.get(1));
		colours.set(1, "BLUE");
		System.out.println("After updating the element, the data present at index 1 is - "+colours.get(1));
		
		//Program to remove the third element from an array list
		System.out.println("-------------------------------------------");
		System.out.println("-----------BEFORE Removing Third Element-------------");
		for(String c : colours)
		{
			System.out.println(c);
		}
		colours.remove(2);		
		System.out.println("-----------After Removing Third Element-------------");
		for(String c : colours)
		{
			System.out.println(c);
		}
		
		//Program to search an element in a array list.
		System.out.println("-------------------------------------------");
		int i=colours.indexOf("BLUE");
		if(i == -1)
		{
			System.out.println("Element BLUE is not found in the ArrayList.");
		}
		else
		{
			System.out.println("Element BLUE is found in the arraylist at index : " +i);
		}
	
	}

}
