package iteration;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
//		����
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		���
//		�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a = 0;
		int b = 0;

		for (int i = 0; i < count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #" + (i + 1) + ": "  + (a + b));
		}
		sc.close();
	}
}
