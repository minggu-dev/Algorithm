package programmers.Level2;

public class Carpet {
	/**
	 * nxm크기의 사각형이 1x1크기의 타일로 구성되어있고 가장자리의 타일 갯수가 brown, 안쪽의 타일 갯수가 yellow라고할때 사각형의 가로, 세로 길이를 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param brown
	 * @param yellow
	 * @return
	 */
	/*public int[] solution(int brown, int yellow) {
		int[] answer = {(2 + brown/2 + (int)Math.sqrt(brown * brown / 4 - 2 * brown + 4 - 4 * yellow)) / 2, (2 + brown/2 - (int)Math.sqrt(brown * brown / 4 - 2 * brown + 4 - 4 * yellow)) / 2};
		return answer;
	}*/
	public int[] solution(int brown, int yellow){
		int [] answer = new int[2];
		
		for(int i = 1; i <= Math.sqrt(brown + yellow); i++) {
			if((brown + yellow) % i == 0) {
				if(2 * (brown + yellow) / i + 2 * i - 4 == brown) {
					answer[0] = (brown + yellow) / i;
					answer[1] = i;
					break;
				}
			}
		}
		
		return answer;
	}
}
