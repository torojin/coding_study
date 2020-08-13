package com.dkpoint.algorithm.quiz;

/*
18.
자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지 , 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해 보자.
*/

public class AlgorithmQuiz18 {

	public static void main(String[] args) {

		int number = 1;
		int result = 0;
		int result_goal = 1000;

		while (result < result_goal) {
			
			number++;
			
			if(number %2 == 1) {
				result += number;
			} else if(number %3 == 0 && number %2 == 0) {
				result += number;
			}
			
		}

		System.out.printf("합이 %d를 더했을 때 %d을 넘어서고, 넘어선 값은 %d이다", number, result_goal, result);

	}

}
