package iteration;

import java.util.Iterator;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
//		����
//		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//
//		������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� N(1 �� N �� 100)�� �־�����.
//
//		���
//		ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		
//		���� ���  
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
