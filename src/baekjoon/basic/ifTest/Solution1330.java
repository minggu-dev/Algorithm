package baekjoon.basic.ifTest;

import java.util.Scanner;

public class Solution1330 {
	/**
	 * 입력 받은 두 수의 크기 비교
	 * 출처 : https://acmicpc.net/problem/1330
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}
}
