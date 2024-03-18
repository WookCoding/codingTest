package level1;

public class CodingTest14 {
	public static void main(String[] args) {
		CodingTest14 c = new CodingTest14();
		String s = " a B z";
		int n = 4;

		System.out.println(c.solution(s, n));

	}

	public String solution(String s, int n) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char data = s.charAt(i) ;

			if (data == ' ') {
				builder.append(' ');
				continue;
			}

			if (data == 'z' || 'Z' == data ) {
				data = (char) (data - 26 + n);
			}else if(i != 0){
				data = (char)(data + n);
			}

			builder.append(data);
		}
		
		return builder.toString().trim();
	}
}