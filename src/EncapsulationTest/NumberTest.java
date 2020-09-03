package EncapsulationTest;

public class NumberTest {

	public static void main(String[] args) {
	
		Number obj=new Number();
		obj.setI(100);
		obj.setS("Ramya");
		obj.setF(10.5f);
		
		System.out.println("The value of i = "+obj.getI());
		System.out.println("The value of i = "+obj.getS());
		System.out.println("The value of i = "+obj.getF());
		
	}

}
