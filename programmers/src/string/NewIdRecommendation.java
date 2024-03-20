package string;

//	�ű� ���̵� ��õ ----- level 1
public class NewIdRecommendation {
//	����
	public static void main(String[] args) {
		String s1 = "...!@BaT#*..y/abcdefgijklm";
		String s2 = "z-+.^.";
		String s3 = "=.=";
		String s4 = "123_.def";
		String s5 = "abcdefghijklmn.p";

//		���� ��� : "bat.y.abcdefghi"
		System.out.println(solution(s1));

//		���� ��� : "z--"
		System.out.println(solution(s2));

//		���� ��� : "aaa"
		System.out.println(solution(s3));

//		���� ��� : "123_def"
		System.out.println(solution(s4));

//		���� ��� : "abcdefghijklmn"
		System.out.println(solution(s5));

	}

//	����
	private static String solution(String newId) {
//		1�ܰ� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ
		newId = newId.toLowerCase();
		
//		2�ܰ� �ҹ���, ����, ����,����,��ħǥ�� ������ ��� ���ڸ� ����
		newId = newId.replaceAll("[^a-z0-9\\-_.]", "");
		
//		3�ܰ� ��ħǥ�� 2���̻� ���ӵ� �κ��� �ϳ��� ��ħǥ�� ġȯ
		newId = newId.replaceAll("\\.+",".");
		
//		4�ܰ� ��ħǥ�� ó���̳� ���� ��ġ�Ѵٸ� ����
		newId = newId.replaceAll("^\\.+|\\.+$", "");
		
//		5�ܰ� �� ���ڿ��̶�� "a"�� ����
		if(newId.isEmpty()) newId = "a";
		
//		6�ܰ� ���̰� 16�� �̻��̸� ù 15���� ���ڸ� ������ ���ڸ� ���� ���� ������ ���� ��ħǥ�� ��ġ�Ѵٸ� ����
		if(newId.length() >= 16) {
			newId = newId.substring(0, 15);
			newId = newId.replaceAll("\\.+$", "");
		}
//		7�ܰ� ���̰� 2�� ���϶��, ������ ���ڸ� new_id�� ���̰� 3�� �ɶ����� �ݺ��ؼ� ���� ���δ�.
		while(newId.length() < 3) {
			newId += newId.charAt(newId.length() - 1);
		}
		
		return newId;
	}
}
