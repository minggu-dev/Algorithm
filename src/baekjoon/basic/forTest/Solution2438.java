package baekjoon.basic.forTest;

import java.util.Scanner;

public class Solution2438 {
	/**
	 * 별찍기 기초
	 * 출처 : https://acmicpc.net/problem/2438
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1 ; i <= a; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
