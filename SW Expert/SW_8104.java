package hodu_SW_D2;

import java.util.Scanner;

public class SW_8104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			int stu = N * K;  //총 학생 수
			
			int n=0;
			
			int team[][] = new int[K][N];
			
			for (int j = 0; j < K; j++) {
				for (int i = 0; i < N; i++) {
					
					team[j][i]=j+1;
					if (i==K) {
						
					}
					
				}
			}
				
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(team[i][j]);
				}
				System.out.println();
			}
			}
			
			
			
	}
	
}


