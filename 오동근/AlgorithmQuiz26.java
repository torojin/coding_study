package com.dkpoint.algorithm.quiz;

/*
26.
"hello world" 를 꺼구로 출력하세요
결과:
dlrow olleh
*/

public class AlgorithmQuiz26 {

	public static void main(String[] args) {

		String string_vlaue = "hello world";
		int string_length = string_vlaue.length();

		for (int index = string_length - 1; index >= 0; index--) {

			System.out.print(string_vlaue.charAt(index));

		}

	}

}
