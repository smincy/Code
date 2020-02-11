package hodu_SW_D2;

import java.util.Scanner;

public class SW_1859 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt(); // 거래품 개수
			int[] num = new int[N]; // 거래품개수만큼의 배열

			for (int i = 0; i < N; i++) {
				num[i] = sc.nextInt(); // 배열에 금액 입력
			}
			int max = num[N - 1]; // 가장 마지막 입력을 일단 최대값으로 저장
			long sum = 0; // 이익 초기화

			for (int i = N - 2; i >= 0; i--) { // 뒤에서부터 한칸씩 비교해가며
				if (max < num[i]) { // 앞 금액이 크면 최대값 변경
					max = num[i];

				} else {
					sum += max - num[i]; // 뒤에값 (최대값)이 크면 차이만큼 이익에 저장
				}
			}
			System.out.println("#" + tc + " " + sum);

		}
	}

}
