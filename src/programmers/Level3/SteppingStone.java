package programmers.Level3;

import java.util.*;
import java.util.stream.IntStream;

public class SteppingStone {
	/**
	 * 건널 수 있는 횟수가 제한된 발판들의 배열stones에서 한 번에 최대 k만큼 건너뛸 수 있을 때 가장 많은 사람이 건너는 방법
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[] stones, int k) {
		IntStream stream = null;
		int bridgeLife = 200000000;
		int perLife = 0;
		for (int i = 0; i < stones.length - k; i++) {
			stream = Arrays.stream(stones, i, i + k);
			perLife = stream.max().getAsInt();
			if (bridgeLife > perLife) {
				bridgeLife = perLife;
			}
		}
		return bridgeLife;
	}
}
