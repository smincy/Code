import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 사분면고르기_14681 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		
		if (X < 0) {
			if (Y < 0) {
				System.out.println(3);
			}else {
				System.out.println(2);
			}
		}else {
			if (Y < 0) {
				System.out.println(4);
			}else {
				System.out.println(1);
			}
		}
	}

}
