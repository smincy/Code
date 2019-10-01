package hodu_SW_D2;

import java.util.Scanner;

public class SW_1954 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			
			int[][] dal = new int[N][N];
			
			int k = N;  	// 회전 후 넣을 숫자 개수
			int n = 0;		// 배열이 넣을 숫자
			int i=0, j=-1;	// 행 / 열		행은 0부터, 열은 1씩 증가하는 count 로 인해 -1부터 >> j+count =0 ; 따라서 0부터
			int count=1;    // 행,열 증가/감소
			while (k>0) {	// 회전 후 넣을 숫자의 개수가 없을때 까지 반복
				for (int p = 0; p < k; p++) {	// 회전 후 넣을 개수만큼 반복
				n++;				// 배열에 넣을 숫자 ++ 따라서 1부터 입력
				j=j+count;			// 행/열 증가 및 감소
				dal[i][j]=n;		// 증감 된 j열 위치에 증가된 n 입력
				}
				k--;		// 회전 후 넣을 숫자의 개수 1개 -
				if (k>0) {		//회전 후 넣을 숫자가 남아있다면 실행
					for (int p = 0; p < k; p++) {
						n++;
						i=i+count;
						dal[i][j]=n;
					}
				}
				count=count*(-1);		// 증가 > 증가 > 감소 > 감소 > 반복
				
			}
			
			
			
			System.out.println("#" + tc);
			for (i = 0; i < N; i++) {
				for (j = 0; j < N; j++) {
					System.out.print(dal[i][j] + " ");
				}
				System.out.println();
			}

		}

	}

}
