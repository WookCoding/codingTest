package level1;

import java.util.Arrays;
import java.util.Stack;

//���� ����
//�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,
//
//arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
//arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
//�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
//
//���ѻ���
//�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
//�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
//����� ��
//arr	answer
//[1,1,3,3,0,1,1]	[1,3,0,1]
//[4,4,4,3,3]	[4,3]
//����� �� ����
//����� �� #1,2
//������ ���ÿ� �����ϴ�.
public class CodingTest12 {
	public static void main(String[] args) {
		CodingTest12 c = new CodingTest12();
		int[] arr = {1, 1, 4,5, 6,6};
		System.out.println(Arrays.toString(c.solution(arr)));
		
	}
	
	 public int[] solution(int []arr) {
	        Stack<Integer> datas = new Stack<Integer>();
	        int[] answer = {};
	        datas.add(arr[0]);
	        
	        for(int i = 0; i < arr.length; i++){
	            if(datas.peek() != arr[i]){
	                datas.add(arr[i]);
	            }
	        }
	        answer = new int[datas.size()];
	        for(int i = 0; i < answer.length; i++){
	            answer[answer.length - (i + 1)] = datas.pop();
	        }
	        return answer;
	    }
}
