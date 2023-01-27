package chapter14.String;

public class Student {
	
	int studentID;
	String studentName;
	
	//생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentID+", "+studentName;
	}

	//물리적 주소 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentID;
	}
	//논리적 비교문(내용을 비교)
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student std=(Student)obj;
			if(studentID == std.studentID) //비교판단
				return true;
			else
				return false;
		}
		
		
		return false;
	}
	
	
	
}
