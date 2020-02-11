package hodu_SW_D2;

import java.util.Scanner;

public class SW_1945 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			int a = 0, b = 0, c = 0, d = 0, e = 0;
			int N = sc.nextInt();

			while (N % 2 == 0) {
				N /= 2;
				a++;
			}
			while (N % 3 == 0) {
				N /= 3;
				b++;
			}
			while (N % 5 == 0) {
				N /= 5;
				c++;
			}
			while (N % 7 == 0) {
				N /= 7;
				d++;
			}
			while (N % 11 == 0) {
				N /= 11;
				e++;
			}

			System.out.println("#" + i + " " + a + " " + b + " " + c + " " + d + " " + e);
		}

	}

}
