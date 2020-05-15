package baekjoon.basic.forTest;

import java.util.Scanner;

public class Solution2739 {
	/**
	 * 구구단 출력
	 * 출처 : https://acmicpc.net/problem/2739
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}
}
