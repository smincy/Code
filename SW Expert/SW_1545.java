import java.util.Scanner;

public class SW_1545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, in, out;
		Scanner sc = new Scanner(System.in);
		in = sc.nextInt();
		
		System.out.printf("%d ",1);
		
		for ( i = 1; i <= in; i++) {
			out= (int)Math.pow(2, i);
			System.out.printf("%d ", out);
			
		}
	}
}
