package hodu_day3;

import java.util.Scanner;

public class SW_2070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int input1, input2;
		
		for (int i = 0; i < tc; i++) {
			input1 = sc.nextInt();
			input2 = sc.nextInt();
			
			if (input1<input2) {
				System.out.printf("#%d <\n", i+1);
			}else if (input1==input2) {
				System.out.printf("#%d =\n", i+1);
			} else {
				System.out.printf("#%d >\n", i+1);
			}
			
		}
	}

}
