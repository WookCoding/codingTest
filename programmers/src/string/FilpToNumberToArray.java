package string;

import java.util.Arrays;


// 자연수를 뒤집어 배열로 만들기 -- Level 1
public class FilpToNumberToArray {
	public static void main(String[] args) {
		FilpToNumberToArray filpToNumberToArray = new FilpToNumberToArray();
		int n = 12345;
		
		System.out.println(Arrays.toString(filpToNumberToArray.soultion(n)));
		
	}
	
	public int[] soultion(long n) {
		String data = Long.toString(n);
		String reverse = new StringBuilder(data).reverse().toString();
		char[] reverseDatas = reverse.toCharArray();
		int[] answer = new int[reverseDatas.length];
		
		for (int i = 0; i < reverseDatas.length; i++) {
			answer[i] = reverseDatas[i] - '0';
		}
		
		return answer;
	}
}
