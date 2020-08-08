package com.dkpoint.algorithm.quiz;

/*
2.
안녕하세요 를 5번 출력 하자
결과)
안녕하세요
안녕하세요
안녕하세요
안녕하세요
안녕하세요
*/

public class AlgorithmQuiz02 {
	
	public static void main(String[] args) {
		
		System.out.println("문제-2");
		
		String message = "안녕하세요";
		
		int count = 0;
		while(count < 5) {
			count++;
			System.out.println(message);
		}
		
	}
	
}
