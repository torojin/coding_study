package com.dkpoint.algorithm.quiz;

/*
14.
두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
*/

public class AlgorithmQuiz14 {

	public static void main (String[] args) {
		
		int first_dice_number;
		int second_dice_number;
		int dice_range = 6;
		
		for(first_dice_number = 1; first_dice_number <= dice_range; first_dice_number++) {
			
			for(second_dice_number = 1; second_dice_number <= dice_range; second_dice_number++) {
				
				int sum = first_dice_number + second_dice_number;
				
				if (sum == 6) {
					System.out.println(first_dice_number+" "+second_dice_number);
				}
				
			}
			
		}
		
	}
	
}
