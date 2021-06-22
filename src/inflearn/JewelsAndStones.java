package inflearn;

import java.util.HashSet;

public class JewelsAndStones {
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		System.out.println(solution(jewels, stones));
		
	}
	
	public static int solution(String a, String b) {
		int answer = 0;
		char[] stoneArr = b.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		char[] jewelArr = a.toCharArray();
		int count = 0;
		
		for(int i = 0; i<b.length(); i++) {
			set.add(stoneArr[i]);
		}
		
		for(int i = 0; i< a.length(); i++) {
			if(set.contains(jewelArr[i])) {
				count++;
			}
		}
		answer = count;
		return answer;
	}
}
