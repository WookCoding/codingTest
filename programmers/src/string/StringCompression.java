package string;

import java.util.ArrayList;
import java.util.List;

// 문자열 압축 --- level 2
public class StringCompression {
	// 실행
	public static void main(String[] args) {
		StringCompression compression = new StringCompression();
		String s1 = "aabbaccc";
		String s2 = "ababcdcdababcdcd";
		String s3 = "abcabcdede";
		String s4 = "abcabcabcabcdededededede";
		String s5 = "xababcdcdababcdcd";
		

//		출력 7
		System.out.println(compression.solution(s1));
		
//		출력 9
		System.out.println(compression.solution(s2));
		
//		출력 8
		System.out.println(compression.solution(s3));
		
//		출력 14
		System.out.println(compression.solution(s4));
		
//		출력 17
		System.out.println(compression.solution(s5));
	}
	
//	구현
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
