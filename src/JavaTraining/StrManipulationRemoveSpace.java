package JavaTraining;

// Remove all  spaces in a String

public class StrManipulationRemoveSpace {

	public static void main(String[] args) 
	{
		String str;
		
		str="    Hello    Everyone    ";
		System.out.println("Old String :" + str);
		str=str.replace(" ","");		
		System.out.println("New String: " + str);

	}

}
