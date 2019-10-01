package hodu_day3;

import java.util.Scanner;

public class SW_2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,sum=0, input = sc.nextInt();
		
		for (int i = 0; i < 4; i++) {
			a = input%10;                    // 뒤에서부터 나머지 9+8+7+6
			input = input/10;                // 더한 수 넘기기 
			
			sum += a;
		}
		
		System.out.println(sum);
		
		
	}

}
