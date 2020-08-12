package com.dkpoint.algorithm.quiz;

/*
5.
구구단을 출력해보자
*/

public class AlgorithmQuiz05 {

	public static void main(String[] args) {

		int[] table_range = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] number_range = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int result = 0;

		for (int table : table_range) {

			for (int number : number_range) {
				result = table * number;
				System.out.println(table + " x " + number + " = " + result);
			}

		}

	}

}
