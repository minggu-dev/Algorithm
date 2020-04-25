package programmers.Level2;

public class NumberGame {
	/**
	 * n진법을 m명의 사람이 순서대로 한 자리씩 말하는 게임에서 p번째 사람의 t만큼의 경우의 수를 구하기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param n 진법
	 * @param t 경우의 수
	 * @param m 전체인원 수
	 * @param p p번째 사람
	 * @return
	 */
	public String solution(int n, int t, int m, int p) {
		char[] answer = new char[t];
		int cnt = 1;
		int cur = 0;
		String num = "0";
		for (int i = 0; cnt <= m * (t - 1) + p; i++) {
			for (int j = 0; j < num.length(); j++) {
				if (cnt++ == m * cur + p) {
					answer[cur++] = num.charAt(j);
					if (cur == answer.length) {
						break;
					}
				}
			}
			num = createNumber(n, i + 1);
		}
		return new String(answer);
	}

	public String createNumber(int n, int num) {
		char[] number = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		StringBuilder builder = new StringBuilder();
		while (num > 0) {
			builder.append(number[num % n]);
			num /= n;
		}
		return builder.reverse().toString();
	}
	/*
	public String solution(int n, int t, int m, int p) {
		char[] answer = new char[t];
		int cnt = 1;
		int cur = 0;
		String num = "0";
		for (int i = 0; cnt <= m * (t - 1) + p; i++) {
			for (int j = 0; j < num.length(); j++) {
				if (cnt++ == m * cur + p) {
					answer[cur++] = num.charAt(j);
					if (cur == answer.length) {
						break;
					}
				}
			}
			num = Integer.toString(i + 1, n).toUpperCase();
		}
		return new String(answer);
	}
	 */
}
