package inputOutputOperations;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		
//		문제
//		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

//			472 ˙˙˙˙˙˙˙˙ 1 
//		x	385 ˙˙˙˙˙˙˙˙ 2
//		____________________
//			2360 ˙˙˙˙˙˙˙˙ 3 
//		  3776   ˙˙˙˙˙˙˙˙ 4 
//		1416     ˙˙˙˙˙˙˙˙ 5 
//		____________________
//		181720   ˙˙˙˙˙˙˙˙ 6
		
//		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//		출력
//		첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		String[] data = b.split("");
	
		for (int i = 0; i < data.length; i++) {
			System.out.println(a * Integer.parseInt(data[data.length - (i + 1)]));
		}
		
		System.out.println(a * Integer.parseInt(b));
		
		sc.close();
	}
}
