public class 동빈나_퀵정렬 {

	private static int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
	private static int number = 10;
	
	public static void quickSort(int data[], int start, int end) { 	// start 는 정렬을 수행하는 부분집합의 첫번째 원소
																// end 는 부분집함의 마지막 원소
		if (start >= end) {		// 첫원소가 끝원소보다 크거나 같다 = 원소가 1개인 경우
			return;
		}
		
		int key = start;	  	// 키는 첫번재 원소
		int i = start + 1;		// 왼쪽 출발지점
		int j = end;			// 오른쪽 출발지점
		int temp; 				// 두 값의 위치를 바꿀 수 있도록 임시변수 
		
		while (i <= j) {		// 왼쪽값이 오른쪽값 보다 작거나 같을때 까지 반복 (엇갈리게되면 while문 탈출)
			while (i <= end && data[i] < data[key]) {
				i++;			// 키 값보다 큰 값을 만날 때까지 오른쪽으로 이동
			}
			while (j > start && data[j] >= data[key]) {
				j--;			// 키 값보다 작은 값을 만날 때까지 왼쪽으로 이동
			}
			if (i > j) {  		// 엇갈린 상태면 키 값과 교체
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		
		quickSort(data, start, j-1);	// 분할 후 왼쪽 집합의 시작부터 끝까지
		quickSort(data, j+1, end);		// 분할 후 오른쪽 집합의 시작부터 끝까지 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 전체 배열에서 피벗값을 정하고 그 피벗값을 기준으로 분할
		// 왼쪽에서 오른쪽으로 > 피벗값보다 큰값을 탐색
		// 오른쪽에서 왼쪽으로 > 피벗값보다 작은값을 탐색
		
		// 오른쪽에서 탐색한 값이 왼쪽값보다 작을 경우 해당 오른쪽값과 피벗값 교체
		// 교체 후 피벗값은 이동완료
		// 이동완료값 기준으로 왼쪽, 오른쪽 나눠서 다시 피벗값 설정
		
		quickSort(data, 0, number - 1);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}	
	}
}