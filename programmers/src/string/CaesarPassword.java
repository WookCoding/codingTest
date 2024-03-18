package string;

// ���� ��ȣ -- Level 1
public class CaesarPassword {
	
//	 ����
	public static void main(String[] args) {
		CaesarPassword caesarPassword = new CaesarPassword();
		
//		�Է� ��
		String s1 = "AB";
		String s2 = "z";
		String s3 = "a B z";
		int n1 = 1;
		int n2 = 1;
		int n3 = 4;

//		��� �� = "BC"
		System.out.println(caesarPassword.solution(s1, n1));
		
//		��� �� = "a"
		System.out.println(caesarPassword.solution(s2, n2));
		
//		��� �� = "e F d"
		System.out.println(caesarPassword.solution(s3, n3));
		
	}
	
//	����
	public String solution(String s, int n) {
		StringBuilder stringBuilder = new StringBuilder();
		char[] datas = s.toCharArray();

		for (char data : datas) {
			stringBuilder.append(push(data, n));
		}

		return stringBuilder.toString();
	}
	
	private char push(char c, int n) {
		if(!Character.isAlphabetic(c)) return c;
		
		int offset = Character.isUpperCase(c)? 'A' : 'a';
		int position = c - offset;
		
		position = (position + n) % ('z' - 'a' + 1); 
		return (char)(offset + position);
	}
}
