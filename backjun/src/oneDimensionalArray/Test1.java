package oneDimensionalArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
//		����
//		�� N���� ������ �־����� ��, ���� v�� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� ������ ���� N(1 �� N �� 100)�� �־�����. ��° �ٿ��� ������ �������� ���еǾ����ִ�. ��° �ٿ��� ã������ �ϴ� ���� v�� �־�����. �Է����� �־����� ������ v�� -100���� ũ�ų� ������, 100���� �۰ų� ����.
//
//		���
//		ù° �ٿ� �Է����� �־��� N���� ���� �߿� v�� �� ������ ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v = 0;
		int answer = 0;
		int[] datas = new int[n];
		
		for (int i = 0; i < datas.length; i++) {
			datas[i] = sc.nextInt();
		}
		v = sc.nextInt();
		
		for (int i = 0; i < datas.length; i++) {
			if(datas[i] == v) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
