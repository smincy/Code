package hodu_SW_D2;

import java.util.Scanner;

public class SW_1288_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int N, xN, cur = 0, q;

		for (int tc = 1; tc <= T; tc++) {
			int out = 0;
			int arr[] = new int[10]; // 0~9를 체크할 배열
			N = sc.nextInt(); // 초기값 N
			for (int x = 1;; x++) {
				xN = x * N;
					System.out.println(xN);
				while (xN!=0) {
					arr[xN % 10] = 1;
					xN /= 10;
				}

				//				while (xN != 0 ) {
//					arr[xN % 10] = 1;
//					xN /= 10;
//				}

				for (int j = 0; j < 10; j++) {
					if (arr[j] == 1) {
						cur++;
					}
				}
				
				if (cur == 10) {
					out = x * N;
					break;
				}
					//xN = j * N;
			}
			System.out.println("#" + tc + " " + out);

		}

	} // end of main
	
	static String str = "5\r\n" + 
			"1\r\n" + 
			"2\r\n" + 
			"11\r\n" + 
			"1295\r\n" + 
			"1692";
}
