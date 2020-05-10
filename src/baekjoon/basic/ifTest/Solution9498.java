package baekjoon.basic.ifTest;

import java.util.Scanner;

public class Solution9498 {
	/**
	 * 시험점수를 입력받아 학점을 부여하기
	 * 출처 : https://acmicpc.net/problem/9498
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = a / 10;
		if(result >= 9) {
			System.out.println("A");
		}else if(result >= 8) {
			System.out.println("B");
		}else if(result >= 7) {
			System.out.println("C");
		}else if(result >= 6) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
