package conditionalStatement;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
//		����
//		���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
//
//		���
//		���� ������ ����Ѵ�.

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String answer = "";
		
		if(90 <= a) {
			answer = "A";
		}else if(80 <= a) {
			answer = "B";
		}else if (70 <= a) {
			answer = "C";
		}else if (60 <= a) {
			answer = "D";
		}else {
			answer = "F";
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
