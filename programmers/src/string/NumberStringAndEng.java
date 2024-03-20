package string;


//	숫자 문자열과 영단어 --- level 1
public class NumberStringAndEng {
//	 실행
	public static void main(String[] args) {
		String s1 = "one4seveneight";
		String s2 = "23four5six7";
		String s3 = "2three45sixseven";
		String s4 = "123";
		
//		예상 출력 : 1478
		System.out.println(solution(s1));
		
//		예상 출력 : 234567
		System.out.println(solution(s2));
		
//		예상 출력 : 234567
		System.out.println(solution(s3));
		
//		예상 출력 : 123
		System.out.println(solution(s4));
	}
	
//	구현
	public static int solution(String s) {

		for (int i = 0; i < words.length; i++) {
			s = s.replace(words[i], Integer.toString(i));
		}
		return Integer.parseInt(s);
	}
	
	private static String[] words = {
			"zero", "one", "two", "three",
			"four", "five", "six", "seven",
			"eight", "nine"
	};
}
