package algorithm;
/**
 * 
 * @author wj
 * 14. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
 */
public class Unit14 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == 6) {
					System.out.println(i+" + "+j+" = 6");
					sum++;
				}
			}
		}
		System.out.println("눈의 합이 6이 되는 모든 경우의 수는 "+sum+"개 이다.");
	}
}
