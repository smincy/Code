import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_2178 {
	public static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static int N, M;
	public static int arr[][];
	public static boolean[][] visited; // 방문처리

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
				int newX = p.x + dir[i][0];	// 다음점
				int newY = p.y + dir[i][1];
				if (!isIn(newX, newY))
					continue; 	// 새로운 포인트가 범위를 벗어나면 건너뛰기
				if (visited[newX][newY] || arr[newX][newY] == 0)
					continue; 	// 방문했던곳이면 건너뛰기

				que.add(new Point(newX, newY));	// 다음에 방문할 포인트를 큐에 넣어주기

				arr[newX][newY] = arr[p.x][p.y] + 1;	// 다음 방문할 곳은 현재 방문했던 곳보다 1칸 더 가야하므르 +1

				visited[newX][newY] = true;	// 방문처리
				
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