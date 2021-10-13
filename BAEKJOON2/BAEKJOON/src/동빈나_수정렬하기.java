import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동빈나_수정렬하기 {

	public static int number;
	public static int[] data = new int[1000001];

	public static void quickSort(int data[], int start, int end) {

		if (start >= end) {
			return; // 원소가 하나일 경우
		}

		int key = start;
		int i = start + 1;
		int j = end, temp;

		while (i <= j) {
			while (data[i] <= data[key] && i <= end) {  // 확인필요
				i++;
			}
			while (data[j] >= data[key] && j > start) {
				j--;
			}
			if (i > j) {
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}

		quickSort(data, start, j - 1);
		quickSort(data, j + 1, end);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 백준 2751 퀵정렬

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		number = Integer.valueOf(br.readLine());
		
		int[] data = new int[number+1];
		
		
		for (int i = 0; i < number; i++) {
			data[i] = Integer.valueOf(br.readLine());  // 입력
		}
		
		
		quickSort(data, 0, number - 1);			// 퀵정렬 수행

		for (int i = 0; i < number; i++) {
			System.out.println(data[i] + " ");	// 출력
		}

	}
}
