package hodu_SW_D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_8958 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());  // 정수입력
		
		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();
			int count = 0, sum=0;
			
			if (str.charAt(0)=='O') {
				sum = sum+ ++count;
			}
			
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i)=='O') {
					sum = sum+ ++count;
					
				}else 
					count = 0;
				
			}
			System.out.println(sum);
		}
		
	}

}
