package level2;

public class CodingTest3 {
	public static void main(String[] args) {
//		��ȣ�� �ٸ��� ¦�������ٴ� ���� '(' ���ڷ� �������� �ݵ�� ¦��� ')' ���ڷ� ������ �Ѵٴ� ���Դϴ�. ���� ���
//		"()()" �Ǵ� "(())()" �� �ùٸ� ��ȣ�Դϴ�.
//		")()(" �Ǵ� "(()(" �� �ùٸ��� ���� ��ȣ�Դϴ�.
//		'(' �Ǵ� ')' �θ� �̷���� ���ڿ� s�� �־����� ��, ���ڿ� s�� �ùٸ� ��ȣ�̸� true�� return �ϰ�, �ùٸ��� ���� ��ȣ�̸� false�� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

		CodingTest3 test = new CodingTest3();
		
		String s1 = "()()";
		String s2 = "(())()";		
		String s3 = ")()(";		
		String s4 = "(()(";		
		String s5 = "(((((())))))))))))))";
		
		System.out.println(test.solution(s4));
		
	}
	
	public boolean solution(String s) {
		int count = 0;
		
		if(s.charAt(0) == ')' || s.charAt(s.length() -1) == '(') {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			count += s.charAt(i) == '(' ? 1 : -1;
			if(count < 0) {
				return false;
			}
		}
		return count == 0;
	}
}

