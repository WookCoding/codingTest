package inputOutputOperations;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		
//		����
//		(�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.

//			472 ���������������� 1 
//		x	385 ���������������� 2
//		____________________
//			2360 ���������������� 3 
//		  3776   ���������������� 4 
//		1416     ���������������� 5 
//		____________________
//		181720   ���������������� 6
		
//		(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
//
//		���
//		ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.
		
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
