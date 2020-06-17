package programmers.Level2;

import java.util.Arrays;

public class FindMinimum {
	/**
	 * A,B배열의 각 원소들을 곱하여 가장 작은 수를 나오도록 하자
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[] A, int[] B) {
		int len = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int min = 0;
		
		for(int i = 0; i < len; i++) {
			min += A[i] * B[len - i - 1];
		}
		return min;
	}
}
