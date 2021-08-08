package baekjun;

import java.util.LinkedList;
import java.util.Queue;

public class Joseputh {
	public static void main(String[] args) {
		
	}
	public static int[] solution(int n, int m) {
		int[] result = new int[m];
		Queue<Integer> que = new LinkedList<Integer>();
		int l = 1;
		int k = 0;
		int tmp = 0;
		for(int i = 1 ; i<=m ; i++) {
			que.add(i);
		}
		while(que.size() != 0) {
			if(l == n) {
				result[k] = que.poll();
				k++;
				l = 1;
			}else {
				tmp = que.poll();
				que.add(tmp);
				l++;
			}
			
		}
		return result;
	}
}
