package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		//Map<String Integer생성 map
		Map<String, Integer> map = new HashMap<String, Integer>();
		//팀원 데이터(성함, 학번)저장
		map.put("박창훈", 1001);
		map.put("이석진", 1002);
		map.put("박찬우", 1003);
		map.put("이세정", 1004);
		map.put("한성무", 1005);
		
		//팀원의 인원
		System.out.println("총 Entry 수 : "+map.size());
		
		//팀장의 학번을 알아내자
		System.out.println("\t박창훈 : "+map.get("박창훈"));
		System.out.println();
		//팀원 모두의 학번 출력
		System.out.println("총 Entry 수 : "+map.size());
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();//키받기
			Integer value=map.get(key);//키를 이용하여 값받기
			System.out.println("\t"+key+" : "+value);
			
		}
		System.out.println();
		
		
		
	}

}
