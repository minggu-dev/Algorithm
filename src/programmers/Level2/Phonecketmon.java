package programmers.Level2;

import java.util.HashSet;
import java.util.Set;

public class Phonecketmon {
	/**
	 * nums의 절반을 가져갈 수 있을 때 서로 다른 nums를 가져갈 수 있는 최대 값을 구하라
	 * 출처 : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        if(set.size() >= nums.length/2){
            return nums.length/2;
        }else{
            return set.size();
        }
    }
}
