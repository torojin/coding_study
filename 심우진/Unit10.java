package algorithm;

/**
 * 
 * @author woojinshim
 *10.
	for 문을 이용해서 
	1부터 1000까지의 합을 구하는 코드를 작성하되
	3의 배수만 더하는 코드를 작성하자
 */
public class Unit10 {
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=1000; i++) {
			if(i%3 == 0) {
				System.out.println("3의 배수인 수 : "+i);
				sum += i;
				//System.out.println("sum : " + sum);
			}
		}
		System.out.println("3의 배수만 더한 수 : " + sum);
	}
}
