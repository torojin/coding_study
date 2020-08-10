package com.dkpoint.algorithm.quiz;

/*
4.
구구단 7단을 출력해보자
*/

public class AlgorithmQuiz04 {
	
	public static void main(String[] args) {
		
		int table = 7;
		int [] number_range = {1,2,3,4,5,6,7,8,9};
		int result = 0;
		
		for(int number : number_range) {
			result = table * number;
			System.out.println(table+" x "+number+" = "+result);
		}
		
	}
	
}
