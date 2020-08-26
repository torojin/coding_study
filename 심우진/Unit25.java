package algorithm;
/**
 * 
 * @author wj
 * 25.
	다음과 같은 배열이 있다.
	가장 큰 값 과 작은 값을 출력하세요
	[1,7,6,3,2,8,9,4,5]
 */
public class Unit25 {
	public static void main(String[] args) {
		int a[] = {1,7,6,3,2,8,9,4,5};

		int max = a[0];
		int min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {//max가 a[i]보다 작을 때
				max = a[i];
			}
			if(min>a[i]) {//min이 a[i]보다 클 때 
				min = a[i];
			}
		}
		System.out.println("큰 값 : "+max);
		System.out.println("작은 값 : "+min);
	}
}
