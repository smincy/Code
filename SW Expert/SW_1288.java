package hodu_SW_D2;

import java.util.*;
import java.util.Scanner;
import java.util.Set;

public class SW_1288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();

		int N, i, j, temp, q, cur;

		Set<Integer> seen = new HashSet<Integer>();

		for (i = 1; i <= T; i++) {
			N = sc.nextInt();
			seen.clear();
			for (j = 1;; j++) {
				cur = N * j;
				for (temp = cur; temp > 0; temp /= 10) {
					q = temp % 10;
					seen.add(q);
				}
				if (seen.size() > 9) {
					break;
				}
			}
			System.out.println("#" + i + " " + cur);

		}
	}
}