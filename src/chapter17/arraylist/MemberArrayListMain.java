package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		//팀원들의 정보
		Member memberPark = new Member(1001, "박창훈");
		Member memberLee = new Member(1002, "이석진");
		Member memberPark2 = new Member(1003, "박찬우");
		Member memberLee2 = new Member(1004, "이세정");
		Member memberHan = new Member(1005, "한성무");
		//회원가입
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberPark2);
		memberArrayList.addMember(memberLee2);
		memberArrayList.addMember(memberHan);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberPark.getMemberId());
		
		memberArrayList.showAllMember();
		
		
	}

}
