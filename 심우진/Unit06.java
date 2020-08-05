package algorithm;
/**
 * 
 * @author woojinshim
 * 6.구구단을 출력을 하되 7단과 6단을 제외하고 출력하자.
 *
 */
public class Unit06 {
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			switch(i) {
			case 1:
				for(int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			case 2:
				for(int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			case 3:
				for(int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			case 4:
				for(int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			case 5:
				for(int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			case 6: break;
			case 7: break;
			case 8:
				for(int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			case 9:
				for(int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}			
			}
		}
		
		
		
	}
}
