package level1;

import java.util.Arrays;

public class CodingTest2 {
//	���� ����
//	������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.

//	���ѻ���
//	arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
//	arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.

//	����� ��
//	arr	return
//	[1,2,3,4]	2.5
//	[5,5]	5
	public static void main(String[] args) {
		CodingTest2 solution = new CodingTest2();
		int[] arr = {1, 2, 3, 4};
		System.out.println("��� �� : " + solution.solution(arr));
	}
	
	private double solution(int[] arr) {
		double answer = 0;
		answer = (Arrays.stream(arr).sum() + 0.0) / arr.length;
		return answer;
	}
}
