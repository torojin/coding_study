package algorithm;

import java.util.Scanner;

/**
 * 
 * @author wj
 *  
	27. 사용자로부터 하나의 숫자를 입력 받아 factorial을 계산하시오. 
	// factorial 일씩 빼 나가면서 곱해가는 공식 ex) 5!=5*4*3*2*1=120 //6!=6*5*4*3*2*1=720
	
	결과
	-----
	0 이상의 숫자를 입력해주세요> 5
	120

 */
public class Unit27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0이상의 숫자를 입력해주세요> ");
		int num = sc.nextInt();
		int mul=1;
		for(int i=num; i>0;i--) {
			mul *= i; 
		}
		System.out.println(mul);
		sc.close();
	}
}
