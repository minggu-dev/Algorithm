package programmers.Level2;

public class CorrectParentheses {
	/**
	 * 괄호가 열고 닫혀지는 쌍이 올바르게 짝지어진 올바른 괄호인 상태일 경우 true를 아닐경우 false를 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	boolean solution(String s) {
		boolean answer = false;
		int check = 0;
		char[] chrArr = s.toCharArray();
		for(char ch : chrArr) {
			if(ch == '(') {
				check++;
			}else {
				check--;
			}
			if(check < 0) {
				return answer;
			}
		}
		if(check == 0) {
			answer = true;
		}
		return answer;
	}
}
