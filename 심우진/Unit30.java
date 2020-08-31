package algorithm;

import java.util.Arrays;

/**
 * 
 * @author wj
 *	30. 1~100까지 랜덤한 숫자를 10번 출력하여 중복된 숫자가 있을 경우 true, false를 리턴하라

	결과
	-----
	[14, 95, 99, 3, 99, 75, 27, 72, 88, 68]
	true
 */
public class Unit30 {
	public static void main(String[] args) {
		int[] arr = new int[10]; //0~9까지 배열 크기 할당
				
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*100)+1; // 랜덤 배열값 생성
			//System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr)); //배열의 문자열 출력 API
		boolean a = result(arr);
		System.out.println(a);
	}
	
	public static boolean result(int[] arr) {
		for(int i=0; i<9; i++) { //0~8까지
			for(int j=i+1; j<10; j++) { // 1~9까지
				if(arr[i] == arr[j]) { //arr[0] == arr[1],2,3,4,5,6,7,8,9까지 비교 반복
					return true;
				}
			}
		}
		return false;
	}
}
