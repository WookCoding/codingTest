package string;

// ���ڿ� �� p�� y�� ���� ---- level 1
public class NumberSpecificCharactersString {
//	 ����
	public static void main(String[] args) {
		NumberSpecificCharactersString charactersString = new NumberSpecificCharactersString();
		String s1 = "pPoooyY";
		String s2 = "Pyy";
		
//		���� ��� : true
		System.out.println(charactersString.solution(s1));
		
//		���� ��� : false
		System.out.println(charactersString.solution(s2));
		
	}
	
//	����
	public boolean solution(String s) {
		s = s.toLowerCase();
		
		int pCount = s.length() - s.replace("p", "").length();
		int yCount = s.length() - s.replace("y", "").length();
		
		return pCount == yCount;
	}

}
