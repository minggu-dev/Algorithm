package programmers.Level2;

import java.util.HashSet;
import java.util.Set;

public class StrCatGame {
	/**
	 * 끝말잇기 게임에서 틀린사람의 경우를 리턴해주기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int[] solution(int n, String[] words) {
		int[] answer = { 0, 0 };
		Set<String> set = new HashSet<String>();
		set.add(words[0]);
		for (int i = 1; i < words.length; i++) {
			set.add(words[i]);
			if (set.size() != i + 1 || words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				break;
			}
		}
		return answer;
	}
}
