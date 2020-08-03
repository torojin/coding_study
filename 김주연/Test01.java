public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
			1. 임의의 시험 점수를 입력(혹은 랜덤으로)받아 90 ~ 100점은 A, 80 ~ 89점은 B,
		    70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		*/
		
			//(1)랜덤값 받기
		
			//변수 선언
			double score;
			
			//랜덤값 설정
			score = Math.random() * 100;
			System.out.println("시험점수 : " + score + "점");
		
				//조건문-[1] if
				if (score >= 90 && score <= 100) {
					System.out.println("등급 : A");
				} else if(score >= 80 && score < 90) {
					System.out.println("등급 : B");
				} else if(score >= 70 && score < 80) {
					System.out.println("등급 : C");
				} else if(score >= 60 && score < 70) {
					System.out.println("등급 : D");
				} else {
					System.out.println("등급 : F");
				}
			
				//조건문-[2]
		
			//(2)입력값 받기
			
			//변수 선언
			int score2;
			
			//입력값 설정
			
			
			
	}

}
