package hodu_day3;

import java.util.Scanner;

public class SW_1933 {

	public static void main(String[] args) {

		int input;
		Scanner sc = new Scanner(System.in);

		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if ((input % i) == 0) {
				System.out.printf("%d ", i);
			}
		}

	}

}
