package programmers.Level2;

public class MaxAndMin {
	/**
	 * 주어진 문자열 s에서 최댓값과 최솟값을 찾아 하나의 문자열로 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public String solution(String s) {
		String[] answer = s.split(" ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int temp = 0;
		for(int i = 0; i < answer.length; i++) {
			temp = Integer.parseInt(answer[i]);
			max = max > temp ? max : temp;
			min = min < temp ? min : temp;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(min);
		sb.append(" ");
		sb.append(max);
		return sb.toString();
	}
}
