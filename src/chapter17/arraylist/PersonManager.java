package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select;
		Person p ;
		
		ArrayList<Person> personArr=new ArrayList<Person>();
		
		while(true) {
			
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보보기");//iterator
			System.out.println("4. 종료");
			System.out.print("항목선택 : ");
			
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			
			//if switch
			
			if(select == 1) {
				p = new Person();
				System.out.println("-----정보추가-----");
				System.out.print("이 름 : ");
				p.setName(scan.next());
				System.out.print("나 이 : ");
				p.setAge(scan.nextInt());
				System.out.print("전화번호 : ");
				p.setTel(scan.next());
				
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
			}else if(select == 2) {
				System.out.println("-----회원탈퇴-----");
				System.out.print("회원 명 : ");
	            String name = scan.next();
	            for (int i = 0; i < personArr.size(); i++) {
	               if (name.equals(personArr.get(i).getName())) {
	                  personArr.remove(i);
	                  System.out.println(name+"의 정보가 삭제되었습니다!");
	                  break;
	               } else
	                  if(i+1 == personArr.size())
	            	   System.out.println("회원이 존재하지 않습니다.");
	            }
				
				
			}else if(select == 3) {
				for(int i=0; i<personArr.size(); i++) {
					System.out.println("-----회원정보-----");
					System.out.println("등록인원 "+personArr.size() + "명");
					
					
					System.out.println("회원번호 : " + (i+1));
		            System.out.println("이름 : " + personArr.get(i).getName());   
		            System.out.println("나이 : " + personArr.get(i).getAge());   
		            System.out.println("전화 : " +personArr.get(i).getTel());
				}
			}else if(select == 4) {
				break;
			}
			System.out.println("-------------------------");
		}
		System.out.println("종료합니다.");
	}
	
	
}
