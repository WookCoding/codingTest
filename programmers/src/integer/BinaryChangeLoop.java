package integer;

import java.util.Arrays;

// 이진 변화 반복하기 --- level 2
public class BinaryChangeLoop {
//	 실행
	public static void main(String[] args) {
		BinaryChangeLoop binaryChangeLoop = new BinaryChangeLoop();
		String s1 = "110010101001";
		String s2 = "01110";
		String s3 = "1111111";
		
//		예상 출력 : [3, 8]
		System.out.println(Arrays.toString(binaryChangeLoop.solution(s1)));
		
//		예상 출력 : [3, 3]
		System.out.println(Arrays.toString(binaryChangeLoop.solution(s2)));
		
//		예상 출력 : [4, 1]
		System.out.println(Arrays.toString(binaryChangeLoop.solution(s3)));
	}
	
//	구현
	public int[] solution(String s) {
		int loop = 0;
		int remove = 0;
		
		while(!s.equals("1")) {
			int zeros = countZeros(s);
			loop ++;
			remove += zeros;
			
			int ones = s.length() - zeros;
			s = Integer.toString(ones, 2);
		}
		
		return new int[] {loop, remove};
	}
	
	private int countZeros(String s) {
		int zeros = 0;
		
		for(char sData : s.toCharArray()) {
			if(sData == '0') zeros++;
		}
		
		return zeros;
	}
}
