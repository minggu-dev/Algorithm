package programmers.Level2;

public class Country124 {
	/**
	 * 십진법의 숫자를 1,2,4로만 이루어진 숫자로 바꾸기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @return
	 */
	public String solution(int n) {
		char[] chrArr = {'1', '2', '4'};
		int num = 0;
		int len = 0;
		
		while(true) {
			num += Math.pow(3,++len);
			if(num >= n) {
				num -= Math.pow(3,len);
				len--;
				break;
			}
		}

		char[] answer = new char[len + 1];
		int temp = 0;
		int cur = 0;
		
		for(int i = len; i >= 0; i--) {
			temp = (int) Math.pow(3, i);
			for(int j=0; j<3; j++) {
				n -= temp;
				if(n <= num) {
					answer[cur++] = chrArr[j];
					num -= Math.pow(3,i);
					break;
				}
			}
		}
		
		return new String(answer);
	}
}
