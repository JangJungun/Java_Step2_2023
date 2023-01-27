package chapter17.hashset;

import chapter17.Member;
import chapter17.Member2;
import chapter17.linkedlist.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		//순서 O, 중복 O
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//팀원들의 정보
		Member2 memberPark = new Member2(1001, "박창훈");
		Member2 memberLee = new Member2(1002, "이석진");
		Member2 memberPark2 = new Member2(1003, "박찬우");
		Member2 memberLee2 = new Member2(1004, "이세정");
		Member2 memberHan = new Member2(1005, "한성무");
		//회원가입
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark2);
		memberHashSet.addMember(memberLee2);
		memberHashSet.addMember(memberHan);
		
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(memberPark.getMemberId());
		//방법1
		//Member2 memberKim=new Member2(1003,"박찬우");
		//방법2
		Member2 memberKim=new Member2(1003,"김진수");
		memberHashSet.addMember(memberKim);
		
		memberHashSet.showAllMember();
		
	}
		
		
		
		
	

}
