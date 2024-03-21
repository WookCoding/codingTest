package recursive;

import java.util.Arrays;

//	쿼드압축 후 개수 세기 --- level 2
public class CountingQuadCompression {
//	실행
	public static void main(String[] args) {
		CountingQuadCompression compression = new CountingQuadCompression();
		
		
		int[][] arr1 = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		int[][] arr2 = {{1,1,1,1,1,1,1,1}, {0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
		
		
//		예상 출력 : [4, 9]
		System.out.println(Arrays.toString(compression.solution(arr1)));
		
//		예상 출력 : [10, 15]
		System.out.println(Arrays.toString(compression.solution(arr2)));
	}
	
	
	private class Count{
		private final int zeros;
		private final int ones;
		
		private Count(int zeros, int ones) {
			this.ones = ones;
			this.zeros = zeros;
		}
		
		public Count add(Count other) {
			return new Count(zeros + other.zeros, ones + other.ones);
		}
	}
	
	private Count count(int offsetX, int offsetY, int size, int[][] arr) {
		int h = size / 2;
		for(int x = offsetX; x < offsetX + size; x++) {
			for (int y = offsetY; y < offsetY + size; y++) {
				if(arr[y][x] != arr[offsetY][offsetX] ) {
					return count(offsetX, offsetY, h, arr)
							.add(count(offsetX + h, offsetY, h, arr))
							.add(count(offsetX, offsetY + h, h, arr))
							.add(count(offsetX + h, offsetY + h, h, arr));
												
				}
				
			}
		}
		if(arr[offsetY][offsetX] == 1) {
			return new Count(0, 1);
		}
		
		return new Count(1, 0);
	}
	
//	구현
	private int[] solution(int[][] arr) {
		Count count = count(0, 0, arr.length, arr); 
		
		return new int[] {count.zeros, count.ones};
	}	
	
}
