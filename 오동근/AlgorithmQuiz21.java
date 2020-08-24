package com.dkpoint.algorithm.quiz;

/*
21.
1~10000사이에 8이 몇번 나오는가?
*/

public class AlgorithmQuiz21 {

	public static void main(String[] args) {

		int number_value = 1;
		int number_range = 10000;
		int number_target = 8;
		int result = 0;

		System.out.printf("%d~%d사이에 %d이 몇번 나오는가?\n", number_value, number_range, number_target);

		for (int number = number_value; number <= number_range; number++) {

			int calculate = number;

			while (calculate > 1) {

				if (calculate % 10 == number_target) {
					result++;
				}

				calculate /= 10;

			}

		}

		System.out.println(result + "번");

	}
}
