package hodu_SW_D2;

import java.util.Scanner;

public class SW_1948_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int temp = 0;
		
		for (int tc = 1; tc <= T; tc++) {
			
			int M1=sc.nextInt();
			int D1=sc.nextInt();
			int M2=sc.nextInt();
			int D2=sc.nextInt();
			temp = D2 - D1 + 1;
			
			for (int i = M1; i < M2; i++) {
				temp = temp + days[i-1];	
			}
			//temp += day;
			
			System.out.println(temp);
		}
		
	}

}
