
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@author KJY
		
		//14. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.

		int count = 0;
		int sum = 6;
		
		for(int i = 1; i <= 6; i++) {
			
			for (int j = 1; j <= 6; j++) {
				
				if(i + j == sum) {
					
					count++;
					
					System.out.println("("+ i +" , " + j + ")");
	
				}
				
			}
		
		}
		
		System.out.println("경우의 수 : " + count);

	}

}
