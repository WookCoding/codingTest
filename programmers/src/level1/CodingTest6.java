package level1;

public class CodingTest6 {
	
//	자연수 뒤집어 배열로 만들기
//	문제 설명
//	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//	제한 조건
//	n은 10,000,000,000이하인 자연수입니다.
//	입출력 예
//	n	return
//	12345	[5,4,3,2,1]
	
	public static void main(String[] args) {
		CodingTest6 solution = new CodingTest6();
		long n = 12345;
		int[] data = solution.solution(n);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("결과값 : " + data[i]);
		}
	}
	
	private int[] solution(long n) {
		String[] data = (n+"").split("");
		int[] answer = new int[data.length];
		
		for (int i = 0; i < data.length; i++) {
			answer[i] = Integer.parseInt(data[data.length - (i + 1)]);
		}
		
		return answer;
	}
}
