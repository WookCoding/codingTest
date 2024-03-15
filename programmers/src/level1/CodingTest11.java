package level1;

public class CodingTest11 {
	public static void main(String[] args) {
		CodingTest11 c = new CodingTest11();
		
		System.out.println(c.solution(3, 2, 20));
	}
	
    public int solution(int a, int b, int n) {
        int storage = 0;
        int bottle = 0;
        
        while(n >= a){
        	storage = 0;
        	
            bottle += b * (n / a);
            if(n % a != 0) {
            	storage += n % a;	
            }
            
            n = (n / a) * b + storage;
            System.out.println(n);
        }
        
        return bottle;
    }
}
