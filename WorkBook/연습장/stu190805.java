package algo;

public class stu190805 {

		final static int N = 15;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
//		String a = "I Love You";
//		
//		if (a.contains("Love")) {    //해당 문자가 포함하는 경우 실행
//			System.out.println("Me too.");
//		}
//		else
//		{
//			System.out.println("I Hate You.");	//포함하지 않는 경우 실행
//		}
//		
		
		//x^2 + y^2 = r^2;       원의 넓이 수학 공식
		
		for (int i = -N; i <= N; i++) {
			for (int j = -N; j <= N; j++) {
				if (i*i+j*j<= N*N) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
	}		
}


