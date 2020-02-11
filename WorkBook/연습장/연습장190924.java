package 연습장;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

import javax.xml.stream.util.StreamReaderDelegate;

public class 연습장190924 {

	
//	public static int sum (int n, int m) { // sum 이라는 메소드
//		
//	}
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<>();
//		
//		int cnt=0;
//		int i=1;
//		while(true) {  			// 해당 키 값(i)에 난수 를 value로 저장 
//			if(cnt==10)break;
//			Integer r = (int)((Math.random()*20)+1);
//			if(hm.containsKey(r)) {
//				continue;
//			}
//			hm.put(i, r);
//			i++;
//			cnt++;
//		}
//		System.out.println(hm);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {	// 단어를 입력하고 중복되는 단어가 입려되면 벨류값 증가하도록
			System.out.println("단어를 입력하세요 ");
			String word = br.readLine();
			System.out.println("단어입력 종료는 X");
			if(word.toUpperCase().equals("X"))break;
			int value;
//			if(hm.get(word)==null) {
//				value=1;
//			}else {
//				value = hm.get(word)+1;
//			}
			hm.put(word, hm.get(word)==null?1:hm.get(word)+1);
		}
		System.out.println(hm);
	}

}
