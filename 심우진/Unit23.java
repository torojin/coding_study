package algorithm;
/**
 * 
 * @author wj
	23.
	별찍기 문제
	다음과 같이 출력해보자
	
	   *
	  ***
	 *****
	  ***
	   *

 */
public class Unit23 {
	public static void main(String[] args) {
        //상단
		for(int i=1; i<=3; i++) {   
            for (int j=1; j<=3-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //하단
        for(int i=2; i>=1; i--) {
            for (int j=2; j>=i; j--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
