package level1;

public class CodingTest6 {
	
//	�ڿ��� ������ �迭�� �����
//	���� ����
//	�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
//
//	���� ����
//	n�� 10,000,000,000������ �ڿ����Դϴ�.
//	����� ��
//	n	return
//	12345	[5,4,3,2,1]
	
	public static void main(String[] args) {
		CodingTest6 solution = new CodingTest6();
		long n = 12345;
		int[] data = solution.solution(n);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("����� : " + data[i]);
		}
	}
	
	private int[] solution(long n) {
		String[] data = (n+"").split("");
		int[] answer = new int[data.length];
		
		for (int i = 0; i < data.length; i++) {
			answer[i] = Integer.parseInt(data[data.length - (i + 1)]);
		}
		
		return answer;
	}
}
