package iteration;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Test3 {
	public static void main(String[] args) {
//		����
//		n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
//
//		���
//		1���� n���� ���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = IntStream.range(1, n + 1).sum();
		System.out.println(answer);
		sc.close();
	}
}
