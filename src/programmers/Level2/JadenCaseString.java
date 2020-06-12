package programmers.Level2;

public class JadenCaseString {
	/**
	 * 모든 단어의 첫 글자가 대문자로 시작하고 나머진 소문자로 이루어진 JadenCase로 바꾸기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public String solution(String s) {
		int len = s.length();
		boolean isFirst = true;
		char ch = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len; i++) {
			ch = s.charAt(i);
			if(ch == ' ') {
				isFirst = true;
				sb.append(ch);
			}else if(isFirst){
				sb.append(Character.toUpperCase(ch));
				isFirst = false;
			}else {
				sb.append(Character.toLowerCase(ch));
			}
		}
		return sb.toString();
	}
}
