package baekjun;

import java.util.ArrayList;
import java.util.List;

public class LongestSequence {
	public static void main(String[] args) {
		int[] n = {10, 20, 10, 30, 20, 50};
		System.out.println(solution(n));
	}
	public static int solution(int[] n) {
		int answer = 0;
		answer = dp(0,n);
		return answer;
	}
	public static int dp(int start, int[] n) {
		List<Integer> list = new ArrayList<Integer>();
		int result = 0;
		int j = 0;
		if(start == n.length-1) return 1;
		for(int i = start; i<n.length;i++) {
			if(list.size() == 0) {
				list.add(n[j]);
			}else if(list.get(j)<n[i]){
				list.add(n[i]);
				j++;
			}
			
		}
		result = list.size();
		return Math.max(result, dp(start+1, n));
	}
}
