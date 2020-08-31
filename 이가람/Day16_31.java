// 두 수를 입력 받아 최소공배수와 최대공약수 구하기
package garamCodingTestPractice;
import java.util.Scanner;

public class Day16_31 {

	public static void main(String[] args) {
		
		int largeNumber = 0;
		int smallNumber = 0;
		int remainder = 1;
		
		//1. 두 수를 입력받는다.
		System.out.print("첫 번째 수를 입력하세요> ");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		smallNumber = firstNumber;
		
		System.out.print("두 번째 수를 입력하세요> ");
		int secondNumber = sc.nextInt();
		largeNumber = secondNumber;
		
		// 2. 두 수중 큰 수와 작은 수를 구분한다. 큰 수를 첫 번째 입력값, 작은 수를 두 번째 입력 값으로 교환
		if(firstNumber < secondNumber) {
			
			firstNumber = largeNumber;
			secondNumber = smallNumber;
		}

		// 3. 두 수를 나눈 나머지가 0일때 까지 큰수와 작은수를 나눈다.
		// 4.나머지가 0이 되는 순간 큰 수가 최대공약수이다.
		while(remainder > 0) {
			remainder = firstNumber % secondNumber;
			firstNumber = secondNumber;
			secondNumber = remainder;
		}
		
		// 5.처음 입력받은 두 수의 곱을 최대공약수로 나누면 최소공배수가된다.
		int l = largeNumber * smallNumber / firstNumber;
		System.out.println("최대공약수: "+firstNumber);
		System.out.println("최소공배수: "+l);
		
	}

}
