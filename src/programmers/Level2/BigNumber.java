package programmers.Level2;

public class BigNumber {
	/**
	 * number에서 k만큼의 숫자를 뺏을 때 가장 큰 수를 만들기
	 * 출처 : https://programmes.co.kr/learn/challenges
	 * @param number
	 * @param k
	 * @return
	 */
	public String solution(String number, int k) {
		StringBuilder builder = new StringBuilder();
		char comp = number.charAt(0);
		int count = 0;
		int same = 1;
		int len = 0;
		int numLen = number.length();
		
		for(int i = 1; i < numLen; i++) {
			//뒤에가 더 큰경우
			if(comp < number.charAt(i)) {
				comp = number.charAt(i);
				len = builder.length();
				count += same;
				same = 1;
				
				for(int j = len - 1; j >= 0 && count < k; j--) {
					if(builder.charAt(j) < comp) {
						builder.deleteCharAt(j);
						count++;
					}else {
						break;
					}
				}
				
				if(count >= k) {
					builder.append(number.substring(i - (count - k)));
					break;
				}
			}else if(comp == number.charAt(i)) {
				same++;
				comp = number.charAt(i);
			}else {
				if(same > 1) {
					builder.append(number.substring(i - (same), i));
					same = 1;
				}else {
					builder.append(comp);
				}
				comp = number.charAt(i);
			}
		}
		if(count < k) {
			len = builder.length();
			builder.delete(len - (k - count - 1), len);
		}
		
		return builder.toString();
	}
	
	public static void main(String[] args) {
		BigNumber bn = new BigNumber();
		System.out.println(bn.solution("987654987", 6));
	}
}
