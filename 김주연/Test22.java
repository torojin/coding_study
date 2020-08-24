public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@author KJY
		
		/*
		22. 별찍기 문제
		다음과 같이 출력해보자
		*****
		****
		***
		**
		*
		*/

		for(int i = 1; i <= 5; i++) {
		
			for (int j = 5; j >= i; j--) {

				System.out.print("*");

			}
			
			System.out.println("");
		
		}
		
	}

}
