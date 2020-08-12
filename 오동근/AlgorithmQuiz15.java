package com.dkpoint.algorithm.quiz;

/*
15.
방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
*/

public class AlgorithmQuiz15 {

	public static void main(String[] args) {

		int x_variable;
		int y_variable;
		int x_range = 10;
		int y_range = 10;
		int equation_value = 10;

		for (x_variable = 1; x_variable <= x_range; x_variable++) {

			for (y_variable = 1; y_variable <= y_range; y_variable++) {

				int equation = 2 * x_variable + 4 * y_variable;

				if (equation == equation_value) {

					System.out.println(x_variable + " " + y_variable);

				} else if (equation > equation_value) {

					break;

				}

			}

		}

	}

}
