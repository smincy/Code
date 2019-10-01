package hodu_day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Integer arr[]=new Integer[199];
		
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());  //내림차순 정렬
		System.out.println(arr[tc/2]);
	}

}
