package conditionalStatement;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
//		����
//		����̴� ���� ��ħ �˶��� ��� �Ͼ��. �˶��� ��� �ٷ� �Ͼ�� �����̰�����, �׻� ���ݸ� �� �ڷ��� ���� ������ ���� �б��� �����ϰ� �ִ�.
//
//		����̴� ��� ����� �����غ�������, ���ݸ� �� �ڷ��� ������ �� � �͵� ���� ���� ������.
//
//		�̷� ����̸� �ҽ��ϰ� ���� â���̴� �ڽ��� ����ϴ� ����� ��õ�� �־���.
//
//		�ٷ� "45�� ���� �˶� �����ϱ�"�̴�.
//
//		�� ����� �ܼ��ϴ�. ���� �����Ǿ� �ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. ������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�. �� ����� ����ϸ�,
//		���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
//
//		���� ����̰� ������ �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������ �˶� �ð� H�� M���� �ǹ��Ѵ�.
//
//		�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
//
//		���
//		ù° �ٿ� ����̰� â������ ����� ����� ��, �����ؾ� �ϴ� �˶� �ð��� ����Ѵ�. (�Է°� ���� ���·� ����ϸ� �ȴ�.)
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		b = b - 45;
		
		if(b < 0) {
			a--;
			b += 60;
		}
		
		if(a < 0) {
			a = 23;
		}
		
		System.out.println(a + " " + b);
		sc.close();
	}
}