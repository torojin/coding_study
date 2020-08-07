package algorithm;
/**
 * 
 * @author woojinshim
 * 9. 1부터 200까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
 */
public class Unit09 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=200; i++) {
			if(i%2 == 0) {
				continue;
			}else if(i%3 == 0) {
				continue;
			}
			else {
				System.out.println("2,3배수가 아닌 수 : "+i);
				sum += i;
			}
			//System.out.println("sum :"+sum);
		}
		System.out.println("총합 :"+sum);
	}
}
