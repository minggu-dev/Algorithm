package programmers.Level2;

import java.util.Arrays;

public class SaveBoat {
	/**
	 * 구명보트로 사람을 최소한 왕복하여 구하라(최대 2명 탑승)
	 * 출처 : https://programmser.co.kr/learn/challenges
	 * @param people
	 * @param limit
	 * @return
	 */
	public int solution(int[] people, int limit) {
		int answer = 0;
		int start = 0;
		int end = people.length - 1;
		Arrays.sort(people);
		while(start <= end) {
			if(people[end] + people[start] <= limit) {
				start++;
			}
			end--;
			answer++;
		}
		return answer;
	}
}
