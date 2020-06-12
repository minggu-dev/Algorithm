package programmers.Level3;

public class HanoiTop {
	/**
	 * 하노이탑에서 1번째 기둥에서 3번째 기둥으로 옮기는 과정을 반환
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int[][] solution(int n) {
		int[][] answer = new int[(int)Math.pow(2, n) - 1][2];
		move(3, n, 1, 0, answer);
		return answer;
	}
	public int move(int next, int n, int cur, int count, int[][] answer) {
		if(n != 1) {
			count = move(6 - next - cur, n - 1, cur, count, answer);
			answer[count][0] = cur;
			answer[count++][1] = next;
			count = move(next, n - 1, 6 - next - cur, count, answer);
		}else {
			answer[count][0] = cur;
			answer[count++][1] = next;
		}
		return count;
	}
}
