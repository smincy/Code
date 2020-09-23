import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 숫자의개수_2577 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*
		//Int형 풀이
		int[] temp = new int[10];
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int ans = A * B * C;
		while (ans > 0) {
			temp[ans % 10]++;
			ans /= 10;
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
*/
		
		//String형 풀이
		int[] temp = new int[10];
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String ANS = String.valueOf(A*B*C);    // 결과를 String형으로 변환
		for (int i = 0; i < ANS.length(); i++) {	// ANS 크기만큼 확인
			temp[ANS.charAt(i)-'0']++;			// '0' = 60 을 빼줌으로 아스키코드 1~9의 값만 남게됨
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
	}

}
