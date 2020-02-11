package 연습장;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMap_test2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
			// 한글 영어 단어 검색해서 대치되는 단어 출력
		
		HashMap<String, String> hm = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		hm.put("baby", "아기");
		hm.put("love", "사랑");
		hm.put("apple", "사과");
		
		while(true) {
			System.out.println("찾고싶은 단어는?")	;
			String eng = br.readLine();
			if (hm.equals("Exit")) {
				System.out.println("종료합니다");
				System.exit(0);
			}
			String kor = hm.get(eng);
			if (kor == null) {
				System.out.println(eng + "은 없는 단어입니다.");
			}else
			{
				System.out.println(kor);
			}
		}
	}

}
