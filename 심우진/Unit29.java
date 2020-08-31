package algorithm;
/**
 * 
 * @author wj
 * 29. 다음과 같은 배열이 있다.
	정렬해서 출력하세요.(퀵소팅)
	[66, 10, 1, 34, 5, -10]
	
	//퀵 정렬(quick sort)은 기준키를 기준으로 작거나 같은 값을 지닌 데이터는 앞으로, 
	//큰 값을 지닌 데이터는 뒤로 가도록 하여 작은 값을 갖는 데이터와 큰 값을 갖는 데이터로 분리해가며 정렬하는 방법이다.

	// 모르겠어서 따라서 풀음
*/
public class Unit29 {
	public static void main(String[] args) {
		int[] arr = {66, 10, 1, 34, 5, -10};
		
		quick_Sort(arr,0,arr.length-1); //arr.length-1 = 배열 마지막 개수 출력
		output(arr);
	}
	
	public static void quick_Sort(int[] arr, int start, int end) {
		int left = start; //0
		int right = end; //5
		int pivot = arr[(left+right)/2]; //pivot을 중앙값으로 세팅
		
		do {
			while(arr[left]<pivot) {
				left++;
			}
			while(arr[right]<pivot) {
				right--;
			}
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}while(left <= right);
		if(start<right) {
			quick_Sort(arr, start, right);
		}if(end>left) {
			quick_Sort(arr, left, end);
		}
	}
	public static void output(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


