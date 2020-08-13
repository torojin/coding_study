package com.dkpoint.algorithm.quiz;

/*
9.
1부터 200까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
*/

public class AlgorithmQuiz09 {

	public static void main(String[] args) {

		int number;
		int number_range = 200;
		int result = 0;

		for (number = 1; number <= number_range; number++) {

			if ((number % 2 != 0 && number != 2) && (number % 3 != 0 && number != 3)) {
				result += number;
			}

		}

		System.out.println(result);

	}

}
