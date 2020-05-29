package programmers.Level3;

public class TileDecoration {
	/**
	 * 피보나치 수열 방식으로 정사각형을 이어 붙일 때 N개의 정사각형을 이어붙인 둘레의 길이를 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public long solution(int N) {
		long suf = 1;
		long pre = 1;
		long temp = 0;
		for(int i = 2; i <= N; i++) {
			temp = suf;
			suf = pre + suf;
			pre = temp;
		}
		return (suf + pre) * 2;
	}
}
