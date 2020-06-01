package programmers.Level2;

public class LandGame {
	/**
	 * 하위열의 값을 선택하지 않고 가장 큰 수를 가져올 수 있도록 한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[][] land) {
		for(int i = 0; i < land.length - 1; i++) {
			for(int j = 0; j < land[i].length; j++) {
				land[i + 1][j] += maxRow(land[i], j);
			}
		}
		
		return maxRow(land[land.length - 1], Integer.MAX_VALUE);
	}
	
	public int maxRow(int[] row, int col) {
		int max = 0;
		for(int i = 0; i < row.length; i++) {
			if(max < row[i] && col != i) {
				max = row[i];
			}
		}
		return max;
	}
}
