package recursive;

import java.util.ArrayList;
import java.util.List;

//	모음 사전 -- level 2

//문제 설명
//사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 길이 5 이하의 모든 단어가 수록되어 있습니다.
//사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA"이며, 마지막 단어는 "UUUUU"입니다.
//
//단어 하나 word가 매개변수로 주어질 때, 이 단어가 사전에서 몇 번째 단어인지 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//word의 길이는 1 이상 5 이하입니다.
//word는 알파벳 대문자 'A', 'E', 'I', 'O', 'U'로만 이루어져 있습니다.


public class VowelDictionary {
//	실행
	public static void main(String[] args) {
		String word1 = "AAAAE";
		String word2 = "AAAE";
		String word3 = "I";
		String word4 = "EIO";
				
		VowelDictionary dictionary = new  VowelDictionary();
		
//		출력 : 6
		System.out.println(dictionary.solution(word1));
		
//		출력 : 10
		System.out.println(dictionary.solution(word2));
		
//		출력 : 1563
		System.out.println(dictionary.solution(word3));
		
//		출력 : 1189
		System.out.println(dictionary.solution(word4));
		
	}
//	구현

	private static final char[] CHARS = "AEIOU".toCharArray();
	
	public int solution(String word) {
//		상태 : word
//		종료 조건 : 5자 이상인 word = word
//		점화식 : word = word + (word + 'A') + (word + 'E') + (word + 'I')
//						+ (word + 'O') + (word + 'I')
		List<String> data = new ArrayList<String>();
		generate("", data);
		return data.indexOf(word);
	}
	
	private void generate(String word, List<String> data){
			data.add(word);

			if(word.length() == 5) return;
			for (char c : CHARS) {
				generate(word + c, data);
			}
	}
	
	
	
}
