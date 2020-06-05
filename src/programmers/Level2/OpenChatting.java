package programmers.Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChatting {
	/**
	 * 오픈채팅방 접속 기록(rocord)을 보고 메세지를 남기기
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public String[] solution(String[] record) {
		String[] records = null;
		List<String[]> list = new ArrayList<String[]>();
		Map<String, String> map = new HashMap<String, String>();
		
		for(String str : record) {
			records = str.split(" ");
			switch (records[0]) {
				case "Leave" :
					list.add(new String[]{records[1],"님이 나갔습니다."});
					break;
				case "Enter" :
					list.add(new String[]{records[1],"님이 들어왔습니다."});
				case "Change" : 
					map.put(records[1], records[2]);
			}
		}
		String[] answer = new String[list.size()];
		for(int i = 0; i < answer.length; i++) {
			records = list.get(i);
			answer[i] = map.get(records[0]).concat(records[1]);
		}
		return answer;
	}
}
