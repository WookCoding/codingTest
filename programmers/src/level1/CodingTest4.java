package level1;

public class CodingTest4 {
//	���� ����
//	���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
//
//	���� ����
//	num�� int ������ �����Դϴ�.
//	0�� ¦���Դϴ�.
//	����� ��
//	num	return
//	3	"Odd"
//	4	"Even"
	public static void main(String[] args) {
		CodingTest4 solution = new CodingTest4();
		int num = 3;
		System.out.println("����� : " + solution.solution(num));
	}
	
	private String solution(int num) {
		String answer = num % 2 == 0 ? "Even" : "Odd";
		return answer;
	}
}
