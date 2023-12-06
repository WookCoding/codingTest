package level2;

public class CodingTest4 {
	public static void main(String[] args) {
		
		CodingTest4 test = new CodingTest4();
		
		int a = 15;
		int b = 20; 
		
		System.out.println(test.solution(b));
//		2 + 3 + 4 + 5 + 6  = 20;
//		
	}
	
	public int solution(int n) {
		int answer = 1;
		int data = 1;
		
		while (data < n) {
			int sum = 0;
			int repeatData = data;
			
			for(int i = 0; sum < n; i++) {
				sum += repeatData;
				
				if(n == sum) {
					answer += 1;
					sum = 0;
					break;
				}
				repeatData++;
			}
			
			data++;
		}
		
		return answer;
	}
}
