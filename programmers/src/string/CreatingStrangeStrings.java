package string;

//이상한 문자열 만들기 -- level 1
public class CreatingStrangeStrings {
//	실행
	public static void main(String[] args) {
		CreatingStrangeStrings creatingStrangeStrings = new CreatingStrangeStrings();
		String s = "try hello world";

		System.out.println(creatingStrangeStrings.solution(s));

	}

//	구현
	public String solution(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		char[] datas = s.toCharArray();
		boolean toUpper = true;

		for (char data : datas) {

			if (!Character.isAlphabetic(data)) {
				stringBuilder.append(data);
				toUpper = true;
			} else {
				if (toUpper) {
					stringBuilder.append(Character.toUpperCase(data));
					
				} else {
					stringBuilder.append(Character.toLowerCase(data));
				}
				toUpper = !toUpper;
			}

		}

		return stringBuilder.toString();
	}

}
