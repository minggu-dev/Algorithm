package baekjoon.basic.forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution15552 {
	/**
	 * bufferd를 이용해 반복문의 출력을 더 빠르게 할 수 있도록 한다.
	 * 출처 : https://acmicpc.net/problem/15552
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b, c = 0;
		String[] line = null;
		for(int i = 0; i < a; i++) {
			line = br.readLine().split(" ");
			b = Integer.parseInt(line[0]);
			c = Integer.parseInt(line[1]);
			bw.write((b + c) + "\n");
		}
		bw.flush();
	}
}
