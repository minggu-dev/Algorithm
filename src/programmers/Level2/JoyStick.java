package programmers.Level2;

import java.util.LinkedList;

public class JoyStick {
	/**
	 * 조이스틱을 움직여서 알파벳 이름을 완성시키기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param name
	 * @return
	 */
	public int solution(String name) {
		int answer = (name.charAt(0) - 'A') > 12 ? 26 - (name.charAt(0) - 'A') : name.charAt(0) - 'A';
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		
		for(int i = 1; i < name.length(); i++) {
			if(name.charAt(i) != 'A') {
				list.add(i);
				answer += (name.charAt(i) - 'A') > 12 ? 26 - (name.charAt(i) - 'A') : name.charAt(i) - 'A';
			}
		}
		answer += findCursor(list, name.length());
		return answer;
	}
	
	public int findCursor(LinkedList<Integer> list, int len) {
		int min = Integer.MAX_VALUE;
		int size = list.size();
		for(int i = 1; i < size - 1; i++) {
			min = Math.min(min, list.get(size - i - 1) + (len - list.get((size - i) % size)) % len + Math.min(list.get(size - i - 1), (len - list.get((size - i) % size)) % len));
		}
		return min;
	}
	
	public static void main(String[] args) {
		JoyStick js = new JoyStick();
		System.out.println(js.solution("Z"));
	}
}
