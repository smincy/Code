package hodu_day3;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a==1) {
			if (b==2) {
				System.out.println("B");
			}else {
				System.out.println("A");
				}
			}
		else if (a==2) {
				if (b==1) {
					System.out.println("A");
				}else {
					System.out.println("B");
				}
			}
		else if (a==3) {
				if (b==1) {
					System.out.println("B");
				}else {
					System.out.println("A");
				}
			}
		}
		//System.out.printf("%d", a);		
}


