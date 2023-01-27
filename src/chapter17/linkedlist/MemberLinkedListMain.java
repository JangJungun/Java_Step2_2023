package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		//순서 O, 중복 O
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		//팀원들의 정보
		Member memberPark = new Member(1001, "박창훈");
		Member memberLee = new Member(1002, "이석진");
		Member memberPark2 = new Member(1003, "박찬우");
		Member memberLee2 = new Member(1004, "이세정");
		Member memberHan = new Member(1005, "한성무");
		//회원가입
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberPark2);
		memberLinkedList.addMember(memberLee2);
		memberLinkedList.addMember(memberHan);
		
		memberLinkedList.showAllMember();
		
		memberLinkedList.removeMember(memberPark.getMemberId());
		
		Member memberKim=new Member(1003,"김서우");
		memberLinkedList.addMember(memberKim);
		
		memberLinkedList.showAllMember();
		
	}

}
