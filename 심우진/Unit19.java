package algorithm;

/**
 * 
 * @author wj
 *19.
	별찍기 문제
	다음과 같이 출력해보자
	
	*
	**
	***
	****
	*****
 */
public class Unit19 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
