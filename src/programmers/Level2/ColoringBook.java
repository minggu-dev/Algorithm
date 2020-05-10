package programmers.Level2;

public class ColoringBook {
	/**
	 * 2차원 배열에서 서로 다른 영역의 갯수를 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param m
	 * @param n
	 * @param picture
	 * @return
	 */
	public int[] solution(int m, int n, int[][] picture) {
		boolean[][] pictureCheck = new boolean[m][n];
		int size = 0;
		int[] answer = new int[2];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(picture[i][j] == 0 || pictureCheck[i][j]) {
					continue;
				}else {
					size = checkBlock(i, j, picture, pictureCheck, 0);
					answer[1] = answer[1] > size ? answer[1] : size;
					answer[0]++;
				}
			}
		}
		return answer;
	}
	//영역탐색 알고리즘
	public int checkBlock(int row, int col, int[][] picture, boolean[][]pictureCheck, int areaSize) {
		pictureCheck[row][col] = true;
		if(row > 0 && !pictureCheck[row - 1][col] && picture[row][col] == picture[row - 1][col]) {//상
			areaSize = checkBlock(row - 1, col, picture, pictureCheck, areaSize);
		}
		if(row < picture.length -1 && !pictureCheck[row + 1][col] && picture[row][col] == picture[row + 1][col]) {//하
			areaSize = checkBlock(row + 1, col, picture, pictureCheck, areaSize);
		}
		if(col > 0 && !pictureCheck[row][col - 1] && picture[row][col] == picture[row][col - 1]) {//좌
			areaSize = checkBlock(row, col - 1, picture, pictureCheck, areaSize);
		}
		if(col < picture[0].length - 1 && !pictureCheck[row][col + 1] && picture[row][col] == picture[row][col + 1]){//우
			areaSize = checkBlock(row, col + 1, picture, pictureCheck, areaSize);
		}
		return ++areaSize;
	}
	
	public static void main(String[] args) {
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		ColoringBook cb = new ColoringBook();
		int [] arr = cb.solution(6, 4, picture);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
