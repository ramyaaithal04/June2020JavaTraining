package Student;

public class StudentTest {

	public static void main(String[] args) {
	
		StudentData obj=new StudentData("Ramya",1234,999);
		
		System.out.println("Name : "+obj.getStdName());
		System.out.println("Roll No : "+obj.getStdRollNo());
		System.out.println("ID : "+obj.getStdId());
	}

}
