package level1;

import java.util.Arrays;

//���� ����
//������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
//
//���� ����
//arr�� ���� 1 �̻��� �迭�Դϴ�.
//�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
//����� ��
//arr	return
//[4,3,2,1]	[4,3,2]
//[10]	[-1]

public class CodingTest9 {
	public static void main(String[] args) {
		CodingTest9 c = new CodingTest9();
		int[] arr1 = {4, 3, 2, 1};
		int[] arr2 = {10};

		System.out.println(Arrays.toString(c.solution(arr1)));
		System.out.println(Arrays.toString(c.solution(arr2)));
	}
	
	public int[] solution (int[] arr) {
		int[] answer = new int[arr.length -1];
		int data = arr[0];
		int index = 0;
		
		if(arr.length <= 1) {
			return new int[] {-1};
		}
		
		for (int i = 0; i < arr.length; i++) {
			data = Math.min(data, arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(data == arr[i]) {
				continue;
			}
			answer[index++] = arr[i]; 
		}
		
		return answer; 
	}
//	 �ð� ���⵵ O(n)
}
