package programmers.Level2;

public class ChangeParentheses {
	/**
	 * 괄호를 입력 받아 제대로 닫혀진 상태가 되도록 한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param p
	 * @return
	 */
	public String solution(String p) {
        String answer = change(p);
        return answer;
    }
	
	public String change(String full) {
		int count = 0;
		String before = null;
		String after = null;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < full.length(); i++) {
			if(full.charAt(i) == '(') {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				before = full.substring(0, i + 1);
				after = full.substring(i + 1);
				break;
			}
		}
		if(before.charAt(0) == ')') {
			sb.append('(');
			if(!after.equals("") && after != null) {
				sb.append(change(after));
			}
			sb.append(')');
			for(int i = 1; i < before.length() - 1; i++) {
				sb.append(before.charAt(i) == '(' ? ')' : '(');
			}
		}else {
			sb.append(before);
			if(!after.equals("") && after != null) {
				sb.append(change(after));
			}
		}
		
		return sb.toString();
	}
}
