package programmers.Level2;

public class TargetNumber {
	/**
	 * numbers의 수를 자유롭게 더하고 빼면서 target을 맞추어라
	 * 출처 : https://programmers.co.kr/learn/challenges 
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int solution(int[] numbers, int target) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return targetNum(numbers, 0, 0, (sum - target) / 2);
	}
	public int targetNum(int[] numbers, int count, int cursor, int gap) {
		for(int i = cursor; i < numbers.length; i++) {
			if((gap - numbers[i]) > 0) {
				count = targetNum(numbers, count, i + 1, gap - numbers[i]);
			}else if(gap - numbers[i] == 0) {
				count++;
			}
		}
		return count;
	}
}
