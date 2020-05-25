package baekjoon.basic.forTest;

import java.util.Scanner;

public class Solution10950 {
	/**
	 * 반복할 수 a를 입력받아 반복 횟수만큼 두 정수를 입력받아 그 합을 출력
	 * 출처 : https://acmicpc.net/proble/10950
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b,c = 0;
		for(int i = 0; i < a; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			System.out.println(b + c);
		}
	}
}
