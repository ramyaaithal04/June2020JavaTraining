package JavaTraining;

public class LoopConceptPrg3 {

	public static void main(String[] args) {
		int i;
		
		i=1;
		
		while(i<=100)
		{
			if (i%7==0)
			{
				System.out.println("----------------");
				System.out.println(i + " is multiple of 7. So quitting the loop");
				break;
			}			
			System.out.println(i);
			i++;
		}
		
		
		
//		System.out.println("----For Loop-----");
//		for(i=10;i>=1;i--)
//		{
//			System.out.println(i);
//		}
//		i=10;
//		System.out.println("----While Loop-----");
//		while(i>=1)
//		{
//			System.out.println(i);
//			i--;
//		}
//		i=10;
//		System.out.println("----Do While Loop-----");
//		do
//		{
//			System.out.println(i);
//			i--;
//		}while (i>=1);
//		
//		i=10;
//		System.out.println("----Hello World-----");
//		while(i>=1)
//		{
//			System.out.println("Hello World");
//			i--;
//		}

 }
	
}
