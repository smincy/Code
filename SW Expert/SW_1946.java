package hodu_SW_D2;

import java.util.Scanner;

public class SW_1946 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		String arr[] = new String[200];
		int Ki = 0;

		for (int tc = 1; tc <= T; tc++) {
			int temp = 0;
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				String Ci = sc.next();
				Ki = sc.nextInt();

				for (int j = 0; j < Ki; j++) {
					arr[temp + j] = Ci;
				}
				temp += Ki;
			}

			System.out.println("#" + tc);
			for (int i = 0; i < temp; i++) {
				System.out.print(arr[i]);
				if (i % 10 == 9)
					System.out.println();
			}
			System.out.println();

		}

	}

}
