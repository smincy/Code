package 연습장;

import java.util.Scanner;

public class 연습장190930_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2자리 정수 입력");
		int w = sc.nextInt();
		long st = System.currentTimeMillis();
		int i = w/10;
		int j = w%10;
		if (i==j) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		long et = System.currentTimeMillis();
		System.out.print(et-st);
	}

}
