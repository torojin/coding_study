public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@author KJY
		
		//11. 1부터 100까지 출력을 하고 난 다음에 , 다시 거꾸로 100에서부터 1까지 출력을 하는 프로그램을 작성해 보자.
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			
			if(i == 100) {
				for(int j = 100; j >= 0; j--) {
					System.out.println(j);
				}
			}
		}

	}

}
