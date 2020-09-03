package JavaTraining;

/* Write a method which gives index of (-1) if string is not available. 
if String is present, then it should return the specific index. */

public class StrManipulationIsStringPresent {

	public static void main(String[] args)
	{
		String str="I love shopping.";
		String searchStr="shop";
		
		if (str.indexOf(searchStr) != -1)
		{
			System.out.println(searchStr + " is present in string "+str+ " at index "+ str.indexOf(searchStr));
			
		}
		else 
		{
			System.out.println(searchStr + " is not present in string "+str+ " The index is "+ str.indexOf(searchStr));
		}
	}

}
