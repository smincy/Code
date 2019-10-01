package hodu_day3;

import java.util.Scanner;

public class SW_2029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tc, in, di;

		Scanner sc = new Scanner(System.in);

		tc = sc.nextInt();

		for (int i = 1; i <= tc; i++) {
			in = sc.nextInt();
			di = sc.nextInt();

			System.out.printf("#%d %d %d\n", i, in / di, in % di);

		}

	}

}
