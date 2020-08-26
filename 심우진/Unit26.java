package algorithm;


/**
 * 
 * @author wj
 *26.
	"hello world" 를 거꾸로 출력하세요
	결과:
	dlrow olleh

 */
public class Unit26 {
	public static void main(String[] args) {
		String a = "hello world";
		
		//System.out.println(a.length());
		//char[] b = new char[a.length()]; //"hello world"를 담을 배열 
		
		/*
		for(int i=0; i<b.length; i++) {
			b[i] = (a.charAt(i));//a의 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴
			System.out.print(b[i]);
		}
		*/
		
		//거꾸로 출력
		for(int i=a.length()-1; i>=0; i--) {//index 범위가 0~10 이여서 10부터 시작
			System.out.print(a.charAt(i));//a의 문장의 인덱스 위치에 해당되는 문자 추출 
		}
	}
}
