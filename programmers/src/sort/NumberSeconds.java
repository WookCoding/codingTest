package sort;

import java.util.Arrays;

//	k번째수 ------ level 1
public class NumberSeconds {
//	실행
	public static void main(String[] args) {
		NumberSeconds numberSeconds = new NumberSeconds();
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		System.out.println(Arrays.toString(numberSeconds.solution(array, commands)));
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < answer.length; i++) {
			int[] command = commands[i];
			
			int start = command[0] - 1;
			int end = command[1];	
			int k = command[2] - 1;
			
			int[] data = Arrays.copyOfRange(array, start, end);
			Arrays.sort(data);
			answer[i] = data[k];
		}
		
		return answer;
	}
}