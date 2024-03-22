package level1;


// ����� ������ ���� ----- level 1
//���� ����
//�� ���� left�� right�� �Ű������� �־����ϴ�. 
//left���� right������ ��� ���� �߿���, ����� ������ ¦���� ���� ���ϰ�, 
//����� ������ Ȧ���� ���� �� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
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
