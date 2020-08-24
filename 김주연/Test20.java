public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@author KJY
		
		/* 20. 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 
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

		
		int start = 1;
		int end = 99;
		
		
		for (int i = start; i <= end; i++) {
			
			int count = 0;
			
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				
				count++;
				
			} 
			
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				
				count++;
				
			}
			
			if(count != 0) {
			
				System.out.println(i + " 박수 " + count + "번");
				
			}
			
		}
		
	}

}
