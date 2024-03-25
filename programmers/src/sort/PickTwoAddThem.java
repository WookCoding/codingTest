package sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//	두 개 뽑아서 더하기 ----- level 1
public class PickTwoAddThem {
//	실행
	public static void main(String[] args) {
		PickTwoAddThem addThem = new PickTwoAddThem();
		int[] numbers1 = {2, 1, 3, 4, 1};
		int[] numbers2 = {5, 0, 2, 7};
		
//		결과 : [2, 3, 4, 5, 6, 7];
		System.out.println(Arrays.toString(addThem.solution(numbers1)));
//		결과 : [2, 5, 7, 9, 12]
		System.out.println(Arrays.toString(addThem.solution(numbers2)));
		
	}
//	구현
	public int[] solution(int[] numbers) {
		Set<Integer> answer = new HashSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if(j == i) continue;
				answer.add(numbers[i] + numbers[j]); 
			}
		}

		return answer.stream().mapToInt(Integer :: intValue).sorted().toArray();
	}
}
