package level2;

public class CodingTest3 {
	public static void main(String[] args) {
//		괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
//		"()()" 또는 "(())()" 는 올바른 괄호입니다.
//		")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
//		'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

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

