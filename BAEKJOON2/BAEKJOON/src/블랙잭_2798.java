import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭_2798 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int temp[];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		temp = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		}

		int min = M;
		int out = 0;

		loop: for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {

					int sum = temp[i] + temp[j] + temp[k];
					if (M == sum) {
						out = sum;
						break loop;
					} else if (M >= sum) {
						out = Math.max(out, sum);
					}
				}
			}
		}
		System.out.println(out);

	}

}
