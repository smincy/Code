import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 단어공부_1157 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		int max = 0;
		char ind = 0;

		String str = br.readLine().toUpperCase();
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-'A']++;		// A = 65
			
			if (max < arr[str.charAt(i)-'A']) {
				max = arr[str.charAt(i)-'A'];
				ind = str.charAt(i);
			}else if (max==arr[str.charAt(i)-'A']) {
				ind = '?';
			}
			
		}
		
			System.out.println(ind);

	}

}
