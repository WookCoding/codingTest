package level1;

public class CodingTest3 {
//	���ڿ��� ������ �ٲٱ�
//	���� ����
//	���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
//
//	���� ����
//	s�� ���̴� 1 �̻� 5�����Դϴ�.
//	s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
//	s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
//	s�� "0"���� �������� �ʽ��ϴ�.

//	����� ��
//	������� str�� "1234"�̸� 1234�� ��ȯ�ϰ�, "-1234"�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
//	str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�

	public static void main(String[] args) {
		CodingTest3 solution = new CodingTest3();
		String str = "-1234";
		
		System.out.println("����� : " + solution.solution(str));
	}
	
	private int solution(String s) {
		return Integer.parseInt(s);
	}
}
