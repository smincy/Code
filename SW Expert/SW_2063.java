package hodu_day3;

import java.util.Arrays;
import java.util.Scanner;

public class SW_2063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int arr[] = new int[199];
		
		for (int i = 0; i < tc; i++) {
			arr[i] = sc.nextInt();
		}
				//Arrays.sort(), Collections.sort()  오름차순으로 정렬
		Arrays.sort(arr);
		System.out.println(arr[tc/2]);   //정렬된 배열의 중간값
		
		
	}

}
