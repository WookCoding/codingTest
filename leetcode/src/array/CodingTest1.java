package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class CodingTest1 {
	
//	정수 배열 nums 과 정수가 주어지면 두 숫자의 합이 가 되는 인덱스를target 반환합니다 .target
//
//	각 입력에는 정확히 하나의 솔루션이 있다고 가정할 수 있으며 동일한 요소를 두 번 사용할 수 없습니다 .
//
//	어떤 순서로든 답변을 반환할 수 있습니다.
//
//
//	예시 1:
//
//	입력: nums = [2,7,11,15], target = 9
//	 출력: [0,1]
//	 설명: nums[0] + nums[1] == 9이므로 [0, 1]을 반환합니다.
//	예 2:
//
//	입력: 숫자 = [3,2,4], 대상 = 6
//	 출력: [1,2]
//	예시 3:
//
//	입력: 숫자 = [3,3], 대상 = 6
//	 출력: [0,1]
	
	
	public static void main(String[] args) {
		CodingTest1 test = new CodingTest1();
		
		int[] nums1 = {2, 7, 11, 15};
		int target1 = 9;
		
		int[] nums2 = {3,2,4};
		int target2 = 6;
		
		int[] nums3 = {3, 3};
		int target3 = 6;
		
		
		System.out.println(Arrays.toString(test.solution(nums1, target1)));
		System.out.println(Arrays.toString(test.solution(nums2, target2)));
		System.out.println(Arrays.toString(test.solution(nums3, target3)));
		
	}
	public int[] solution(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
				return new int[] {i, map.get(target - nums[i])};
			}
		}
		
		return new int[0];
		
//		시간 복잡도 O(n)
//		공간 복잡도 O(n)
	}
}
