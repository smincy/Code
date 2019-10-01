package hodu_day3;

import java.util.Scanner;

public class SW_2056 {               // 연/월/일  숫자 확인 후 출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int dcount[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			String input = sc.next();
			int m = Integer.valueOf(input.substring(4,6));
			int d = Integer.valueOf(input.substring(6,8));       
			String re = "-1";
			if (m<=12 && d<=31 && 0<m && d<=dcount[m-1]) {
				re = String.format("%s/%s/%s", input.substring(0,4), input.substring(4,6), input.substring(6,8));
			}
			System.out.printf("#%d %s\n", i+1, re);
		}
		
		
		
		
	}

}
