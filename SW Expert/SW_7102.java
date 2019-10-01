package hodu_SW_D2;

import java.util.Scanner;

public class SW_7102 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			int S = 0, Out = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] sum = new int[N + M + 1];

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++) {
					sum[i + j] += 1;
				}
			}

			for (int i = 1; i <= N+M; i++) {
				if (Out <= sum[i]) {
					Out = sum[i];
				}
			}
			
			
			System.out.print("#" + tc);
			for (int i = 1; i <= N + M; i++) {
				if (sum[i] == Out) {
					System.out.print(" " + i);
				}
			}

//			System.out.println(Out);
		}
	}

}
