package inputOutputOperations;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
//		����
//		�� ���� A�� B�� �Է¹��� ����, A��B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		���
//		ù° �ٿ� A��B�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a * b);
		sc.close();
	}
}
