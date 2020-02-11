package hodu_SW_D2;

import java.util.Scanner;

public class SW_1288_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String N = sc.next(); // String형 N 입력
			int num = Integer.parseInt(N); // int형으로 N 입력

			int check[] = new int[10]; // 0~9 주소에 1 인지 판별하기위해 배열
			int count = 0; // 배열에 1이면 ++ 할 카운트

			int x = 1; // xN 곱해줄 녀석

			while (true) { // 무한루프

				for (int i = 0; i < N.length(); i++) { // String형 N의 0번째 부터 N의길이 까지
					int ot = Integer.valueOf(N.substring(i, i + 1)); // String형 N 의 숫자 하나씩 ot에 int형으로 입력
					if (check[ot] == 0) { // check 배열 ot 자리에
						check[ot] = 1; // 0인 곳을 1로
						count++; // count 에 1로 바뀔때마다 1개씩 카운트
					}

				}

				if (count == 10) { // count 가 10 이면 탈출
					break;
				}

				x++;
				N = Integer.toString(x * num); // (int형 x * int형 num) 을 String N 으로
			}
			System.out.println("#" + tc + " " + N);
		}

	}

}
