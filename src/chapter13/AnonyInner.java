package chapter13;

public class AnonyInner {

	public void test() {
		
		new TestInter() {
			
			@Override
			public void printData() { //TestInter ti=new TestInter -> ti.printData();
				System.out.println("화욜팅!!!");
				
			}//추상메소드 구현
		}.printData();
	}//메소드 끝
	
	
	public static void main(String[] args) {
		
		AnonyInner in = new AnonyInner();
		in.test();
		
	}

}
