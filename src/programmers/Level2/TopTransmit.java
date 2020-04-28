package programmers.Level2;

public class TopTransmit {
	/**
	 * 일렬로 놓인 탑의 배열 heights에서 왼쪽으로 신호를 보낼 때 수신여부를 반환 
	 * @param heights
	 * @return
	 */
	public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i = heights.length - 1; i > 0; i--) {
        	for(int j = i - 1; j >= 0; j--) {
        		if(heights[j] > heights[i]) {
        			answer[i] = j + 1;
        			break;
        		}
        	}
        }
        return answer;
    }
}
