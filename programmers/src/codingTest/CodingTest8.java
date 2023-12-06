package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CodingTest8 {
	public static void main(String[] args) {
		
		CodingTest8 solution = new CodingTest8();
		int[] people = {70, 50, 80, 50};
//		int[] people = {70 , 80, 50};
		int limit = 100;
		int answer = 0;
		
		answer = solution.solution(people, limit);
		System.out.println(answer);
	}
	
//	���� ����
//	���ε��� ���� ������� ����Ʈ�� �̿��Ͽ� �����Ϸ��� �մϴ�. ����Ʈ�� �۾Ƽ� �� ���� �ִ� 2�� �ۿ� Ż �� ����, ���� ���ѵ� �ֽ��ϴ�.
//
//	���� ���, ������� �����԰� [70kg, 50kg, 80kg, 50kg]�̰� ����Ʈ�� ���� ������ 100kg�̶�� 2��° ����� 4��° ����� ���� Ż �� ������ 1��° ����� 3��° ����� ������ ���� 150kg�̹Ƿ� ����Ʈ�� ���� ������ �ʰ��Ͽ� ���� Ż �� �����ϴ�.
//
//	����Ʈ�� �ִ��� ���� ����Ͽ� ��� ����� �����Ϸ��� �մϴ�.
//
//	������� �����Ը� ���� �迭 people�� ����Ʈ�� ���� ���� limit�� �Ű������� �־��� ��, ��� ����� �����ϱ� ���� �ʿ��� ����Ʈ ������ �ּڰ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//	���ѻ���
//	���ε��� ���� ����� 1�� �̻� 50,000�� �����Դϴ�.
//	�� ����� �����Դ� 40kg �̻� 240kg �����Դϴ�.
//	����Ʈ�� ���� ������ 40kg �̻� 240kg �����Դϴ�.
//	����Ʈ�� ���� ������ �׻� ������� ������ �� �ִ񰪺��� ũ�� �־����Ƿ� ������� ������ �� ���� ���� �����ϴ�.
//	����� ��
//	people	limit	return
//	[70, 50, 80, 50]	100	3
//	[70, 80, 50]	100	3
	
	
    public int solution(int[] people, int limit) {
    	int answer = 0;
    	int data = 0;
    	int left = 0;
    	int right = people.length - 1;
    	Arrays.sort(people);
    	while(right >= left) {
    		data = people[right--];
    		if (data + people[left] <= limit) {
                left++;
              }
            answer++;
    	}
    	
        return answer;
    }
}
