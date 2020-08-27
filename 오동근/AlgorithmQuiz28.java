package com.dkpoint.algorithm.quiz;

import java.util.Arrays;

/*
28. 두 문자열 papel과 apple이 아나그램인지 판단하는 코드를 작성하시오.
* 아나그램: 문자의 종류, 빈도가 같은 두 문자열
ex) abcd와 acdb는 아나그램임!

결과
-----
true
*/

public class AlgorithmQuiz28 {

	public static void main(String[] args) {

		String string_one = "papel";
		String string_two = "apple";

		CheckAnagram checkAnagram = new CheckAnagram();
		checkAnagram.setCheckAnagram(string_one, string_two);
		checkAnagram.getResult();

	}

}

class CheckAnagram {

	String string_one;
	String string_two;

	public void setCheckAnagram(String string_one, String string_two) {

		this.string_one = string_one;
		this.string_two = string_two;

	}

	public void getResult() {

		Boolean result;

		char[] char_array_one = string_one.toCharArray();
		char[] char_array_two = string_two.toCharArray();

		Arrays.sort(char_array_one);
		Arrays.sort(char_array_two);

		result = Arrays.equals(char_array_one, char_array_two);

		System.out.println(result);

	}

}
