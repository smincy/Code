package 연습장;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hash_이름_점수기록_test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		hm.put("김성동", 97);
		hm.put("황기태", 88);
		hm.put("김남윤", 98);
		hm.put("이재문", 70);
		hm.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : " + hm.size());
		Set<String> keys = hm.keySet(); //모든 key를 가진 Set컬렉션 리턴
		Iterator<String> it = keys.iterator();
		// Set에 있는 모든 key를 순서대로 검색하는 Iterator 리던
		while(it.hasNext()) {
			String name = it.next(); // 다음키, 학생이름
			int score = hm.get(name);
			System.out.println(name + " : " + score);
		}
	}

}
