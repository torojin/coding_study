package com.dkpoint.algorithm.quiz;

/*
20.
반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 
실행 결과 예) 
3 박수한번
6 박수 한번
9 박수 한번 
.
.
.
33 박수 두번
.
98 박수 한번
99 박수 두번
*/

public class AlgorithmQuiz20 {

	public static void main(String[] args) {

		int number_value = 1;
		int number_range = 99;

		for (int index = number_value; index <= number_range; index++) {

			int number = index;
			int count_clap = 0;

			while (number > 0) {

				int calc = number % 10;
				
				if (calc != 0 && calc % 3 == 0) {
					count_clap += 1;
				}

				number /= 10;

			}

			System.out.printf("%d 박수 %d번\n", index, count_clap);

		}

	}

}
