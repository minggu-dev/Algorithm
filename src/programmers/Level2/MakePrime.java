package programmers.Level2;

public class MakePrime {
	/**
	 * 주어진 nums에서 3개를 더하여 소수가 되는 경우의 수를 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	int answer = 0;
	public int solution(int[] nums) {
		sum(nums, 0, 1, 0);
		return answer;
	}
	public void sum(int[] nums, int sum, int depth, int cursor) {
		for(int i = cursor; i < nums.length - (3 - depth); i++) {
			if(depth == 3) {
				if(isPrime(sum + nums[i])) {
					answer++;
				}
			}else {
				sum(nums, sum + nums[i], depth + 1, i + 1);
			}
		}
	}
	public boolean isPrime(int sum) {
		for(int i = 2; i*i <= sum; i++) {
			if(sum % i == 0) {
				return false;
			}
		}
		return true;
	}
}
