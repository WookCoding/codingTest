package inputOutputOperations;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
//		����
//		���� �����̴� ���� A + B ������ ���� ����� �� �ִ�. ���� A + B + C�� ����� �����̴�!
//
//		�Է�
//		ù ��° �ٿ� A, B, C (1 �� A, B, C �� 10��12��)�� ������ ���̿� �ΰ� �־�����.
//
//		���
//		A+B+C�� ���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		String[] datas = sc.nextLine().split(" ");
		long answer = 0;
		
		for (int i = 0; i < datas.length; i++) {
			answer += Long.parseLong(datas[i]);
		}
		System.out.println(answer);
		sc.close();
	}
}
