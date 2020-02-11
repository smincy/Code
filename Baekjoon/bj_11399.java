package hodu_SW_D2;

import java.util.Scanner;

public class bj_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		int temp, sum = 0, out2 = 0;
		int out[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) 
			for (int j = i+1; j < N; j++) {
				if (arr[i]>arr[j]) {			// 배열 내림차순 정리
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
		for (int i = 0; i < arr.length; i++) {
			out2 += arr[i];
			out[i] = out2;
			sum += out[i];
		}
		System.out.println(sum);
	}

}
