package JavaTraining;

/* get only numeric part from this String:
String s = "your transaction id is: 12345 and reference id is 34567";*/

public class StrManipulationExtractNumericPart {

	public static void main(String[] args) 
	{
	
//		 String str="your transaction id is 12345 and reference id is 34567";
//		 String transId, referenceId;
//		 		 
//		 transId=str.substring(str.indexOf("is")+3,str.indexOf("is")+8 );		 
//		 referenceId=str.substring(str.indexOf("is",str.indexOf("is")+2)+3);		 		 
//		 System.out.println("Transaction Id :"+ transId);
//		 System.out.println("Reference Id :" +referenceId);
//		 
//		 String str1="Selenium Java Training";
//		 String str2;
//		 
//		 str2=str1.substring(str1.indexOf(" ")+1, str1.indexOf(" ", str1.indexOf(" ")+1));
//		 
//		 System.out.println("The 3 word sentence is :" + str1);
//		 System.out.println("The middle word is :"+str2);
//		 
//		
		
		String s = "your transaction id is: 12345 and reference id is: 34567";

	//	System.out.println(s.replaceAll("[^0-9]", ""));
		//s.indexOf("[0-9]");
	
		//System.out.println(s.indexOf(":"));
		System.out.println(s.substring(s.indexOf(":")+2,s.indexOf(":")+7));
		System.out.println(s.substring(s.indexOf(":",s.indexOf(":")+1)+2 )); 
		
		 
	}

}
