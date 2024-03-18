package array;

import java.util.Arrays;

public class TriangleSnail {
	public static void main(String[] args) {
		TriangleSnail triangleSnail = new TriangleSnail();
		int n = 5;
		
		System.out.println(Arrays.toString(triangleSnail.solution(n)));
		
	}

	public int[] solution(int n) {
		int[] answer = {};
		int index = 0;

		int[][] triangle = new int[n][n];
//		들어가는 숫자 
		int data = 1;
		int x = 0;
		int y = 0;

		while (true) {

//			아래로 이동
			while (true) {
				triangle[y][x] = data++;
				if (y + 1 == n || triangle[y + 1][x] != 0)
					break;
				y += 1;

			}

//			오른쪽 이동
			while (true) {
				triangle[y][x] = data++;
				if (x + 1 == n || triangle[y][x + 1] != 0) break;
				x += 1;
			}
			
//			왼쪽위로 이동
			while(true) {
				triangle[y][x] = data++;
				if(triangle[y - 1][x - 1] != 0) break;
				x -= 1;
				y -= 1;
			}
			
			if(y + 1 == n || triangle[y + 1][x] != 0) break;
			y += 1;
		}

		answer = new int[data - 1];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				answer[index++] = triangle[i][j];
			}
		}
		
		return answer;
	}
}
