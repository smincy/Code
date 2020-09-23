import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 알람시계_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		M -= 45;
		
		if (M < 0) {
			M += 60;
			H -= 1;
			if (H < 0) {
				H += 24;
			}
		}
		System.out.println(H + " " + M);

	}

}
