package level2;

import java.util.Arrays;
import java.util.Collections;

public class CodingTest9 {
	
	public static void main(String[] args) {
		CodingTest9 solution = new CodingTest9();
		
		int[] arrays = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
		int[] answer = solution.solution(arrays, commands);
		
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}
	
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
				int[] ar = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
				Arrays.sort(ar);
				answer[i] = ar[commands[i][2] - 1];
		}
		
		return answer;
	}
}

