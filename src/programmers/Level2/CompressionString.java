package programmers.Level2;

public class CompressionString {
	/**
	 * 문자열을 압축하여 가장 짧게 압축한 경우의 길이 출력
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param s
	 * @return
	 */
	public int solution(String s) {
		int len = s.length();
		int min = len;
		int count = 1;
		
		for(int i = 1; i <= len / 2; i++) {//i는 패턴의 갯수
			int pressLen = len;
			for(int j = 0; (j + 2) * i <= len; j++) {//j는 패턴 검사를 위한 커서
				if(s.substring(j * i, (j + 1) * i).equals(s.substring((j + 1) * i, (j + 2) * i))){
					pressLen -= i;
					count++;
				}else {
					if(count > 1) {
						pressLen += (int)Math.log10(count) + 1;
						count = 1;
					}
				}
			}
			if(count > 1) {
				pressLen += (int)Math.log10(count) + 1;
				count = 1;
			}
			min = min > pressLen ? pressLen : min; 
		}
		
		return min;
	}
}
