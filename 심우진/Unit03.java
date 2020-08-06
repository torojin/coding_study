package algorithm;
/**
 * @author wj
	3.
	for 문을 이용해서 
	1부터 76까지의 합을 구하는 코드를 작성하자.
 */

public class Unit03 {	
	public static void main(String[] args) {
		int num = 0;
		for(int i=0; i<=76; i++) {
			num += i;
			System.out.println("i : "+i+" num : "+num);
		}
	}
}
