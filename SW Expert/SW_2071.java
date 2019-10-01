package hodu_day3;

import java.util.Scanner;

public class SW_2071 {          //평균값구하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int num;
		for (int i = 0; i < tc; i++) {
			double max=0;
			for (int j = 0; j < 10; j++) {
				num = sc.nextInt();
				max += num;
			}
			System.out.printf("#%d %.0f\n", i+1, max/10);
		}
		
	}

}
