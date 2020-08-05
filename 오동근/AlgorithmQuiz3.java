package com.dkpoint.algorithm.quiz;

/*
3.
for 문을 이용해서 
1부터 76까지의 합을 구하는 코드를 작성하자.
*/

public class AlgorithmQuiz3 {
	
	public static void main(String[] args) {
		
		int number;
		int end = 76;
		int sum = 0;
		
		for(number = 1; number <= end; number++) {
			sum += number;
		}
		System.out.println(sum);
	}
	
}
