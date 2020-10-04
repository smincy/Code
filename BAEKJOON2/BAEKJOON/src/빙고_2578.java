import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 빙고_2578 {

	public static int[][] MAP;
	public static int[] num;
	public static int bingoCnt = 0;
	public static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
		Scanner sc = new Scanner(System.in);

		MAP = new int[5][5]; // 맵
		num = new int[25]; // 부르는 숫자

		for (int i = 0; i < 5; i++) {
			//String str[] = br.readLine().split(" ");
			for (int j = 0; j < 5; j++) {
				//MAP[i][j] = Integer.parseInt(str[j]);
				MAP[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 25; i++) {
				num[i] = sc.nextInt();
			}

		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {

					if (num[i] == MAP[j][k]) {
						MAP[j][k] = 0; // 부르는 숫자를 0 으로 바꿔주기

						if (isBingo(MAP, j, k)) {

							// i 확인
							result = i;
							System.out.println(result + 1);
							return;

						}
					}
				}
			}
		}

	}

	public static Boolean isBingo(int[][] array, int row, int column) {

		if (MAP[0][0] == 0 && MAP[1][1] == 0 && MAP[2][2] == 0 && MAP[3][3] == 0 && MAP[4][4] == 0) {
			// 대각선 좌>우 검사
			++bingoCnt;
		}
		if (MAP[0][4] == 0 && MAP[1][3] == 0 && MAP[2][2] == 0 && MAP[3][1] == 0 && MAP[4][0] == 0) {
			// 대각선 우>좌 검사
			++bingoCnt;
		}

		int tmp = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (MAP[i][j] == 0) {
					tmp++;
				}
			}
			if (tmp == 5) {
				++bingoCnt;
			} // 행검사 완료
			tmp = 0;

			for (int j = 0; j < 5; j++) {
				if (MAP[j][i] == 0) {
					tmp++;
				}
			}
			if (tmp == 5) {
				++bingoCnt;
			} // 열검사 완료
			tmp = 0;
		}

		if (bingoCnt >= 3) {
			return true;
		} else {
			bingoCnt = 0; // 빙고카운트를 0 으로 바꾸는 이유가.....??
			return false;
		}
	}
}
