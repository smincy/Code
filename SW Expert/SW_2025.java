package hodu_day3;

import java.util.Scanner;

public class SW_2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		for (int i = 1; i <= a; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
