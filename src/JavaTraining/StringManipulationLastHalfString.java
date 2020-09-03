package JavaTraining;

//program that gives you last half of the string

public class StringManipulationLastHalfString {

	public static void main(String[] args) 
	{
	 String str1,str2;
	 int len;
	 
	 str1="I love Java";
	 System.out.println("last index of "+str1.lastIndexOf(""));
	 len=str1.length();
	 
	 str2=str1.substring(len/2);
	 System.out.println("Full string :"+str1);
	 System.out.println("Last half of the string :"+str2);
	 }

}
