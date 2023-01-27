package chapter09;

public class Child extends Parent{

	@Override
	public void method2() { //매개변수가 다른게 오버로딩, 
		//매개변수까지 같고 내용을 바꿔주는게 라이딩 단, 라이딩은 상속시에만 사용가능
		
		System.out.println("Child-method2()");
		
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
	
	
	
}
