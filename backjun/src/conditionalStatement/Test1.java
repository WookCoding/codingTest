package conditionalStatement;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
//		����
//		�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
//
//		���
//		ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
//
//		A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
//		A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
//		A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
//		����
//		-10,000 �� A, B �� 10,000
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String[] datas = {">", "<", "=="};
		String answer = "";
		
		if(a > b) {
			answer = datas[0];
		}else if(a < b) {
			answer = datas[1];
		}else {
			answer = datas[2];
		}
		System.out.println(answer);
		
		sc.close();
		
	}
}
