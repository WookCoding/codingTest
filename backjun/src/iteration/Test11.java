package iteration;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
//		����
//		�ð� ����	�޸� ����	����	����	���� ���	���� ����
//		1 ��	256 MB	266011	139514	118751	52.268%
//		����
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		�Է��� ���������� 0 �� ���� ���´�.
//
//		���
//		�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			System.out.println(a + b);
		}
		
	}
}
