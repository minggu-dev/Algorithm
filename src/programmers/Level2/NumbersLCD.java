package programmers.Level2;

public class NumbersLCD {
	/**
	 * n개의 수에대해 최소공배수를 구하여라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[] arr) {
		int answer = arr[0];
		for(int i = 1; i < arr.length; i++) {
			answer = findLCD(answer, arr[i]);
		}
		return answer;
	}
	public int findGCD(int num1, int num2) {
		return num1 % num2 == 0 ? num2 : findGCD(num2, num1 % num2);
	}
	public int findLCD(int num1, int num2) {
		return num1 * num2 / findGCD(num1, num2);
	}
}
