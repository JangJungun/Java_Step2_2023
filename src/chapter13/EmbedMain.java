package chapter13;

import javax.swing.JOptionPane;

import chapter13.Out2.In;

class Out2{
	
	static int a=1;
	int b;
	
	public static class In{
		
		String Infun() {
			
			return (a+"번째 static 내부 클래스");
		}
	}
}




public class EmbedMain {

	public static void main(String[] args) {
		
		//static은 클래스명으로 직접 접근이 가능함
		In obj1=new In();
		//Out2.In obj2 = new Out2.In();
		
		//2.내부에 있는 메소드
		String str = obj1.Infun();
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
		
	}

}
