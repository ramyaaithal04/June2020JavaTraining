package Student;

public class StudentData {
	
	private String 	stdName;
	private int stdRollNo;
	private int stdId;
	
	public StudentData(String stdName, int stdRollNo, int stdId) {
	
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdRollNo() {
		return stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	
	

}
