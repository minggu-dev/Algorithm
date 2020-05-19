package programmers.Level2;

public class Carpet {
	/**
	 * 
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
	public static void main(String[] args) {
		Carpet c = new Carpet();
		int [] result = c.solution(8, 1);
		for(int i : result) {
			System.out.println(i);
		}
	}
}
