/*
29. 다음과 같은 배열이 있다.
정렬해서 출력하세요.(퀵소팅)
[66, 10, 1, 34, 5, -10]
 */
package garamCodingTestPractice;

import java.util.Arrays;

public class Day15_29 {

static void quickSort(int[] arr, int start, int end) {
		
		int part2 = partition(arr, start, end);
		
		if(start < part2-1) {
			quickSort(arr, start, part2-1);
		}
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start+end)/2];
		while(start <= end) {
			while(arr[start] < pivot) {
				start++;
			}
			while(arr[end] > pivot) {
				end--;
			}
			if(start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
			
		}
		return start;
	}
	
	static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
		
	}
	
    public static void main(String[] args) {
        
        int data[] = {66, 10, 1, 34, 5, -10};
        quickSort(data, 0, data.length-1);
        System.out.print(Arrays.toString(data));

    }
	
}
