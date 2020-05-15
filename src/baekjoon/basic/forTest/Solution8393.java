package baekjoon.basic.forTest;

import java.util.Scanner;

public class Solution8393 {
	/**
	 * 입력받은 n에 대해 1 ~ n의 합을 출력
	 * 출처 : https://acmicpc.net/problem/8393
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
