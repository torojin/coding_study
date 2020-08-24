public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@author KJY
		
		/* 23. 별찍기 문제  다음과 같이 출력해보자

		   *   1
		  ***  3
		 ***** 5
		  ***  3
		   *   1
		
		*/
		
		/* 실패
		 * 
		 * int a = 1;
		 * 
		 * for(int i = 1; i <= 5; i++) {
		 * 
		 * if(i == 2) {
		 * 
		 * a = 3;
		 * 
		 * }
		 * 
		 * else if(i == 3) {
		 * 
		 * a = 5;
		 * 
		 * }
		 * 
		 * else if(i == 4) {
		 * 
		 * a = 3;
		 * 
		 * }
		 * 
		 * else if(i == 5) {
		 * 
		 * a = 1;
		 * 
		 * }
		 * 
		 * for(int j = 1; j <= a; j++) {
		 * 
		 * System.out.print("*");
		 * 
		 * }
		 * 
		 * System.out.println("");
		 * 
		 * }
		 */
	
		for(int i = 1; i <= 3; i++) {
			
			//상단 별
			for(int j = 1; j <= 3 - i; j++) {
			
				System.out.print(" ");
				
			}
			
			for(int j = 1; j <= (i * 2) - 1; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
		}
		
		for(int i = 2; i > 0; i--) {
			
			//하단 별
			for(int j = 1; j <= 3 - i ; j++) {
				
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (i * 2) - 1; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
			
		}
		
	}

}
