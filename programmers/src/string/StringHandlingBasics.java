package string;

// ���ڿ� �ٷ�� �⺻ ---- level 1
public class StringHandlingBasics {

//	����
	public static void main(String[] args) {
		String s1 = "a234";
		String s2 = "1234";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}
	
//	����
	private static boolean solution(String s) {
		return s.matches("[0-9]{4}|[0-9]{6}");
	}
	
	
}
