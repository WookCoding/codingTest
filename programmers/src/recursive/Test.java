package recursive;

public class Test {
//	테스트
//	상태 : 		(n, m): n^m
	
//	종료 조건 : 	(n, 0) = 1
//				(0, m) = 1
//				(1, m) = 1
//	
//	점화식 :		(n, m) = n*(n, m -1)
	private static int power(int n, int m) {
//		종료 조건
		if ( m == 0 ) return 1;
		if ( n == 1 ) return 1;
		if ( n == 0 ) return 1;
		
//		점화식 구현
		return n * power(n, m - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(power(3, 5));
	}
	
}
