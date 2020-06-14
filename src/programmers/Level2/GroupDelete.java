package programmers.Level2;

public class GroupDelete {
	/**
	 * 같은 문자 2개가 붙어있으면 제거하여 최종적으로 모든 문자열이 제거되면 1을, 아니면 0을 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int solution(String s){
        int answer = 0;
        int len = s.length();
        char ch = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) {
        	ch = s.charAt(i);
        	if(sb.length() == 0) {
        		sb.append(ch);
        	}else if(sb.charAt(sb.length() - 1) == ch) {
        		sb.deleteCharAt(sb.length() - 1);
        	}else {
        		sb.append(ch);
        	}
        }
        if(sb.length() == 0) {
        	answer = 1;
        }
        return answer;
    }
}
