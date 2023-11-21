package iteration;

import java.util.Iterator;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
//		문제
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//
//		입력
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//		출력
//		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		
//		예제 출력  
//	    *
//	   **
//	  ***
//	 ****
//	*****		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
//		String star = "";
//		for (int i = 0; i < count; i++) {
//			star += "*";
//			for (int j = 0; j < count - (i + 1); j++) {
//				System.out.print(" ");
//			}
//			System.out.println(star);
//		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(" ".repeat(count - (i + 1)) + "*".repeat(i + 1));
		}
		
	}
}
