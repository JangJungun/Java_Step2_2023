package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 Skill값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			//문자를 아스키코드로 형변환
			//방법1
			//charAt(0) : 문자(char) 또는 분자열(String) => ASCII 즉 int
			char n = scan.next().charAt(0);
			
			//System.in.read() : 콘솔에 입력받기 모든 입력값을 아스키코드값
			//int ch = System.in.read();//아스키코드값
			//방법2
			//String mun = scan.nextLine();
			//int ch = mun.charAt(0); //charAt(0) : String -> ASCII(int)
			
			Scheduler scheduler = null;
			
			
			
			//객체 생성
			if(n==82 || n==114) {
				scheduler = new RoundRobin();
				//scheduler.getNextCall();
				//scheduler.sendCallToAgent();
			}else if(n==76 || n==108) {
				scheduler= new LeastJob();
				//scheduler.getNextCall();
				//scheduler.sendCallToAgent();
			}else if(n==80 || n==112) {
				scheduler = new PriorityAllocation();
				//scheduler.getNextCall();
				//scheduler.sendCallToAgent();
			}else if(n==83 || n==115) {
				System.out.println("업무를 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}//if
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			
			
		}//while
		
	}//main

}//class
