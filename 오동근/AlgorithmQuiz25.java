package com.dkpoint.algorithm.quiz;

/*
25.
다음과 같은 배열이 있다.
가장 큰 값 과 작은 값을 출력하세요
[1,7,6,3,2,8,9,4,5]
*/

public class AlgorithmQuiz25 {

	public static void main(String[] args) {

		int[] number_array = { 1, 7, 6, 3, 2, 8, 9, 4, 5 };
		int largest_value = 1;
		int smallest_value = 1;

		for (int number : number_array) {

			if (number > largest_value) {
				largest_value = number;
			} else if (number < smallest_value) {
				smallest_value = number;
			}

		}
		
		System.out.printf("가장 큰 값은 %d, 가장 작은 값은 %d", largest_value, smallest_value);

	}
}
