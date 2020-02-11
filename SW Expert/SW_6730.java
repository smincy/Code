package hodu_SW_D2;

import java.util.Scanner;

public class SW_6730 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();  // 블록의 개수
			int[] temp = new int[N+1];
			int h = 0, up=0, down=0, max = 0, min=0;
			for (int i = 0; i < N; i++) {	
				temp[i] = sc.nextInt(); // 블록 높이 N개 입력
			}
			for (int i = 0; i < N-1; i++) {
				if (temp[i] < temp[i+1]) {
					up=temp[i+1]-temp[i];
					if (max<up) {
						max = up;
					}
					
				}else if (temp[i+1] < temp[i]) {
					down=temp[i]-temp[i+1];
					if (min<down) {
						min = down;
						//System.out.println(down);
					}
				}
				
			}
			
			
			
			System.out.println("#" + tc + " " + max + " " + min);
			
			
		}
		
	}

}
