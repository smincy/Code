package hodu_SW_D2;

import java.util.Scanner;

public class SW_7728 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int[] X = new int[10];
			int count=0;
			String da = sc.next();
			
			for (int i = 0; i < da.length(); i++) {
				int D = Integer.valueOf(da.substring(i,i+1));
				if (X[D]!=1) {
					count++;
					X[D]=1;
				}
			}
			
			System.out.println("#" + tc + " " + count);
			
		}
		
	}

}
