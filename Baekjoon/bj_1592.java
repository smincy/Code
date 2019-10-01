package hodu_SW_D2;

import java.util.Scanner;

public class bj_1592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int some[]	= new int[1000];
		int count=-1, i=0;
		
		while (true) {	
			count++;
			some[i]++;
			if (some[i]==M) {
				break;
			}
			if (some[i]%2==0) {
				i=i-L;
				if (i<0) {
					i=i+N;
				}
			}else if (some[i]%2==1) {
				i=i+L;
				if (i>=N) {
					i=i-N;
				}
			}
			
		}
		System.out.println(count);
	}

}
