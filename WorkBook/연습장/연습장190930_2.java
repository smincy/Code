package 연습장;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 연습장190930_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		System.out.println("두자리 정수");
//		String s = br.readLine();
//		long st = System.currentTimeMillis();
//		int a = Integer.parseInt(s.substring(0,1));
//		int b = Integer.parseInt(s.substring(1,2));
//		System.out.println(a);
//		if (a==b) {
//			System.out.println("10의 자리와 1의 자리가 같습니다.");
//		}else {
//			System.out.println("10의 자리와 1의 자리가 다릅니다.");
//		}
//		long et = System.currentTimeMillis();
//		System.out.print(et-st);

		int a = 100;
		
		for (int i = 10; i <= 100; i+=10) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				sum = sum + j;
			}
			System.out.println("1부터 "+i+"까지의 합은"+sum);
		}

	}

}
