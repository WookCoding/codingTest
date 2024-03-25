package sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//	�� �� �̾Ƽ� ���ϱ� ----- level 1
public class PickTwoAddThem {
//	����
	public static void main(String[] args) {
		PickTwoAddThem addThem = new PickTwoAddThem();
		int[] numbers1 = {2, 1, 3, 4, 1};
		int[] numbers2 = {5, 0, 2, 7};
		
//		��� : [2, 3, 4, 5, 6, 7];
		System.out.println(Arrays.toString(addThem.solution(numbers1)));
//		��� : [2, 5, 7, 9, 12]
		System.out.println(Arrays.toString(addThem.solution(numbers2)));
		
	}
//	����
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
