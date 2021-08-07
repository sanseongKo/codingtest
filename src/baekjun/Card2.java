package baekjun;

import java.util.LinkedList;
import java.util.Queue;

public class Card2 {
	public static void main(String[] args) {
		int n = 6;
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		int answer = 0;
		int k = 1;
		int tmp = 0;
		Queue<Integer> que = new  LinkedList<Integer>();
		for(int i = 1; i<=n; i++) {
			que.add(i);
		}
		while(que.size() != 1) {
			if(k % 2 == 1) {
				System.out.println(que.peek());
				que.poll();
			}else {
				System.out.println(que.peek());
				tmp = que.poll();
				que.add(tmp);
				
			}
			k++;
		}
		answer = que.poll();
		return answer;
	}
}
