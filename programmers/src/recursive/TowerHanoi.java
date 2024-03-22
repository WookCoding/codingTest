package recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//�ϳ����� ž level----- 3
public class TowerHanoi {
//	����
	public static void main(String[] args) {
		TowerHanoi hanoi = new TowerHanoi();
		int n1 = 2;

		int[][] datas = hanoi.solution(n1);
		
		for (int i = 0; i < datas.length; i++) {
			System.out.println(Arrays.toString(datas[i]));
		}
	}
	
//	����
	public int[][] solution(int n) {
//	�ϳ��� ž�� ������ ����� ���� ���� 1, 2 , 3��
//	1������ n���� ����
//	3�� �������� �ּ� Ƚ���� �ű��
//	ū ������ ���� ���� ���� �վ�� �ȵ�
//	�ѹ��� �ϳ��� ���Ǹ� �ű� �� ����
//		���� , ���� ����, ��ȭ��
//		���� : from =  ������ ���� ��ġ�� ���
//				n =  �ű���� ������ ����
//				to = ������ �̵��ؾ��ϴ� ���
//			(from, to , n)
		
//		���� ���� : (1, from , to) = [[from, to]]
//		��ȭ�� : (n, from , to) = (n - 1, from, empty) + (1, from, to) + (n - 1, empty, to)
//				��, empty = 6 - from - to
		List<int[]> datas = new ArrayList<int[]>();
		hanoi(n, 1, 3, datas);
		return datas.toArray(new int[0][]);
		
//		return hanoi(n, 1, 3).toArray(new int[0][]);
	}
	
//	private List<int[]> hanoi(int n, int from, int to, List<int[]> datas) {
	private void hanoi(int n, int from, int to, List<int[]> datas) {
//		if(n == 1) return List.of(new int[] {from, to});
		if(n == 1) {
			datas.add(new int[] {from, to});
			return;
		}
		
		int empty = 6 - from - to;
		
//		List<int[]> result = new ArrayList<int[]>();
//		result.addAll(hanoi(n -1 , from, empty));
//		result.addAll(hanoi(1, from, to));
//		result.addAll(hanoi(n -1 , empty, to));
		
		hanoi(n -1 , from, empty, datas);
		hanoi(1, from, to, datas);
		hanoi(n -1 , empty, to, datas);
	}
	
}
