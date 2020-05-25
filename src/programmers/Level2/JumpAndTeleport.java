package programmers.Level2;

public class JumpAndTeleport {
	/**
	 * 점프와 순간이동을 이용해서 n만큼의 칸을 이동을 하려한다. 점프를 하면 점프한 수만큼 이동하고 그만큼 에너지가 소비되고 순간이동을 하면 현재위치 * 2위치로 이동하며 
	 * 에너지 소비가 없을 때 가장 적은 에너지로 n만큼 이동하도록 한다.
	 * https://programmers.co.kr/learn/challenges
	 */
	public int solution(int n) {
		int answer = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				n -= 1;
				answer++;
			} else {
				n /= 2;
			}
		}
		return answer;
	}
}
