package programmers.Level2;

import java.util.*;

public class MoreSpicy {
	/**
	 * scoville배열의 값 중 k보다 작은 값들에 대해 가장 작은 값 + (두 번째로 작은 값)*2로 새로운 수를 만들어 가면서 모든 수가 k보다 클 수 있도록 한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param scoville
	 * @param K
	 * @return
	 */
	public int solution(int[] scoville, int K) {
		int answer = 0;
		int newSpicy = 0;
		boolean isSpicy = false;
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i : scoville) {
			if(i < K) {
				queue.offer(i);
			}else {
				break;
			}
		}
		while(queue.size() > 1) {
			newSpicy = queue.poll() + queue.poll() * 2;
			if(newSpicy < K) {
				queue.offer(newSpicy);
			}else {
				isSpicy = true;
			}
			answer++;
		}
		if(isSpicy) {
			return answer + queue.size();
		}
		return -1;
	}
}
