import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ������ȣ_2667 {
	public static int N;
	public static int arr[][];
	public static boolean[][] vis;
	public static int dir[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];

		String str;
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		bfs();

	}

	public static void bfs() {
		// ���������� 1�� ã�Ƽ� (�湮ó��) ��� ������ 1�� ã��/ ���̻� ���� ��� ������ + / �Ǵٸ� 1�� ����
		Queue<Integer> que = new LinkedList<Integer>();

	}

}
