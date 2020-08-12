package com.dkpoint.algorithm.quiz;

/*
13.
1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
*/

public class AlgorithmQuiz13 {

	public static void main(String[] args) {

		int number;
		int number_range = 10;
		int sum = 0;
		int result = 0;

		for (number = 1; number <= number_range; number++) {

			sum += number;
			result += sum;

		}

		System.out.println(result);

	}

}
