package programmers.Level2;

public class CreateRectangle {
	/**
	 * 가로w 세로h인 사각 영역에 대각선으로 줄 그어진 부분을 제외한 1*1 크기의 사각형의 갯수를 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param w
	 * @param h
	 * @return
	 */
	public long solution(int w, int h) {
		int gcd = 0;
		int first = w;
		int second = h;
		int temp = 0;
		
		while(true) {
			if(first % second == 0) {
				gcd = second;
				break;
			}else {
				temp = second;
				second = first % second;
				first = temp;
			}
		}
		
		long result = (long) w * h;
		int disable = (w / gcd + h / gcd - 1) *h / (h / gcd);
		
		return result - disable;
	}
}
