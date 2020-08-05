package algorithm;
/**
 * 
 * @author wj
 * 5.구구단을 출력해보자
 *
 */

public class Unit05 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
}
