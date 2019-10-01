package 연습장;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 연습190930 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("시험 점수를 입력하세요");    // 시험점수/합격점수 표시
//		int s = Integer.parseInt(br.readLine());
//		
//		System.out.println("합격점수를 입력하세요");
//		int m = Integer.parseInt(br.readLine());
//		if (s>=m) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		
		
		System.out.println("값을 입력하세요");  //3의 배수 
		int a = Integer.parseInt(br.readLine());
		if (a%3==0) {
			System.out.println("3의 배수입니다");
		}else{
			System.out.println("3의 배수가 아닙니다");
		}
		
		
	}

}
