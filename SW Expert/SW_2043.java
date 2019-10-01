package hodu_day3;

import java.util.Scanner;

public class SW_2043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p, k, c = 1;

		Scanner sc = new Scanner(System.in);

		p = sc.nextInt();
		k = sc.nextInt();

		while (p != k) {
			if (p == k) {
				break;
			}
			k++;
			c += 1;
		}

		System.out.println(c);

	}

}
