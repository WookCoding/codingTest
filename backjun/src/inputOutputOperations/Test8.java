package inputOutputOperations;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
//		����
//		(A+B)%C�� ((A%C) + (B%C))%C �� ������?
//
//		(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
//
//		�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
//
//		���
//		ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a + b) % c);
		System.out.println( (( a % c ) + (b % c)) % c);
		System.out.println((a * b ) % c);
		System.out.println(((a % c) * ( b % c)) % c);
		
	}
}
	