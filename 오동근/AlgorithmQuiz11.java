package com.dkpoint.algorithm.quiz;

import java.util.ArrayList;
import java.util.List;

/*
11.
1부터 100까지 출력을 하고 난 다음에 , 다시 거꾸로 100에서부터 1까지 출력을 하는 프로그램을 작성해 보자.
*/

public class AlgorithmQuiz11 {

	public static void main(String[] args) {

		int number;
		int number_range = 100;
		List<Integer> number_list = new ArrayList<Integer>();
		int index;

		for (number = 1; number <= number_range; number++) {

			number_list.add(number);
			System.out.println(number + " ");

		}

		for (index = number_range - 1; index >= 0; index--) {

			System.out.println(number_list.get(index));

		}

	}

}
