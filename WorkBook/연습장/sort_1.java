package algo;

import java.util.Scanner;

public class sort_1 {           //선택정렬   / 가장 작은 것을 선택해서 제일 앞으로 보냄    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, index = 0, min, temp;
		
		int Arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int k = 0; k < 10; k++) {
			Arr[k] = sc.nextInt();
		}
		for (i = 0; i < 10; i++) {
			min = 9999;
			for (j = i; j < 10; j++) {
				if (min>Arr[j]) {
					min = Arr[j];
					index = j;
				}
			}
			temp = Arr[i];
			Arr[i] = Arr[index];
			Arr[index] = temp;
		}
		for (i = 0; i < 10; i++) {
			System.out.print(Arr[i] + " ");
		}
		
	}

}
