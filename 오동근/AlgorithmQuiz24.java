package com.dkpoint.algorithm.quiz;

/*
24.
다음과 같은 배열이 있다.
정렬해서 출력하세요.(버블 소팅 , 셀렉트 소팅)
[1,7,6,3,2,8,9,4,5]
*/

public class AlgorithmQuiz24 {

	public static void main(String[] args) {

		int[] number_array = { 1, 7, 6, 3, 2, 8, 9, 4, 5 };

//		BubbleSort bubbleSort = new BubbleSort();
//		bubbleSort.setBubbleSort(number_array);
//		bubbleSort.getBubbleSort();

		SelectionSort selectionSort = new SelectionSort();
		selectionSort.setSelectionSort(number_array);
		selectionSort.getSelectionSort();

	}

}

class BubbleSort {

	int[] data;

	public void setBubbleSort(int[] data) {
		this.data = data;
	}

	public void getBubbleSort() {

		int array_length = data.length;

		for (int array_index = 0; array_index < array_length; array_index++) {

			for (int sort_index = 0; sort_index < array_length - 1; sort_index++) {

				int bubble_index = sort_index + 1;

				if (data[sort_index] > data[bubble_index]) {

					int temp_value = data[sort_index];
					data[sort_index] = data[bubble_index];
					data[bubble_index] = temp_value;

				}

			}

		}

		System.out.println("Bubble Sort");
		System.out.print("[");

		for (int print_index = 0; print_index < array_length; print_index++) {

			if (print_index != array_length - 1) {
				System.out.printf("%d,", data[print_index]);
			} else {
				System.out.printf("%d", data[print_index]);
			}

		}

		System.out.println("]");

	}

}

class SelectionSort {

	int[] data;

	public void setSelectionSort(int[] data) {
		this.data = data;
	}

	public void getSelectionSort() {

		int array_length = data.length;

		for (int array_index = 0; array_index < array_length - 1; array_index++) {

			int select_index = array_index;

			for (int sort_index = select_index + 1; sort_index < array_length; sort_index++) {

				if (data[select_index] > data[sort_index]) {

					select_index = sort_index;

				}

			}

			int temp_value = data[array_index];
			data[array_index] = data[select_index];
			data[select_index] = temp_value;

		}

		System.out.println("Selection Sort");
		System.out.print("[");

		for (int print_index = 0; print_index < array_length; print_index++) {

			if (print_index != array_length - 1) {
				System.out.printf("%d,", data[print_index]);
			} else {
				System.out.printf("%d", data[print_index]);
			}

		}

		System.out.println("]");

	}

}
