package level1;

public class CodingTest1 {
	public static void main(String[] args) {
//		����� ��
//		���� ����
//		���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
//
//		���� ����
//		n�� 0 �̻� 3000������ �����Դϴ�.
		
//		����� ��
//		n	return
//		12	28
//		5	6
		
//		����� �� ����
//		����� �� #1
//		12�� ����� 1, 2, 3, 4, 6, 12�Դϴ�. �̸� ��� ���ϸ� 28�Դϴ�.
		
//		����� �� #2
//		5�� ����� 1, 5�Դϴ�. �̸� ��� ���ϸ� 6�Դϴ�.
		
		CodingTest1 solution = new CodingTest1();
		int n = 12;
		System.out.println("��� �� : " + solution.solution(n));
	}
	
	private int solution(int n) {
		int answer = 0;
		int data = 1;
		while(data <= n) {
			if(n % data == 0) {
				answer += data;
			}
			data++;
		}
		return answer;
	}
}
