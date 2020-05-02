package programmers.Level2;

import java.util.Stack;

public class PipeDivisor {
	/**
	 * 쇠막대기 여러개를 한 번에 자르는 작업을 ()로 표현하여 총 몇 개의 분리된 쇠막대기가 나오는지 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param arrangement
	 * @return
	 */
	public int solution(String arrangement) {
        int pipeStack = 0;
		int sum = 0;
		boolean isDivide = true;
		
		for(int i = 0; i < arrangement.length(); i++) {
			if(arrangement.charAt(i) == '(') {
				pipeStack++;
				isDivide = true;
			}else if(arrangement.charAt(i) == ')') {
				pipeStack--;
				sum++;
				if(isDivide) {
					sum += pipeStack - 1;
					isDivide = false;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		PipeDivisor pd = new PipeDivisor();
		System.out.println(pd.solution("()(((()())(())()))(())"));
	}
}
