package baekjoon.basic.print;

import java.util.Scanner;

public class Solution10869 {
	/**
	 * 입력받는 정수 A, B에 대해 사칙연산한 결과 출력
	 * 출처 : https://www.acmicpc.net/problem/10869
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
