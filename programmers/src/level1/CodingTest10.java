package level1;

import java.util.stream.IntStream;

public class CodingTest10 {
	public static void main(String[] args) {
		CodingTest10 c = new CodingTest10();
		
		System.out.println(c.solution(3, 5));
	}
	
	public long solution(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		if(a == b) {
			return a;
		}
		
		return Long.valueOf(IntStream.rangeClosed(min, max).sum());
	}
}
