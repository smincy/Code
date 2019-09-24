package hodu_SW_D2;

import java.util.Scanner;

public class SW_1940 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int s = 0; // 이동거리

			int count = sc.nextInt(); // command 개수 입력

			int a = 0, out = 0;

			for (int i = 1; i <= count; i++) {
				int command = sc.nextInt();
				if (command == 1) {
					int fast = sc.nextInt();
					a += fast;

				} else if (command == 2) {
					int slow = sc.nextInt();
					a -= slow;
					if (a < 0) {
						a = 0;
					}
				}

				out += a;

			}
			System.out.println("#" + tc + " " + out);
		}

	}

}
