
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@author KJY
		
		//7. 863은 소수 인가?
		int num = 863;
		boolean check = true;
	
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				
				check = false;
				break;
			}
			
		}
		
		if(check == true) {
			
			System.out.println(num + "은(는) 소수입니다");
		
		} else {
			
			System.out.println(num + "은(는) 소수가 아닙니다");
		
		}

	}

}
