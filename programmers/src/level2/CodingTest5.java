package level2;

import java.util.Stack;

public class CodingTest5 {
	public static void main(String[] args) {
//		¦���� �����ϱ��, ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��� ������ �����մϴ�. ���� ���ڿ����� ���� ���ĺ��� 2�� �پ� �ִ� ¦�� ã���ϴ�. �״���,
//		�� ���� ������ ��, �յڷ� ���ڿ��� �̾� ���Դϴ�. �� ������ �ݺ��ؼ� ���ڿ��� ��� �����Ѵٸ� ¦���� �����ϱⰡ ����˴ϴ�. ���ڿ� S�� �־����� ��,
//		¦���� �����ϱ⸦ ���������� ������ �� �ִ��� ��ȯ�ϴ� �Լ��� �ϼ��� �ּ���. ���������� ������ �� ������ 1��, �ƴ� ��� 0�� �������ָ� �˴ϴ�.
//		���� ���, ���ڿ� S = baabaa ���
//		b aa baa �� bb aa �� aa ��
//		�� ������ ���ڿ��� ��� ������ �� �����Ƿ� 1�� ��ȯ�մϴ�.
		
		CodingTest5 test = new CodingTest5();
		String s = "cdcd";
		
		System.out.println(test.solution(s));
		
	}
	
	
	public int solution(String s) {
		Stack<String> stack = new Stack<String>();
		String[] datas = s.split("");
		
		stack.push(datas[0]);
		System.out.println(stack.peek());
		for (int i = 1; i < datas.length; i++) {
			if(!stack.isEmpty() && stack.peek().equals(datas[i])) {
				stack.pop();
			}else {
				stack.add(datas[i]);
				System.out.println(stack.peek());
			}
		}
		
		return stack.isEmpty() ? 1 : 0;
	}
}
