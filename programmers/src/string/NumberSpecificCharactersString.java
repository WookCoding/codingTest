package string;

// 문자열 내 p와 y의 개수 ---- level 1
public class NumberSpecificCharactersString {
//	 실행
	public static void main(String[] args) {
		NumberSpecificCharactersString charactersString = new NumberSpecificCharactersString();
		String s1 = "pPoooyY";
		String s2 = "Pyy";
		
//		예상 결과 : true
		System.out.println(charactersString.solution(s1));
		
//		예상 결과 : false
		System.out.println(charactersString.solution(s2));
		
	}
	
//	구현
	public boolean solution(String s) {
		s = s.toLowerCase();
		
		int pCount = s.length() - s.replace("p", "").length();
		int yCount = s.length() - s.replace("y", "").length();
		
		return pCount == yCount;
	}

}
