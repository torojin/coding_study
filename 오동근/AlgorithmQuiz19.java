package com.dkpoint.algorithm.quiz;

/*
19.
별찍기 문제
다음과 같이 출력해보자

*
**
***
****
*****

*/

public class AlgorithmQuiz19 {

	public static void main(String[] args) {

		String star = "*";
		int repeat_count = 5;

		for (int repeat = 1; repeat <= repeat_count; repeat++) {

			for (int count_star = 1; count_star <= repeat; count_star++) {
				System.out.printf("%s", star);
			}

			System.out.print("\n");

		}

	}
	
}
