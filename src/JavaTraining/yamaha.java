package JavaTraining;

public class yamaha {

	public static void main(String[] args) {
		
		
		int count=0;
		String input="yamaha";
		String output="";
		
		
		for(int i=0;i<input.length();i++)
		{						
			if ( String.valueOf(input.charAt(i)).equals("a"))			
			{	
				for (int j=0;j<=count;j++)				
					output=output+'a';
				
				count=count+2;
			}
			else
			 output=output+input.charAt(i);					
			
		}

		System.out.println("Input :" +input);
		System.out.println("Input :" +output);
		
	}

}
