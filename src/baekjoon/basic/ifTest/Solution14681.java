package baekjoon.basic.ifTest;

import java.util.Scanner;

public class Solution14681 {
	/**
	 * 좌표를 받아 어느 사분면에 위치해 있는지 판단
	 * 출처 : https://acmicpc.net/problem/14681
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		if(x > 0 && y > 0) {
			System.out.println(1);
		}else if (x < 0 && y > 0) {
			System.out.println(2);
		}else if (x < 0 && y < 0) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}
}
