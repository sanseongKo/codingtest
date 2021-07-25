package baekjun;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeap {
	public static void main(String[] args) {
		int[] n = {0,1,2,0,0,3,2,1,0,0,0};
		int[] tmp = solution(n);
		for(int i : tmp) {
			System.out.println(i);
		}
	}
	public static int[] solution(int[] n) {
		List<Integer> list = new ArrayList<Integer>();
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for(int i =0; i<n.length;i++) {
			if(n[i] == 0) {
				if(que.peek() == null) {
					list.add(0);
				}else {
				list.add(que.poll());
				}
			}else {
				que.add(n[i]);
				
			}	
		}
		int[] answer = new int[list.size()];
		for(int i =0; i<list.size();i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}