public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@author KJY
		
		/* 17. 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
		예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
		1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오. */
		
		int num = 10;
		int a[] = new int[num];
		
		int first = 1;
		int second = 1;
		
		for(int i = 1; i <= num; i++) {
			
				a[i-1] = first;
				first = second;
				second = a[i-1] + second;

		}
		
		System.out.println("피보나치 수열의 " + num + "번째 수 = " + a[num-1]);

	}

}
