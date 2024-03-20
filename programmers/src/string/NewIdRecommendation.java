package string;

//	신규 아이디 추천 ----- level 1
public class NewIdRecommendation {
//	실행
	public static void main(String[] args) {
		String s1 = "...!@BaT#*..y/abcdefgijklm";
		String s2 = "z-+.^.";
		String s3 = "=.=";
		String s4 = "123_.def";
		String s5 = "abcdefghijklmn.p";

//		예상 출력 : "bat.y.abcdefghi"
		System.out.println(solution(s1));

//		예상 출력 : "z--"
		System.out.println(solution(s2));

//		예상 출력 : "aaa"
		System.out.println(solution(s3));

//		예상 출력 : "123_def"
		System.out.println(solution(s4));

//		예상 출력 : "abcdefghijklmn"
		System.out.println(solution(s5));

	}

//	구현
	private static String solution(String newId) {
//		1단계 모든 대문자를 대응되는 소문자로 치환
		newId = newId.toLowerCase();
		
//		2단계 소문자, 숫자, 빼기,밑줄,마침표를 제외한 모든 문자를 제거
		newId = newId.replaceAll("[^a-z0-9\\-_.]", "");
		
//		3단계 마침표가 2번이상 연속된 부분을 하나의 마침표로 치환
		newId = newId.replaceAll("\\.+",".");
		
//		4단계 마침표가 처음이나 끝에 위치한다면 제거
		newId = newId.replaceAll("^\\.+|\\.+$", "");
		
//		5단계 빈 문자열이라면 "a"를 대입
		if(newId.isEmpty()) newId = "a";
		
//		6단계 길이가 16자 이상이면 첫 15개의 문자를 제외한 문자를 제거 만약 제거후 끝에 마침표가 위치한다면 제거
		if(newId.length() >= 16) {
			newId = newId.substring(0, 15);
			newId = newId.replaceAll("\\.+$", "");
		}
//		7단계 길이가 2자 이하라면, 마지막 문자를 new_id의 길이가 3이 될때까지 반복해서 끝에 붙인다.
		while(newId.length() < 3) {
			newId += newId.charAt(newId.length() - 1);
		}
		
		return newId;
	}
}
