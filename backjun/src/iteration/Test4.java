package iteration;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
//		����
//		�ؿ��̴� ���� �ֿ� ��鼭 ó������ �ڽ�Ʈ�ڸ� �� �ô�. ���� ������. �׷���, �� �� ������ �ʾҴµ� �����ϰ� ���� �ݾ��� ������ ���̴�!
//		�ؿ��̴� �������� ���鼭 ��Ȯ�ϰ� ���� ���� �´��� Ȯ���غ��� �Ѵ�.
//
//		�������� ����,
//		������ �� ������ ���ݰ� ����
//		������ ���ǵ��� �� �ݾ�
//		�� ����, ������ ������ ���ݰ� ������ ����� �� �ݾ��� �������� ���� �� �ݾװ� ��ġ�ϴ��� �˻��غ���.
//
//		�Է�
//		ù° �ٿ��� �������� ���� �� �ݾ� 
//		$X$�� �־�����.
//
//		��° �ٿ��� �������� ���� ������ ������ ������ �� 
//		$N$�� �־�����.
//
//		���� 
//		$N$���� �ٿ��� �� ������ ���� $a$�� 
//		���� $b$�� ������ ���̿� �ΰ� �־�����.
//
//		���
//		������ ������ ���ݰ� ������ ����� �� �ݾ��� �������� ���� �� �ݾװ� ��ġ�ϸ� Yes�� ����Ѵ�. ��ġ���� �ʴ´ٸ� No�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int count = sc.nextInt();
		int price = 0;
		int productCount = 0;
		int checkPrice = 0;
		String answer = "";
		
		for (int i = 0; i < count; i++) {
			price = sc.nextInt();
			productCount = sc.nextInt();
			checkPrice += price * productCount;
		}
		
		answer = sum == checkPrice ? "Yes" : "No";
		System.out.println(answer);
		sc.close();
	}
}
