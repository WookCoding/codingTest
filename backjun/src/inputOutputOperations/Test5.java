package inputOutputOperations;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
//		����
//		�� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//
//		�Է�
//		�� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)
//
//		���
//		ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a * b );
		System.out.println( a / b );
		System.out.println( a % b );
		
		sc.close();
	}
}
