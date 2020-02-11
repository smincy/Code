package hodu_SW_D2;

import java.util.Scanner;

public class SW_1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();  //tc개수
		int P = 0,Q = 0,R = 0,S = 0,W = 0;
		int Pay = 0;
		
		
		for (int i = 0; i < T; i++) {
			P=sc.nextInt();
			Q=sc.nextInt();
			R=sc.nextInt();
			S=sc.nextInt();
			W=sc.nextInt();
			
			int A_pay = P * W;    // A사 일때 요금
			int B_pay = Q;
			if (W>R) {
				B_pay = Q+((W-R)*S);
			}
			Pay = A_pay > B_pay ? B_pay : A_pay;
			System.out.println("#" + (i+1) + " " + Pay);
		}
		
	}

}
