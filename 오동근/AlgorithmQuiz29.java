package com.dkpoint.algorithm.quiz;

/*
29. 다음과 같은 배열이 있다.
정렬해서 출력하세요.(퀵소팅)
[66, 10, 1, 34, 5, -10]
*/

public class AlgorithmQuiz29 {

	public static void main(String[] args) {

		int[] number_array = { 66, 10, 1, 34, 5, -10 };
		int left = 0;
		int right = number_array.length - 1;

		QuickSort quickSort = new QuickSort();
		quickSort.setQuickSort(number_array, left, right);
		quickSort.getQuickSort();

	}

}

class QuickSort {

	int[] number_array;
	int left;
	int right;

	void setQuickSort(int[] number_array, int left, int right) {

		this.number_array = number_array;
		this.left = left;
		this.right = right;

		if (left < right) {

			int pivot_index = partition(number_array, left, right);

			setQuickSort(number_array, left, pivot_index - 1);
			setQuickSort(number_array, pivot_index + 1, right);

		}

	}

	int partition(int[] array, int start, int end) {

		int pivot = number_array[end];
		int left_count = start - 1;

		for (int number_index = start; number_index <= end - 1; number_index++) {

			if (number_array[number_index] <= pivot) {

				left_count++;
				int temp_value = number_array[number_index];
				number_array[number_index] = number_array[left_count];
				number_array[left_count] = temp_value;

			}

		}

		int temp_value = number_array[right];
		number_array[right] = number_array[left_count + 1];
		number_array[left_count + 1] = temp_value;

		return left_count + 1;

	}

	void getQuickSort() {

		System.out.print("[");

		for (int number_index = 0; number_index < number_array.length; number_index++) {

			if (number_index != right) {

				System.out.print(number_array[number_index] + ", ");

			} else {

				System.out.print(number_array[number_index]);

			}

		}

		System.out.print("]");

	}

}
