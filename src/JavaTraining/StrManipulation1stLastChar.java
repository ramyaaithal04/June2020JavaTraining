package JavaTraining;

// program that will print out the first and last character of a word.

public class StrManipulation1stLastChar {

	public static void main(String[] args) 
	{
		String word="Testing";
		System.out.println("The first character of the word " +  word +" is "+ word.charAt(0));
		System.out.println("The last character of the word " +  word +" is "+ word.charAt(word.length()-1));
		
	}

}
