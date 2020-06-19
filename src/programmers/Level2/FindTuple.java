package programmers.Level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTuple {
	/**
	 * 튜플을 표현하는 s에서 튜플의 원상태를 찾아라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int[] solution(String s) {
		Pattern p = Pattern.compile("\\{([0-9,]+)\\}");
		Matcher match = p.matcher(s);
		int count = 0;
		List<String> strList = new ArrayList<String>();
		List<Integer> list = new ArrayList<Integer>();
		
		while(match.find()) {
			strList.add(match.group(1));
			count++;
		}
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length())
					return 1;
				else if(o1.length() < o2.length())
					return -1;
				else
					return 0;
			}
		};
		strList.sort(c);
		for(String str : strList) {
			String[] strArr = str.split(",");
			for(String strInt : strArr) {
				if(!list.contains(Integer.parseInt(strInt))){
					list.add(Integer.parseInt(strInt));
					break;
				}
			}
		}
		int[] answer = new int[count];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		FindTuple ft = new FindTuple();
		ft.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
	}
}
