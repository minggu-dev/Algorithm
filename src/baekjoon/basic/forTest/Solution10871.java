package baekjoon.basic.forTest;

import java.io.IOException;
import java.util.Scanner;

public class Solution10871 {
	/**
	 * a만큼의 배열값 중 b보다 작은 값들을 출력
	 * 출처 : https://acmicpc.net/problem/10871
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		for(int i = 0 ; i < a; i++) {
			c = sc.nextInt();
			if(b > c) {
				builder.append(c);
				builder.append(' ');
			}
		}
		System.out.println(builder.toString().trim());
	}
}
