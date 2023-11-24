package codingTest;

import java.util.ArrayList;
import java.util.HashMap;

public class CodingTest6 {
//	���� ����
//	1���� n���� ��ȣ�� �پ��ִ� n���� ����� ���� �����ձ⸦ �ϰ� �ֽ��ϴ�. ���� �����ձ�� ������ ���� ��Ģ���� ����˴ϴ�.
//
//	1������ ��ȣ ������� �� ����� ���ʴ�� �ܾ ���մϴ�.
//	������ ����� �ܾ ���� �������� �ٽ� 1������ �����մϴ�.
//	�ջ���� ���� �ܾ��� ������ ���ڷ� �����ϴ� �ܾ ���ؾ� �մϴ�.
//	������ �����ߴ� �ܾ�� ����� �� �����ϴ�.
//	�� ������ �ܾ�� �������� �ʽ��ϴ�.
//	������ 3���� �����ձ⸦ �ϴ� ��Ȳ�� ��Ÿ���ϴ�.
//
//	tank �� kick �� know �� wheel �� land �� dream �� mother �� robot �� tank
//
//	�� �����ձ�� ������ ���� ����˴ϴ�.
//
//	1�� ����� �ڽ��� ù ��° ���ʿ� tank�� ���մϴ�.
//	2�� ����� �ڽ��� ù ��° ���ʿ� kick�� ���մϴ�.
//	3�� ����� �ڽ��� ù ��° ���ʿ� know�� ���մϴ�.
//	1�� ����� �ڽ��� �� ��° ���ʿ� wheel�� ���մϴ�.
//	(��� ����)
//	�����ձ⸦ ��� ������ ������ ����, 3�� ����� �ڽ��� �� ��° ���ʿ� ���� tank ��� �ܾ�� ������ �����ߴ� �ܾ��̹Ƿ� Ż���ϰ� �˴ϴ�.
//
//	����� �� n�� ������� ������� ���� �ܾ� words �� �Ű������� �־��� ��, ���� ���� Ż���ϴ� ����� ��ȣ�� �� ����� �ڽ��� �� ��° ���ʿ� 
//	Ż���ϴ����� ���ؼ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
//
//	���� ����
//	�����ձ⿡ �����ϴ� ����� �� n�� 2 �̻� 10 ������ �ڿ����Դϴ�.
//	words�� �����ձ⿡ ����� �ܾ���� ������� ����ִ� �迭�̸�, ���̴� n �̻� 100 �����Դϴ�.
//	�ܾ��� ���̴� 2 �̻� 50 �����Դϴ�.
//	��� �ܾ�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
//	�����ձ⿡ ���Ǵ� �ܾ��� ��(�ǹ�)�� �Ű� ���� �����ŵ� �˴ϴ�.
//	������ [ ��ȣ, ���� ] ���·� return ���ּ���.
//	���� �־��� �ܾ��� Ż���ڰ� ������ �ʴ´ٸ�, [0, 0]�� return ���ּ���.

//	����� ��
//	n					words						result
//	3	["tank", "kick", "know", "wheel", "land", 
//		"dream", "mother", "robot", "tank"]			[3,3]

//	5	["hello", "observe", "effect", "take", 
//		"either", "recognize", "encourage", 
//		"ensure", "establish", "hang", "gather",	[0,0]
//		"refer", "reference", "estimate", 
//		"executive"]						

//	2	["hello", "one", "even", "never", 
//		"now", "world", "draw"]						[1,3]

	public static void main(String[] args) {
		int nTest1 = 3;
		int nTest2 = 5;
		int nTest3 = 2;
		
		String[] wordsTest1 =  {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		String[] wordsTest2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		String[] wordsTest3 = {"hello", "one", "even", "never", "now", "world", "draw"};

		CodingTest6 solution = new CodingTest6();
//		���� ����
		
		int[] answer = solution.solution(nTest1, wordsTest1);
		System.out.println("[" + answer[0]+" " + answer[1] + "]");
	}

	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		int number = 0;
		int count = 1;
		boolean check = true;
		ArrayList<String> arData = new ArrayList<String>();
		
		for (int i = 0; i < words.length; i++) {
			number = (i + 1) % n == 0 ? n : (i + 1) % n;

			
			if(arData.size() != 0) {
				if(arData.get(arData.size() -1).charAt(arData.get(arData.size() -1 ).length() - 1) != words[i].charAt(0)) {
					check = false;
					break;
				}
			}
			
			if(arData.contains(words[i])) {
				check = false;
				break;
			}else {
				arData.add(words[i]);
				count++;
			}
			
		}
        answer[0] = number;
        answer[1] = count % n != 0 ? count / n + 1 : count / n;
		return answer;
	}
}
