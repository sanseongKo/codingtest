package baekjun;

import java.util.Arrays;
import java.util.Collections;

public class SortInside {
	public static void main(String[] args) {
		int n = 2143;
		System.out.println(solution(n));
		
	}
	public static int solution(int n) {
		int answer = 0;
		char[] arr = Integer.toString(n).toCharArray();
		Integer[] inarr = new Integer[arr.length];
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<arr.length; i ++) {
			inarr[i] = (int)arr[i]-'0';
		}
		Arrays.sort(inarr, Collections.reverseOrder());
		for(int i: inarr) {
			sb.append(i);
		}
		answer = Integer.parseInt(sb.toString());
		return answer;
	}
}
