package string;

// 문자열 다루기 기본 ---- level 1
public class StringHandlingBasics {

//	실행
	public static void main(String[] args) {
		String s1 = "a234";
		String s2 = "1234";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}
	
//	구현
	private static boolean solution(String s) {
		return s.matches("[0-9]{4}|[0-9]{6}");
	}
	
	
}
