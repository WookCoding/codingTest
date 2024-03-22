package level1;


// 약수의 개수와 덧셈 ----- level 1
//문제 설명
//두 정수 left와 right가 매개변수로 주어집니다. 
//left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
//약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
public class CodingTest15 {
	public static void main(String[] args) {
		CodingTest15 codingTest15 = new CodingTest15();
		
		System.out.println(codingTest15.solution(13, 17));
		
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
