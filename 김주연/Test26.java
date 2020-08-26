
public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@author KJY
		
		/* 26. "hello world" 를 거꾸로 출력하세요
		결과:
		dlrow olleh
		*/
		
		String sen = "hello world";
		int len = sen.length();
		
		for (int i = len-1; i >= 0; i--) {
			
			System.out.print(sen.charAt(i));
		
		}
		
		
	}

}
