package string;


//	���� ���ڿ��� ���ܾ� --- level 1
public class NumberStringAndEng {
//	 ����
	public static void main(String[] args) {
		String s1 = "one4seveneight";
		String s2 = "23four5six7";
		String s3 = "2three45sixseven";
		String s4 = "123";
		
//		���� ��� : 1478
		System.out.println(solution(s1));
		
//		���� ��� : 234567
		System.out.println(solution(s2));
		
//		���� ��� : 234567
		System.out.println(solution(s3));
		
//		���� ��� : 123
		System.out.println(solution(s4));
	}
	
//	����
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
