package level1;

public class CodingTest5 {
	
//	x��ŭ ������ �ִ� n���� ����
	
//	���� ����
//	�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
//	���� ����
//	x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
//	n�� 1000 ������ �ڿ����Դϴ�.
	
//	����� ��
//	x	n	answer
//	2	5	[2,4,6,8,10]
//	4	3	[4,8,12]
//	-4	2	[-4, -8]
	
	public static void main(String[] args) {
		CodingTest5 solution = new CodingTest5();
		int x = -4;
		int n = 5;
		long[] data = solution.solution(x, n);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
	
	private long[] solution(int x, int n) {
		long[] answer = new long[n];
		long data = x;
		
		for (int i = 0; i < n; i++) {
			answer[i] = data;
			data += x;
		}
		
		return answer;
	}
}
