package iteration;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
//		����
//		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//
//		�Է�
//		ù° �ٿ� N(1 �� N �� 100)�� �־�����.
//
//		���
//		ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		
//		���� ��� 
//		*
//		**
//		***
//		****
//		*****
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String answer = "";
		
		for (int i = 0; i < count; i++) {
			answer += "*";
			System.out.println(answer);
		}
		sc.close();
	}
}
