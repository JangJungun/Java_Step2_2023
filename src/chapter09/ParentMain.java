package chapter09;

public class ParentMain {

	public static void main(String[] args) {
		
		ChildExam c1 = new ChildExam();
		
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());//상속받은 재산
		System.out.println("------------------------------");
		//--------------------------------------
		if(c1 instanceof parentExam) {
			System.out.println("c1은 parentExam의 자식 클래스 입니다.");
			System.out.println(c1.getMoney());
		}
		
		//--------------------------------------
		//형변환
		ChildExam ch = new ChildExam();
		parentExam p1 = new parentExam();
		System.out.println("------------------------");
		//부모=자식
		p1=ch;//자동형변환
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("------------------------");
		
		ch=(ChildExam)p1;//명시적인 형변환
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
	}

}
