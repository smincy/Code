package hodu_day3;

import java.util.Scanner;

public class SW_2047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String in = sc.next();
		
		for (int i = 0; i < in.length(); i++) {
			int n = (int)in.charAt(i);          //String > int
			System.out.printf("%d ", n-64);
		}
	}
}
