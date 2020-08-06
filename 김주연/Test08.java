
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@author KJY
		
		//8. 2~100 사이의 소수를 구해보자
		
		//[1] 포문을 끝까지 돌림 (비효율)
		int count = 0;
		int min = 2;
		int max = 100;
		
		for(int i = min; i <= max; i++) {
			
			for (int j = 2; j <= i; j++) {
				
				if (i % j == 0) {
					
					count++;
					
				}

			}
			
			if(count == 1) {
				
				System.out.printf("%d", i);
				System.out.printf(" ");
			
			}
			
			count = 0;
			
		}
		
		System.out.println("\n");

		//[2] 소수가 아니면(나누어 떨어지는게 있으면) 바로 포문탈출 (위에꺼보단 효율적)
		
		int j;
		
		for(int i = min; i <= max; i++) {
			
			for (j = 2; j < i; j++) {
				
				if(i % j == 0) {
					
					break;
				
				}
			}
			
			if(i == j) {
				System.out.printf("%d", i);
				System.out.printf(" ");
			}
			
		}
		
	}

}
