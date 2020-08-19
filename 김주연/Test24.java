public class Test24 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		//@author KJY
		
		/* 24. 다음과 같은 배열이 있다. 정렬해서 출력하세요.(버블 소팅 , 셀렉트 소팅) 
		       [1,7,6,3,2,8,9,4,5]
		*/
		
		int array[] = {1, 7, 6, 3, 2, 8, 9, 4, 5};
		
		int a;
		int b;
		
		//버블 소팅
		for(int i = 8 ; i > 0 ; i--) {
			
			for(int j = 0; j < i; j++) {
				
				if(array[j] > array[j+1]) {
					
					a = array[j];
					b = array[j+1];
					
					array[j+1] = a;
					array[j] = b;
					
				}
			
			}
			
		}
		
		//출력
		for(int i = 0; i <= 8; i++) {
			
			System.out.print(array[i]);
		
		}
		
		//셀렉트 소팅
		
		
	}
	
}
