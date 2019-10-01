package hodu_SW_D2;

import java.util.Scanner;

public class bj_2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[100][100];
		
		int N = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 0 ; i < N; i++) {
		
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = x; j <= x+9; j++) {
				for (int k = y; k <= y+9; k++) {
						if (board[j][k]==0) {
							board[j][k] = 1;
							sum++;	
						}
				}
			}
			
		}
		System.out.println(sum);	
	}

}
