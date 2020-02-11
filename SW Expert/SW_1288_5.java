package hodu_SW_D2;

import java.util.Scanner;

public class SW_1288_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String N = sc.next();
			int Num = Integer.parseInt(N);
			
			int ten[] = new int[10];
			int count = 0;
			int x=1;
		
			for (int i = 0; ; i++) {
				
				for (int j = 0; j < N.length(); j++) {
					int input = Integer.valueOf(N.substring(j,j+1));
					if (ten[input]!=1) 
					{
						ten[input]=1;
						count++;
					}
				}
				if (count==10) {
					break;
				}
				x++;
				N = Integer.toString(x * Num);
				
			}
			System.out.println("#" + tc + " " + N);
			
			
		}
		
	}

}
