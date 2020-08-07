package com.dkpoint.algorithm.quiz;

import java.util.ArrayList;
import java.util.List;

/*
8.
2~100사이의 소수를 구해보자
 */

public class AlgorithmQuiz8 {

	public static void main(String [] args) {
		
		int check_number;
		int number_range = 100;
		
		List<Integer> prime_number = new ArrayList<Integer>(); 
		
		for(check_number = 2; check_number <= number_range; check_number++) {
			
			boolean check_prime = true;
			
			for(int number : prime_number) {
				if(check_number % number == 0) {
					check_prime = false;
					break;
				}
			}
			
			if(check_prime == false) {
				continue;
			}
			
			for(int number = 2; number < check_number; number++) {
							
				if(check_number % number == 0) {
					check_prime = false;
					break;
				}
				
			}
			
			if(check_prime) {
				prime_number.add(check_number);
				System.out.println(check_number+" : 소수 입니다.");
			}
			
		}
		
	}
}
