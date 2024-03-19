package integer;

// 3진법 뒤집기 -- level 1
public class FlipBase3 {
//	실행
	public static void main(String[] args) {
		FlipBase3 base3 = new FlipBase3();
		
		int n1 = 45;
		int n2 = 125;
		
//		예상 출력 : 7
		System.out.println(base3.solution(n1));
//		예상 출력 : 229
		System.out.println(base3.solution(n2));
	}
//	구현
	public int solution(int n) {
		String data = Integer.toString(n, 3);
		String reverse = new StringBuilder(data).reverse().toString();
		return Integer.parseInt(reverse, 3);
	}
}
