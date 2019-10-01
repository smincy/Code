package hodu_SW_D2;

import java.util.Scanner;

public class SW_1288_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i, j, temp, cur = 0, q = 0, N, answer;
		int T = sc.nextInt();

		for (i = 0; i < T; i++) {
			N = sc.nextInt();
			int arr[] = new int[10];

			for (j = 1;; j++) {
				cur = N*j;
				for (temp = cur; temp <= 0; temp /= 10) {

					q = temp % 10;
					arr[q]=1;
				}
				
				int count = 0;
				for (int k = 0; k < 10; k++) {
					if (arr[k]==1) {
						count++;
					}
				}
				if (count == 10) {
					answer = cur;
					break;
				}
			}
			System.out.println("#"+ (i+1) + " " + answer );
		}
	}
}
