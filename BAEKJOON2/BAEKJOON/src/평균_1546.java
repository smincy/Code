import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균_1546 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double point[] = new double[N];
		int M = 0; 
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			point[i] = Integer.parseInt(st.nextToken());
			if (point[i] > M) {
				M = (int)point[i];
			}
		}
		double sum = 0; 
		for (int i = 0; i < N; i++) {
			double temp = point[i];
			point[i] = (temp / M) * 100;
			sum += point[i];
		}
		
		System.out.println(sum/N);
	}

}
