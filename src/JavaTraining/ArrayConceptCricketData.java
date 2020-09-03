package JavaTraining;

public class ArrayConceptCricketData {

	public static void main(String[] args) {
		
		Object player1[]= new Object[6];
		player1[0]="Sachin";
		player1[1]=40;
		player1[2]="India";
		player1[3]="01/01/1980";
		player1[4]='M';
		player1[5]=2.86f;
		System.out.println("----------Player 1--------------");
		for(Object o : player1) {
			System.out.println(o);
		}
		
		Object player2[]= new Object[6];
		player2[0]="Sachin";
		player2[1]=40;
		player2[2]="India";
		player2[3]="01/01/1980";
		player2[4]='M';
		player2[5]=2.86f;
		System.out.println("----------Player 2--------------");
		
		for(Object o : player2) {
			System.out.println(o);
		}
		


	}

}
