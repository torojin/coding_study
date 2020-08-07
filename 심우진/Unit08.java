package algorithm;
/**
 * 
 * @author wj
 * 8. 2~100사이의 소수를 구해보자
 */
public class Unit08 {
	public static void main(String[] args) {
		
		int num = 100;
		
		for(int i=2; i<num; i++) {
			boolean prime = true;
			for(int j=2; j*j<=i; j++) {
				if(i%j == 0) {
					prime = false;
				}
			}
			if(prime) {
				System.out.print(i+" ");
			}
		}
		
	}
}
