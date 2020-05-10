package baekjoon.basic.print;

import java.util.Scanner;

public class Solution10430 {
	/**
	 * 세 정수를 입력받아 (a + b) % c와 ((a % c) + (b % c)) % c, (a * b) % c, ((a % c) * (b % c)) % c
	 * 의 결과를 출력한다.
	 * 출처 : https://www.acmicpc.net/problem/10430
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}
}
