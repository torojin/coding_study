package algorithm;

import java.util.Arrays;

/**
 * 
 * @author wj
	28. 두 문자열 papel과 apple이 아나그램인지 판단하는 코드를 작성하시오.
	* 아나그램: 문자의 종류, 빈도가 같은 두 문자열
	ex) abcd와 acdb는 아나그램임!
	
	결과
	-----
	true
 */
public class Unit28 {
	public static void main(String[] args) {
		System.out.println(isAnagram("papel","apple"));
	}
	
	public static boolean isAnagram(String word1, String word2) {
		System.out.println(word1+","+word2+"아나그램 인가?");
		
		//String를 char 배열로 변환
		char[] charWord1 = word1.toLowerCase().toCharArray(); //toLowerCase() 대상 문자열을 모두 문자로 변환 / toCharArray() 메소드는 문자열을 char형 배열로 바꾼다.
		char[] charWord2 = word2.toLowerCase().toCharArray();
		
		//올림차순 정렬
		Arrays.sort(charWord1); 
		Arrays.sort(charWord2);
		
		System.out.println(charWord1);
		System.out.println(charWord2);
		
		//char[] String으로 변환하여 문자열 비교
		String sortWord1 = new String(charWord1);
		String sortWord2 = new String(charWord2);
		
		// 문자열이 같으면 true 아니면 false
		if(sortWord1.equals(sortWord2)) {
			return true;
		}else {	
			return false;
		}
	}
}
