package com.dkpoint.algorithm.quiz;

/*
6.
구구단을 출력을 하되 7단과 6단을 제외하고 출력하자.
*/

public class AlgorithmQuiz06 {

	public static void main(String[] args) {

		int[] table_range = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] number_range = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int result = 0;

		for (int table : table_range) {

			if (table == 6 || table == 7) {
				continue;
			}

			for (int number : number_range) {
				result = table * number;
				System.out.println(table + " x " + number + " = " + result);
			}

		}

	}

}
