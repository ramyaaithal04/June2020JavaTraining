package JavaTraining;

public class StrManipulationThirdOccurenceOfE {

	public static void main(String[] args) 
	{

		 String str3="Welcome to Naveen Automation Lab!";
		 int index;
		 
		 index=str3.indexOf('e', str3.indexOf('e')+1);
		 System.out.println("The third 'e' is present at the index "+str3.indexOf('e',index+1)+" in the sentence - "+str3);

	}

}
