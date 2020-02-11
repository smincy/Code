package hodu_day3;

import java.util.Arrays;
import java.util.Scanner;

public class SW_2068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int i, j;
		int tc = sc.nextInt();
		for ( i = 0; i < tc; i++) {
			int max = 0;
			for (j = 0; j < 10; j++) {
				int n = sc.nextInt();
				if (n>max) {
					max = n;
				}
			}
			System.out.printf("#%d %d\n", i+1, max);
		}
	}
}
