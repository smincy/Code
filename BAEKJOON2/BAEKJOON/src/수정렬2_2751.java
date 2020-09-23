import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수정렬2_2751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> arr = new ArrayList<>();					// List 사용...

		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine())); 			// List에 데이터 추가
		}
		Collections.sort(arr); 									// List 정렬
		for (int i = 0; i < N; i++) {
			System.out.println(arr.get(i));					    // List 인덱스 값 조회
		}

	}
}
