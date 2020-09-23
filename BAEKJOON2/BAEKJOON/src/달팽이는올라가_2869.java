import java.util.Scanner;

public class 달팽이는올라가_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long V = sc.nextLong();

		/*
		 * int h = 0; int day = 0;
		 * 
		 * while (h < V) { day++; h+=A; if (h>=V) { break; } h-=B; }
		 * System.out.println(day); 									// 시간초과
		 */

		// System.out.println((int) Math.ceil((double) (V - A) / (A - B)) + 1);  	// 수식 이해 안됨
		
		long day = (V-B)/(A-B);					// 기본 수식
		if ((V-B) % (A-B) != 0) {				// 3 1 6 과 같이 낮동안에 올라간 높이가 목표를 초과 할 경우 (기본수식 소수점 발생시)
			 day++;								// 1을 더 해준다 
		}											
		System.out.println(day);
	}

}
