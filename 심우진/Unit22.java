package algorithm;
/**
 * 
 * @author wj
 * 22.
	별찍기 문제
	다음과 같이 출력해보자
	*****
	****
	***
	**
	*
 */
public class Unit22 {
	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
