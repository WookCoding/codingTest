package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//���� ����
//Ax + By + C = 0���� ǥ���� �� �ִ� n���� ������ �־��� ��, �� ������ ���� �� ���� ��ǥ�� ���� �׸��� �մϴ�.
//
//���� ���, ������ ���� ���� 5����
//
//2x - y + 4 = 0
//-2x - y + 4 = 0
//-y + 1 = 0
//5x - 8y - 12 = 0
//5x + 8y + 12 = 0
//��ǥ ��� ���� �׸��� �Ʒ� �׸��� �����ϴ�.
//
//RisingStarGraphBox.jpg
//
//�̶�, ��� ������ ��ǥ�� (4, 1), (4, -4), (-4, -4), (-4, 1), (0, 4), (1.5, 1.0), (2.1, -0.19), (0, -1.5), (-2.1, -0.19), (-1.5, 1.0)�Դϴ�. �� �� �����θ� ǥ���Ǵ� ��ǥ�� (4, 1), (4, -4), (-4, -4), (-4, 1), (0, 4)�Դϴ�.
//
//���� ������ ǥ���Ǵ� ������ ���� �׸��� ������ �����ϴ�.
//
//RisingStarGraphStar.jpg
//
//���� �׸��� ���ڿ��� ��Ÿ�� ��, ���� �׷��� �κ��� *, �� ����(���ڼ��� �����ϴ� ����)�� .���� ǥ���ϸ� ������ �����ϴ�.
//
//"..........."  
//".....*....."  
//"..........."  
//"..........."  
//".*.......*."  
//"..........."  
//"..........."  
//"..........."  
//"..........."  
//".*.......*."  
//"..........."  
//�̶� �������� ������ ������ ��� ���� �����ϴ� �ּ����� ũ�⸸ ��Ÿ���� �˴ϴ�.
//
//���� ������
//
//"....*...."  
//"........."  
//"........."  
//"*.......*"  
//"........."  
//"........."  
//"........."  
//"........."  
//"*.......*"  
//�Դϴ�.
//
//���� A, B, C�� ���� ������ ��� �迭 line�� �Ű������� �־����ϴ�. �̶� ��� ���� �����ϴ� �ּ� �簢���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
//
//���ѻ���
//line�� ����(��) ���̴� 2 �̻� 1,000 ������ �ڿ����Դϴ�.
//line�� ����(��) ���̴� 3�Դϴ�.
//line�� �� ���Ҵ� [A, B, C] �����Դϴ�.
//A, B, C�� -100,000 �̻� 100,000 ������ �����Դϴ�.
//������ ���� ������ ����� ���� ���� �־����� �ʽ��ϴ�.
//A = 0�̸鼭 B = 0�� ���� �־����� �ʽ��ϴ�.
//������ 1,000 * 1,000 ũ�� �̳����� ǥ���˴ϴ�.
//���� �� �� �̻� �׷����� �Է¸� �־����ϴ�.
//����� ��
//line	result
//[[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]]	["....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"]
//[[0, 1, -1], [1, 0, -1], [1, 0, 1]]	["*.*"]
//[[1, -1, 0], [2, -1, 0]]	["*"]
//[[1, -1, 0], [2, -1, 0], [4, -1, 0]]	["*"]
//����� �� ����
//����� �� #1
//
//���� ���ÿ� �����ϴ�.
//
//����� �� #2
//
//���� y = 1, x = 1, x = -1�� ������ �����ϴ�.
//RisingStarGraphTC2.png
//
//(-1, 1), (1, 1) ���� ������ �߻��մϴ�.
//
//���� ������
//
//"*.*"  
//�Դϴ�.
//
//����� �� #3
//
//���� y = x, y = 2x�� ������ �����ϴ�.
//
//RisingStarGraphTC3.png
//
//(0, 0) ���� ������ �߻��մϴ�.
//
//���� ������
//
//"*"  
//�Դϴ�.
//
//����� �� #4
//
//���� y = x, y = 2x, y = 4x�� ������ �����ϴ�.
//
//RisingStarGraphTC4.png
//
//(0, 0) ���� ������ �߻��մϴ�.
//
//���� ������
//
//"*"
//�Դϴ�.
//
//���� ����
//Ax + By + E = 0
//Cx + Dy + F = 0
//�� ������ ������ �����ϰ� ������ ���, �� ������ ������ �����ϴ�.
//
//RisingStarExpression.png
//
//��, AD - BC = 0�� ��� �� ������ ���� �Ǵ� ��ġ�մϴ�.
public class Array {
	private static class Point {
		public final long x, y;
		
		private Point(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}
	
//	��ǥ ���ϴ� ����
//	Ax + By + E = 0
//	Cx + Dy + F = 0
//	 x = (BF - EF) / (AD - BC);
//	 y = (EC - AF) / (AD - BC);
	private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
		
		double x = (double) (b1 * c2 - b2* c1) / (a1 * b2 - a2 * b1);
		double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - b1 * a2);

		if(x % 1 != 0 || y % 1 != 0) return null;
		
		return new Point((long) x, (long) y);
	}

	
	private Point getMaximumPoint(List<Point> points) {
		long x = Long.MIN_VALUE;
		long y = Long.MIN_VALUE;
		
		for (Point point : points) {
			if(point.x < x) x = point.x;
			if(point.y < y) y = point.y;
		}
		
		return new Point(x, y);
	}
	
	private Point getMinimumPoint(List<Point> points) {
		long x = Long.MAX_VALUE;
		long y = Long.MAX_VALUE;
		
		for (Point point : points) {
			if(point.x > x) x = point.x;
			if(point.y > y) y = point.y;
		}
		
		return new Point(x, y);
	}
	
    public String[] solution(int[][] line) {
    	List<Point> points = new ArrayList<Point>();
    	
    	for (int i = 0; i < line.length; i++) {
			for (int j = 0; j < line[i].length; j++) {
				Point intersection = intersection(line[i][0], line[i][1], line[i][2],
						line[j][0], line[j][1], line[j][2]);
				
				if(intersection != null) {
					points.add(intersection);
				}
			}
		}
    	
    	Point minmum = getMinimumPoint(points);
    	Point maxmum = getMaximumPoint(points);
    	
    	int width = (int)(maxmum.x - minmum.x + 1 );
    	int height = (int)(maxmum.y - minmum.y + 1);
    	char[][] arr = new char[height][width];
    	
    	for (char[] row : arr) {
    		Arrays.fill(row, '.');
		}
    	
    	for (Point point : points) {
			int x = (int) (point.x - minmum.x);
			int y = (int) (maxmum.y - point.y);
			arr[y][x] = '*';
		}
    	
    	String[] result = new String[arr.length];

    	for (int i = 0; i < result.length; i++) {
			result[i] = new String(arr[i]);
		}
    	
    	return result;
    }
	
    
    public static void main(String[] args) {
		Array array = new Array();
		int[][] datas = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12},{5, 8, 12}};
		String[] result = array.solution(datas);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	} 
    
}

