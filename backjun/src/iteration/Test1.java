package iteration;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
//		����
//		N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
//
//		�Է�
//		ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
//
//		���
//		������İ� ���� N*1���� N*9���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < 9; i++) {
			System.out.println(a + " * " + (i + 1) +" = " + ( a *(i+1)));
		}
		
		sc.close();
	}
}
