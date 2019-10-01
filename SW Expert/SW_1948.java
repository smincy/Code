package hodu_SW_D2;

import java.util.Scanner;

public class SW_1948 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int tc = 1; tc <= T; tc++) {

			int M1 = sc.nextInt();
			int d1 = sc.nextInt();
			int M2 = sc.nextInt();
			int d2 = sc.nextInt();
			int temp = d2 - d1 + 1;

			for (int i = M1; i < M2; i++) {
				temp = temp + days[i - 1];
			}
			System.out.println("#" + tc + " " + temp);   

		}

	}

}
