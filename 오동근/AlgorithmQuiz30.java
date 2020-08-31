package com.dkpoint.algorithm.quiz;

import java.util.ArrayList;
import java.util.List;

/*
30. 1~100까지 랜덤한 숫자를 10번 출력하여 중복된 숫자가 있을 경우 true, false를 리턴하라

결과
-----
[14, 95, 99, 3, 99, 75, 27, 72, 88, 68]
true
*/

public class AlgorithmQuiz30 {

	public static void main(String[] args) {

		int range_start = 1;
		int range_end = 100;
		int random_number;
		int repeat_count = 10;
		List<Integer> number_array = new ArrayList<Integer>();
		Boolean isBoolean = false;

		System.out.print("[");

		for (int index = 1; index <= repeat_count; index++) {

			random_number = (int) ((Math.random() * range_end) + range_start);

			if (index != repeat_count) {

				System.out.print(random_number + ", ");

			} else {

				System.out.print(random_number);

			}

			if (isBoolean != true) {

				for (int number : number_array) {

					if (random_number == number) {

						isBoolean = true;
						break;

					}

				}

			}

			number_array.add(random_number);

		}

		System.out.println("]");

		if (isBoolean == true) {

			System.out.println("true");

		} else {

			System.out.println("false");

		}

	}

}
