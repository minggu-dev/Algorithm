package programmers.Level2;

public class FibonacciNumber {
	/**
	 * n번째 피보나치 수를 1234567으로 나눈 나머지를 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int n) {
		int temp = 0;
		int num1 = 1;
		int num2 = 1;
		for(int i = 2; i < n; i++) {
			temp = num1;
			num1 = (num1 + num2) % 1234567;
			num2 = temp;
		}
		return num1;
	}
}
