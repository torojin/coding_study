public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			2. 안녕하세요 를 5번 출력 하자 
			결과)
			안녕하세요
			안녕하세요
			안녕하세요
			안녕하세요
			안녕하세요
		*/
		
		//반복문 - [1] for
		for (int i = 0; i < 5; i++) {
			
			System.out.println("안녕하세요");
			
		}
		
		//반복문 - [2] for
		
		int[] array = {0,0,0,0,0};
		
		for(int i : array) {
			System.out.println("안녕하세요2");
		}
		
		//반복문 - [3] while
		int count = 0; 
		
		while(true) {
			
			System.out.println("안녕하세요3");
			++count;
			
			if(count==5) {
				break;
			}
		}
	}
}
