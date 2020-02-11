package hodu_SW_D2;

import java.util.Scanner;

public class SW_6958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			int pro[][] = new int[N][M];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					pro[i][j] = sc.nextInt();
				}
			}
			
			int out=0, per=0;
			for (int i = 0; i < N; i++) {
				int count=0;
				for (int j = 0; j < M; j++) {
					if (pro[i][j]!=0) {
						count++;
					}
					if (out<count) {
						out = count;
					}
				}
			}
			
			for (int i = 0; i < N; i++) {
				int count2=0;
				for (int j = 0; j < M; j++) {
					if (pro[i][j]!=0) {
						count2++;
					}
				}
				if (out==count2) {
					per++;
				}
			}
			
			
			System.out.println("#" + tc + " " + per + " " + out);

		}

	}

}
