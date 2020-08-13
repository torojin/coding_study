package com.dkpoint.algorithm.quiz;

/*
1.
임의의 시험 점수를 입력(혹은 랜덤으로)받아 
90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 
60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
*/

public class AlgorithmQuiz01 {

	public static void main(String[] args) {

		System.out.println("문제-1");

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("시험 점수를 입력해주세요."); int test_score = scanner.nextInt();
		 */

		int test_score = (int) (Math.random() * 101);
		System.out.println("랜덤한 점수를 입력받았습니다.");
		System.out.println(test_score);

		int grade_cut = test_score / 10;

		switch (grade_cut) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("F");
			break;

		}

	}

}
