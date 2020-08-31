// 1~100까지 랜덤한 숫자를 10번 출력하여 중복된 숫자가 있을 경우 true, false를 리턴하라
package garamCodingTestPractice;

import java.util.Arrays;

public class Day15_30 {
	
	static boolean check(int[] arr) {
		for(int i=0; i<9; i++) {
    		for(int j=i+1; j<10; j++) {
    			if(arr[i] == arr[j]) {
    				return true;	// 중복된 숫자 있음
    			}
    		}
    	}
		return false;	// 중복된 숫자 없음
	}
	
    public static void main(String[] args) {
    	
    	int[] arr = new int[10];

    	for(int i=0; i<10; i++) {
    		arr[i] = (int)(Math.random()*100)+1;
    	}
    	System.out.println(Arrays.toString(arr));
		boolean a = check(arr);
		System.out.println(a);
    }
}
