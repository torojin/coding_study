package com.dkpoint.algorithm.quiz;

import java.util.ArrayList;
import java.util.List;

/*
22.
별찍기 문제
다음과 같이 출력해보자
*****
****
***
**
*
*/

public class AlgorithmQuiz22 {

	public static void main(String[] args) {

		String column_value = "*";
		List<int[]> array_row = new ArrayList<int[]>();
		int[] row_1 = { 1, 1, 1, 1, 1 };
		int[] row_2 = { 1, 1, 1, 1, 0 };
		int[] row_3 = { 1, 1, 1, 0, 0 };
		int[] row_4 = { 1, 1, 0, 0, 0 };
		int[] row_5 = { 1, 0, 0, 0, 0 };

		array_row.add(row_1);
		array_row.add(row_2);
		array_row.add(row_3);
		array_row.add(row_4);
		array_row.add(row_5);

		for (int[] row : array_row) {

			for (int column : row) {

				if (column == 1) {
					System.out.print(column_value);
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("\n");

		}

	}

}
