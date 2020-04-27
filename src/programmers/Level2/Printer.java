package programmers.Level2;

import java.util.Collections;
import java.util.LinkedList;

public class Printer {
	/**
	 * 작업들의 우선순위를 보고 우선순위가 높은것부터 일을 처리할 수 있도록 한다.
	 * 출처 : https://programmers.co.kr/learn/challenges
	 * @param priorities
	 * @param location
	 * @return
	 */
	public int solution(int[] priorities, int location) {
		int answer = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		int num = 0;
		int max = 0;
		
		for(int i : priorities) {
			list.add(i);
		}
		
		while(true) {
			max = Collections.max(list);
			num = list.pop();
			if(num  == max) {
				answer++;
				if(location-- == 0) {
					break;
				}
			}else {
				list.add(num);
				if(location-- == 0) {
					location = list.size() - 1;
				}
			}
		}
		
		return answer;
	}
}

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Printer {
    public int solution(int[] priorities, int location) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		int num = 0;
		int max = 0;
		
		for(int i : priorities) {
			list.add(i);
		}
		
		while(true) {
			max = Collections.max(list);
			num = list.remove(0);
			if(num  == max) {
				answer++;
				if(location-- == 0) {
					break;
				}
			}else {
				list.add(num);
				if(location-- == 0) {
					location = list.size() - 1;
				}
			}
		}
		
		return answer;
	}
}
 * */