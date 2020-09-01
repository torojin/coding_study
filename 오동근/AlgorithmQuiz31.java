package com.dkpoint.algorithm.quiz;

import java.util.Scanner;

/*
31. 두 수를 입력받아 최소공배수와 최대공약수를 구하시오.

결과
------
첫 번째 수를 입력하세요> 12
두 번째 수를 입력하세요> 8
최대공약수: 4
최소공배수: 24
*/

public class AlgorithmQuiz31 {

	public static void main(String[] args) {

		int GCD;
		int LCM;
		int number_a;
		int number_b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요> ");
		number_a = scanner.nextInt();
		System.out.print("두 번째 수를 입력하세요> ");
		number_b = scanner.nextInt();
		scanner.close();

		CalculateGCDLCM calculateGCDLCM = new CalculateGCDLCM();
		calculateGCDLCM.setCalculateGCDLCM(number_a, number_b);
		GCD = calculateGCDLCM.getGCD(number_a, number_b);
		System.out.printf("최대공약수: %d\n", GCD);
		LCM = calculateGCDLCM.getLCM(GCD);
		System.out.printf("최소공배수: %d", LCM);

	}

}

class CalculateGCDLCM {

	int GCD;
	int LCM;
	int number_a;
	int number_b;
	int number_r;

	void setCalculateGCDLCM(int number_a, int number_b) {

		this.number_a = number_a;
		this.number_b = number_b;

	}

	int getGCD(int number_a, int number_b) {

		if (number_a < number_b) {

			int temp_value = number_a;
			number_a = number_b;
			number_b = temp_value;

		}

		number_r = number_a % number_b;

		if (number_r > 0) {

			number_a = number_b;
			number_b = number_r;

			return getGCD(number_a, number_b);

		} else {

			return GCD = number_b;

		}

	}

	int getLCM(int GCD) {

		if (GCD != 0) {

			LCM = number_a * number_b / GCD;

		} else {

			if (number_a > number_b) {

				LCM = number_a;

			} else {

				LCM = number_b;

			}

		}

		return LCM;

	}

}
