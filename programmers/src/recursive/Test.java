package recursive;

public class Test {
//	�׽�Ʈ
//	���� : 		(n, m): n^m
	
//	���� ���� : 	(n, 0) = 1
//				(0, m) = 1
//				(1, m) = 1
//	
//	��ȭ�� :		(n, m) = n*(n, m -1)
	private static int power(int n, int m) {
//		���� ����
		if ( m == 0 ) return 1;
		if ( n == 1 ) return 1;
		if ( n == 0 ) return 1;
		
//		��ȭ�� ����
		return n * power(n, m - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(power(3, 5));
	}
	
}
