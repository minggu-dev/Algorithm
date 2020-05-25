package baekjoon.basic.forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution11021 {
	/**
	 * 입력받은 두 정수 a, b를 이쁘게 출력
	 * 출처 : https://acmicpc.net/problem/11021
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
		for(int i = 1; i <= a; i++) {
			line = br.readLine().split(" ");
			b = Integer.parseInt(line[0]);
			c = Integer.parseInt(line[1]);
			bw.write("Case #" + i + ": " + (b + c) + "\n");
		}
		bw.flush();
	}
}
