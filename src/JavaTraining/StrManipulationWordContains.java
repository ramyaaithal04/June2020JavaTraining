package JavaTraining;

//program to verify a word or a character contains in the sentence.

public class StrManipulationWordContains {

	public static void main(String[] args)
	{
		String sentence="I am learning java.";
		String searchword="java";
		
		if ( sentence.contains(searchword))
			{
				System.out.println("The word/character " + searchword + " contains in the sentence " + sentence);
			}
		else
		{
			System.out.println("The word/character " + searchword + " does not contain in the sentence " + sentence);
		}
				
	}
	
}
