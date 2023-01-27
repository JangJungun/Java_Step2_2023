package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter17.Member2;

public class MemberHashSet {
	
	private HashSet<Member2> hashSet;


	
	//생성자를 통한 LinkedList객체 생성
	public MemberHashSet() {
		hashSet=new HashSet<Member2>();
	}
	
	
	
	//addMember2
	public void addMember(Member2 Member) {
		hashSet.add(Member);
	}
	
	//removeMember2
	public boolean removeMember(int Member2Id) {
		Iterator<Member2> ir=hashSet.iterator();
		
		while(ir.hasNext()) {
			Member2 Member = ir.next();
			int tempId=Member.getMemberId();
			if(tempId == Member2Id) {
				hashSet.remove(Member);
				return true;
			}
		}
		System.out.println(Member2Id+"가 존재하지 않습니다.");
		return false;
	}
	
	//showAllMember2
	public void showAllMember() {
		for(Member2 Member:hashSet) {
			System.out.println(Member);
		}
		System.out.println();
	}
	
}
