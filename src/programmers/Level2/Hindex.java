package programmers.Level2;

import java.util.Arrays;

public class Hindex {
	/**
	 * 배열에서 h-index에 해당하는 h를 구해라
	 * @param citations
	 * @return
	 */
	public int solution(int[] citations) {
		Arrays.sort(citations);
		int hIndex = 0;
		for(int i = citations.length - 1; i >= 0; i--) {
			if(citations.length - i >= citations[i]) {
				if(citations[i] > hIndex) {
					hIndex = citations[i];
				}
				break;
			}else {
				hIndex++;
			}
		}
		return hIndex;
	}
	
	public static void main(String[] args) {
		Hindex h = new Hindex();
		int[] citations = {22,22,22,0};
		System.out.println(h.solution(citations));
	}
}
