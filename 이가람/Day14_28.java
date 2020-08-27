/*
28. 두 문자열 papel과 apple이 아나그램인지 판단하는 코드를 작성하시오.
아나그램: 문자의 종류, 빈도가 같은 두 문자열
ex) abcd와 acdb는 아나그램임!
 */
package garamCodingTestPractice;

import java.util.Arrays;

public class Day14_28 {

	static boolean anagramCheck(String str1, String str2) {
		
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		if(str1.length() != str2.length()) {
			
			return false;
		}
		
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String string1 = new String(ch1);
		String string2 = new String(ch2);
		
		
		if(string1.equals(string2)) {
			return true;
		} else {
			
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		String str1 = "apple";
		String str2 = "papel";
		
		boolean result = anagramCheck(str1, str2);
		
		System.out.println(result);
		

	}

}
