package programmers.Level2;

public class NextBigNumber {
	/**
	 * n보다 큰 수 중 이진법으로 변환했을 때 1의 갯수가 동일한 가장 작은 수를 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int n) {
		int answer = 2;
		String binary = Integer.toBinaryString(n);
		char[] chArr = binary.toCharArray();
		boolean check = chArr[chArr.length - 1] == '0' ? true : false;
		for(int i = chArr.length - 1; i > 0; i--) {
			if(chArr[i - 1] == '0' && chArr[i] == '1') {
				if(check && chArr[i + 1] == '1') {
					answer = n + (int)Math.pow(2, chArr.length - i - 1) - (int)Math.pow(2, chArr.length - i - 2) + 1;
				}else {
					answer = n + (int)Math.pow(2, chArr.length - i - 1);
				}
				System.out.println(answer);
				break;
			}
			if(i == 1) {
				if(check && chArr[i] == '1') {
					answer = n + (int)Math.pow(2, chArr.length - 1) - (int)Math.pow(2, chArr.length - 2) + 1;
				}else {
					answer = n + (int)Math.pow(2, chArr.length - 1);
				}
			}
		}
		return answer;
	}
}
