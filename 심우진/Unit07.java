package algorithm;
/**
 * 
 * @author wj
 * 7. 863은 소수 인가?
 */
public class Unit07 {
	public static void main(String[] args) {
		
		int num = 5;
		boolean prime = false;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				prime = true;
			}
		}
		
		if(prime) {
			System.out.println(num+" 소수가 아닙니다");
		}else {
			System.out.println(num+" 소수입니다.");
		}
		
	}
}
