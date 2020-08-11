package algorithm;
/**
 * 
 * @author wj
 * 12. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
 */
public class Unit12 {
	public static void main(String[] args) {
		
		int sum=0;
		
		int i=1;
		
		while(sum <= 100) {
			if(i%2 == 1) {
				sum+=i;
				System.out.println("홀수 i :"+i);
				//System.out.println("홀수 sum : "+sum);
			}else if(i%2 == 0) {
				sum-=i;
				System.out.println("짝수 i : -"+i);
				//System.out.println("짝수 sum : "+sum);
			}							
			i++;
		}
		System.out.println("총합 : "+sum);
		System.out.println("i가 "+i+"까지 더해야 총합이 100이상이다.");
	}
}
