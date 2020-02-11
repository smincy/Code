package hodu_SW_D2;

import java.util.Scanner;

public class SW_8104_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			int K = sc.nextInt();

			int sum = 0;

			System.out.print("#" + tc);

			if (N % 2 == 0) {
				sum = N * (N * K + 1) / 2;
				for (int i = 0; i < K; i++) {
					System.out.print(" " + sum);
				}
			} else {
				sum = (N - 1) * (N - 1) * K + 1 / 2;
				sum += (N - 1) * K + 1;
				for (int i = 0; i < K; i++) {
					System.out.print(" " + sum);
				}

			}

		} 
		return;
	}

}
