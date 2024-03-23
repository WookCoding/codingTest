package recursive;

import java.util.ArrayList;
import java.util.List;

//	���� ���� -- level 2

//���� ����
//������ ���ĺ� ���� 'A', 'E', 'I', 'O', 'U'���� ����Ͽ� ���� �� �ִ�, ���� 5 ������ ��� �ܾ ���ϵǾ� �ֽ��ϴ�.
//�������� ù ��° �ܾ�� "A"�̰�, �״����� "AA"�̸�, ������ �ܾ�� "UUUUU"�Դϴ�.
//
//�ܾ� �ϳ� word�� �Ű������� �־��� ��, �� �ܾ �������� �� ��° �ܾ����� return �ϵ��� solution �Լ��� �ϼ����ּ���.
//
//���ѻ���
//word�� ���̴� 1 �̻� 5 �����Դϴ�.
//word�� ���ĺ� �빮�� 'A', 'E', 'I', 'O', 'U'�θ� �̷���� �ֽ��ϴ�.


public class VowelDictionary {
//	����
	public static void main(String[] args) {
		String word1 = "AAAAE";
		String word2 = "AAAE";
		String word3 = "I";
		String word4 = "EIO";
				
		VowelDictionary dictionary = new  VowelDictionary();
		
//		��� : 6
		System.out.println(dictionary.solution(word1));
		
//		��� : 10
		System.out.println(dictionary.solution(word2));
		
//		��� : 1563
		System.out.println(dictionary.solution(word3));
		
//		��� : 1189
		System.out.println(dictionary.solution(word4));
		
	}
//	����

	private static final char[] CHARS = "AEIOU".toCharArray();
	
	public int solution(String word) {
//		���� : word
//		���� ���� : 5�� �̻��� word = word
//		��ȭ�� : word = word + (word + 'A') + (word + 'E') + (word + 'I')
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
