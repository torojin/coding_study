
public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@author KJY
		
		/* 25. 다음과 같은 배열이 있다.
		가장 큰 값 과 작은 값을 출력하세요
		[1,7,6,3,2,8,9,4,5]
		*/
		
		int[] array = {1,7,6,3,2,8,9,4,5};
		
		int temp;
		int len = array.length;
		
		for(int i = len-2; i >= 0; i--) {
		
			for(int j = 0; j <= i; j++) {
				
				if (array[j] > array[j+1]) {
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
				
			}
				
		}
		
		System.out.println("가장 큰 값 = " + array[len-1]);
		System.out.println("가장 작은 값 = " + array[0]);
		
	}

}
