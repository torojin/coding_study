package com.dkpoint.algorithm.quiz;

/*
10.
for 문을 이용해서 
1부터 1000까지의 합을 구하는 코드를 작성하되
3의 배수만 더하는 코드를 작성하자
*/

public class AlgorithmQuiz10 {

	public static void main(String[] args) {

		int number;
		int number_range = 1000;
		int result = 0;

		for (number = 1; number <= number_range; number++) {

			if (number % 3 == 0) {
				result += number;
			}

		}

		System.out.println(result);

	}

}
