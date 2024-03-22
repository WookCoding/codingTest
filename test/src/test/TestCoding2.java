package test;

public class TestCoding2 {
	public static void main(String[] args) {
		TestCoding2 coding2 = new TestCoding2();
		
		System.out.println(coding2.solution(13, 17));
	}
	
	public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int count = count(i);
            	
            if(count % 2 == 0){
                answer += i;
            }else {
            	answer -= i;
            }
        }
        return answer;
    }
    
    private int count(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        return count;
    }
}
