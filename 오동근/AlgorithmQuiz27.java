package com.dkpoint.algorithm.quiz;

import java.util.Scanner;

/*
27. 사용자로부터 하나의 숫자를 입력 받아 factorial을 계산하시오.

결과
-----
0 이상의 숫자를 입력해주세요> 5
120
*/

public class AlgorithmQuiz27 {

	public static void main(String[] args) {

		CalculateFactorial calculateFactorial = new CalculateFactorial();
		calculateFactorial.inputNumber();
		calculateFactorial.getResult();

	}

}

class CalculateFactorial {

	Scanner scanner = new Scanner(System.in);
	int input_number;
	
	public void inputNumber() {
		
		System.out.print("0 이상의 숫자를 입력해주세요> ");
		this.input_number = scanner.nextInt();
		
	}
	
	public void getResult() {
		
		int result = 1;
		
		for(int number = input_number; number > 0; number--) {
			
			result *= number;
			
		}

		System.out.println(result);
		
	}
	
}
