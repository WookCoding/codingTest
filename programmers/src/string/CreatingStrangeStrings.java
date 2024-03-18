package string;

//�̻��� ���ڿ� ����� -- level 1
public class CreatingStrangeStrings {
//	����
	public static void main(String[] args) {
		CreatingStrangeStrings creatingStrangeStrings = new CreatingStrangeStrings();
		String s = "try hello world";

		System.out.println(creatingStrangeStrings.solution(s));

	}

//	����
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
