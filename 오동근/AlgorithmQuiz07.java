package com.dkpoint.algorithm.quiz;

/*
7.
863은 소수 인가?
*/

public class AlgorithmQuiz07 {

	public static void main(String[] args) {

		int check_number = 863;
		boolean check_prime = true;

		for (int number = 2; number < check_number; number++) {

			if (check_number % number == 0) {
				check_prime = false;
				break;
			}
		}

		if (check_prime) {
			System.out.println(check_number + " : 소수 입니다.");
		} else {
			System.out.println(check_number + " : 소수가 아닙니다.");
		}

	}
}
