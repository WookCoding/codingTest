package string;

import java.util.ArrayList;
import java.util.List;

// ���ڿ� ���� --- level 2
public class StringCompression {
	// ����
	public static void main(String[] args) {
		StringCompression compression = new StringCompression();
		String s1 = "aabbaccc";
		String s2 = "ababcdcdababcdcd";
		String s3 = "abcabcdede";
		String s4 = "abcabcabcabcdededededede";
		String s5 = "xababcdcdababcdcd";
		

//		��� 7
		System.out.println(compression.solution(s1));
		
//		��� 9
		System.out.println(compression.solution(s2));
		
//		��� 8
		System.out.println(compression.solution(s3));
		
//		��� 14
		System.out.println(compression.solution(s4));
		
//		��� 17
		System.out.println(compression.solution(s5));
	}
	
//	����
	public int solution(String s) {
		int min = Integer.MAX_VALUE;
		for (int length = 1; length <= s.length(); length++) {
			int compressed = compress(s, length);
			if(compressed < min) {
				min = compressed;
			}
			
		}
		return min;
	}
	
	private int compress(String source, int length) {
		StringBuilder builder = new StringBuilder();
		
		String last = "";
		int count = 0;
		
		for(String token : split(source, length)) {
			if(token.equals(last)) {
				count++;
			}else {
				if(count > 1) builder.append(count);
				builder.append(last);
				last = token;
				count = 1;
			}
		}
		if(count > 1) builder.append(count);
		builder.append(last);
		return builder.length();
	}
	
	private List<String> split(String source, int length){
		List<String> tokens = new ArrayList<String>();
		for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
			int endIndex = startIndex + length;
			if(endIndex > source.length()) endIndex = source.length();
			tokens.add(source.substring(startIndex, endIndex));
		}
		
		return tokens;
	}
}
