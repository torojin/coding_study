package algorithm;
/**
 * 
 * @author wj
 *20.
	반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 
	실행 결과 예) 
	3 박수한번
	6 박수 한번
	9 박수 한번 
	.
	.
	.
	33 박수 두번
	.
	98 박수 한번
	99 박수 두번

 */
public class Unit20 {
	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			int a = i%10; //10의 자리
			int b = i/10; // 1의 자리
			if(a == 3 || a == 6 || a == 9) {
				if(b == 3 || b == 6 || b == 9) {
					System.out.println(i+" 박수 두번");
				}else {
					System.out.println(i+" 박수 한번");					
				}
			}
			else if(b == 3 || b == 6 || b == 9) {
				System.out.println(i+" 박수 한번");
			}
		}
	}
}
