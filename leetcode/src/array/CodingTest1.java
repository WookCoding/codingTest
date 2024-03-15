package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class CodingTest1 {
	
//	���� �迭 nums �� ������ �־����� �� ������ ���� �� �Ǵ� �ε�����target ��ȯ�մϴ� .target
//
//	�� �Է¿��� ��Ȯ�� �ϳ��� �ַ���� �ִٰ� ������ �� ������ ������ ��Ҹ� �� �� ����� �� �����ϴ� .
//
//	� �����ε� �亯�� ��ȯ�� �� �ֽ��ϴ�.
//
//
//	���� 1:
//
//	�Է�: nums = [2,7,11,15], target = 9
//	 ���: [0,1]
//	 ����: nums[0] + nums[1] == 9�̹Ƿ� [0, 1]�� ��ȯ�մϴ�.
//	�� 2:
//
//	�Է�: ���� = [3,2,4], ��� = 6
//	 ���: [1,2]
//	���� 3:
//
//	�Է�: ���� = [3,3], ��� = 6
//	 ���: [0,1]
	
	
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
		
//		�ð� ���⵵ O(n)
//		���� ���⵵ O(n)
	}
}
