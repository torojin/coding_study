public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@author KJY
		
		// 18. 자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지 , 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해 보자.
		
		int sum = 0;
		int num = 1000;
		int i = 1;
		
		while(sum < num) {
			
			if(i % 3 == 0 && i % 2 == 0 || i % 2 == 1) {

				sum += i;
				
				if(sum > num) {
				
					System.out.println(i + "를 더했을 때 " + num + "을 넘어선다");
					System.out.println("1000을 넘어선 값 = " + sum);
					
				}
					
			}
			
			i++;
			
		}
		
	}

}
