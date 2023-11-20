package codingTest;

public class CodingTest1 {
	public static void main(String[] args) {
		String s = "3people unFollowed me ";	
        String answer = ""; 
        String[] data = s.split(" ");       
        
        for(int i = 0; i < data.length; i++){
            String StringData = data[i];
            
            if(StringData.length() == 0) {
            	answer += " ";
            }else {
            	answer += StringData.substring(0, 1).toUpperCase();
            	answer += StringData.substring(1, StringData.length()).toLowerCase();
            	answer += " ";
            }
        }
        
        if(s.substring(s.length() - 1, s.length()).equals(" ")) {
        	System.out.println(answer);
        }
        
        System.out.println(answer.substring(0, answer.length() - 1));
	}
}
