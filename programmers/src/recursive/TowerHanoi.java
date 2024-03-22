package recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//하노이의 탑 level----- 3
public class TowerHanoi {
//	실행
	public static void main(String[] args) {
		TowerHanoi hanoi = new TowerHanoi();
		int n1 = 2;

		int[][] datas = hanoi.solution(n1);
		
		for (int i = 0; i < datas.length; i++) {
			System.out.println(Arrays.toString(datas[i]));
		}
	}
	
//	구현
	public int[][] solution(int n) {
//	하노이 탑의 세개의 기둥을 왼쪽 부터 1, 2 , 3번
//	1번에는 n개의 원판
//	3번 원판으로 최소 횟수로 옮기기
//	큰 원판이 작은 원판 위에 잇어서는 안됨
//	한번에 하나의 원판만 옮길 수 잇음
//		상태 , 종료 조건, 점화식
//		상태 : from =  원판이 현재 위치한 기둥
//				n =  옮기려는 원판의 개수
//				to = 원판이 이동해야하는 기둥
//			(from, to , n)
		
//		종료 조건 : (1, from , to) = [[from, to]]
//		점화식 : (n, from , to) = (n - 1, from, empty) + (1, from, to) + (n - 1, empty, to)
//				단, empty = 6 - from - to
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
