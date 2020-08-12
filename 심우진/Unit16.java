package algorithm;
/**
 * 
 * @author wj
 *	16.
int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수 num의 값이 12345라면, 
‘1+2+3+4+5’의 결과인 15를 출력하라. 
[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
(API를 사용하지 않는다. 알고리즘으로만 처리)
 */
public class Unit16 {
	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		
		while(num > 0) {
			//System.out.println("들어온 num : "+num);
			sum+=num%10;
			num/=10;
			//System.out.println("나눈 num : "+num);
			
		}
		System.out.println("결과 : "+sum);
	}
}
