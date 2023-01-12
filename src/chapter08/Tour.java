package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		//관광객 등록
		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수: ");
		int gst = scan.nextInt();
		
		//초기화를 통하여 메모리 확보 및 고객생성
		Guide gd = new Guide(gst);
		
		
		Guest gs = new Guest();
		String[] names= new String[gst];
		String[] genders=new String[gst];
		
		System.out.println("관광객 등록");
		
		for(int i=0; i<gst; i++) {
			System.out.print((i+1)+". 이름 : ");
			gs.setName(scan.next());
			names[i]=gs.getName();
			
			System.out.print((i+1)+". 성별 : ");
			gs.setGender(scan.next());
			genders[i]=gs.getGender();
			System.out.println("-------------------------");
		}
		//1,2,3선택시 기능구현
		while(true) {
			System.out.println("1. 관광객 정보\n"+ "2. 목적지 변경\n"+ "3. 종료");
			System.out.print("선택>>> ");
			int num = scan.nextInt();
			
			if(num==1) {
				for(int i=0; i<gst; i++) {
					System.out.println((i+1)+". 이름 : "+names[i]);
					System.out.println((i+1)+". 성별 : "+genders[i]);
					System.out.println((i+1)+". 목적지 : "+Guide.point);
					System.out.println("----------------------");
				}
				System.out.println("==============================");
				continue;
			}else if(num==2) {
				System.out.print("어디로 변경하시겠습니까 : ");
				Guide.point=scan.next();
				System.out.println(Guide.point+"로 목적지 변경");
				System.out.println("==============================");
				continue;
			}else if(num==3) {
				break;
			}else {
				System.out.println("번호를 제대로 입력하십시오.");
				continue;
			}
			
		}
			
		System.out.println("종료");
			
			
	}

}
