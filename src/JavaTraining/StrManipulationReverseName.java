package JavaTraining;

// Program to reverse your own name

public class StrManipulationReverseName {

	public static void main(String[] args) 
	{
		String name="Ramya";
		String reversedname="";
		int i, len;
		
		len=name.length();
		
		for (i=len-1; i>=0; i=i-1)
		{
			reversedname=reversedname+name.charAt(i);
			
		}
		
		System.out.println("My name is :"+name);
		System.out.println("The reverse of my name is :"+reversedname);
	}

}
