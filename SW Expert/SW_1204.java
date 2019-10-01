package hodu_SW_D2;

import java.util.Scanner;

import javax.management.relation.InvalidRoleInfoException;

public class SW_1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // tc개수

		for (int i = 1; i <= T; i++) {
			int score = 0;
			int array[] = new int[101];

			int tc = sc.nextInt(); // tc번호

			for (int j = 1; j <= 1000; j++) {
				score = sc.nextInt();              //점수입력
				array[score]++;                    //array배열에 점수위치에 +1
			}
			int max = 0, max_index = 0;
			
			for (int j = 0; j <= 100; j++) {
				if (max <= array[j]) {               //카운트 최대값 비교
					max = array[j];
					max_index = j;                   //카운트 최대값에 해당하는 인덱스 저장
				}
			}

			System.out.printf("#%d %d\n", tc, max_index);
		}

	}

}
