package chapter08;

public class StudentMain2 {

	public static void main(String[] args) {
		Student2 studentLee=new Student2();
		studentLee.setStudentName("이재민");
		studentLee.studentID=studentLee.serialNum;
		System.out.println("이름 : "+ studentLee.StudentName+
							" 아이디 : "+ studentLee.studentID);
		//System.out.println(studentLee.getSerialNum());
		System.out.println(Student1.getSerialNum());
		//studentLee.serialNum++;
		Student2.serialNum++;//10000
		
		
		
		System.out.println();
		Student2 studentKim=new Student2();
		studentKim.setStudentName("김창우");
		studentKim.studentID=studentKim.serialNum;
		System.out.println("이름 : "+ studentKim.StudentName+
							" 아이디 : "+ studentKim.studentID);
		
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student1.getSerialNum());
		Student2.serialNum++;//10001
		
		System.out.println();
		Student2 studentPark=new Student2();
		studentPark.setStudentName("박창훈");
		studentPark.studentID=studentPark.serialNum;
		System.out.println("이름 : "+ studentPark.StudentName+
							" 아이디 : "+ studentPark.studentID);
		System.out.println(studentPark.StudentName);
		//System.out.println(studentPark.getSerialNum());
		System.out.println(Student2.getSerialNum());
		Student2.serialNum++;//10002
		
		
		
		
		
		
	}

}
