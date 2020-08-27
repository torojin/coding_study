/*
27. 사용자로부터 하나의 숫자를 입력 받아 factorial을 계산하시오.

결과
-----
0 이상의 숫자를 입력해주세요> 5
120
 */
package garamCodingTestPractice;

import java.util.Scanner;

public class Day14_27 {

	// 방법 1 - for문
	public int factorial(int num) {

		int result = 1;

		for (int i = num; i > 1; i--) {
			result *= i;
		}

		return result;

	}
	
	// 방법2 - 재귀함수: Day15_29에

	public static void main(String[] args) {

		boolean run = true;
		int num = 0;

		while (run) {
			System.out.print("0 이상의 숫자를 입력해주세요> ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

			if (num < 0) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				run = false;
			}
		}

		if (num <= 1) {
			System.out.println("1");
		} else {
			Day14_27 t = new Day14_27();
			System.out.println(t.factorial(num));
		}

	}

}
