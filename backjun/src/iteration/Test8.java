package iteration;

import java.util.Scanner;

public class Test8 {
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
//		�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #" + (i + 1) + ": " + a +" + " + b+" = " +(a + b));
		}
		
		
	}
}
