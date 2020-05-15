package baekjoon.basic.forTest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution2742 {
	/**
	 * 정수n을 입력받아 n~1을 한 줄씩 출력
	 * 출처 : https://acmicpc.net/problem/2742
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = sc.nextInt();
		for(int i = a; i > 0; i--) {
			bw.write(i + "\n");
		}
		bw.flush();
	}
}
