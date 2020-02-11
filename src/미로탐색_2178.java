import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class �̷�Ž��_2178 {
	public static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static int N, M;
	public static int arr[][];
	public static boolean[][] visited; // �湮ó��

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		String str;
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}

		visited[0][0] = true;
		bfs();
		System.out.println(arr[N - 1][M - 1]);
	}

	public static void bfs() {
		Queue<Point> que = new LinkedList<>();

		que.add(new Point(0, 0));

		while (!que.isEmpty()) {
			Point p = que.poll();

			for (int i = 0; i < dir.length; i++) {
				int newX = p.x + dir[i][0];	// ������
				int newY = p.y + dir[i][1];
				if (!isIn(newX, newY))
					continue; 	// ���ο� ����Ʈ�� ������ ����� �ǳʶٱ�
				if (visited[newX][newY] || arr[newX][newY] == 0)
					continue; 	// �湮�ߴ����̸� �ǳʶٱ�

				que.add(new Point(newX, newY));	// ������ �湮�� ����Ʈ�� ť�� �־��ֱ�

				arr[newX][newY] = arr[p.x][p.y] + 1;	// ���� �湮�� ���� ���� �湮�ߴ� ������ 1ĭ �� �����ϹǸ� +1

				visited[newX][newY] = true;	// �湮ó��
				
			}
		}

	}

	public static class Point {
		int x;
		int y;

		public Point(int a, int b) {
			this.x = a;
			this.y = b;
		}
	}

	public static boolean isIn(int i, int j) {
		return i >= 0 && i < N && j >= 0 && j < M;
	}

}