package com.dkpoint.algorithm.quiz;

/*
12.
1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
*/

public class AlgorithmQuiz12 {
	
	public static void main(String[] args) {

		int number = 1;
		int goal = 100;
		int sum = 0;
		
		while(true) {
			
			if(number % 2 == 0) {
				sum -= number;
			}else {
				sum += number; 
			}
			
			if(sum >= goal) {
				break;
			}
			
			number++;
			
		}
		
		System.out.println(number+"까지 더해야 총합이 "+goal+"이상이 됩니다.");
		
	}
	
}
