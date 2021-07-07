package programmers;

import java.util.PriorityQueue;

public class NumberK {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] tmp = solution(array, commands);
		for(int i =0; i<tmp.length; i++) {
		System.out.println(tmp[i]);
		}
	}
	
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int[] tmp = new int[commands.length];
        int i = 0;
        int j = 0;
        int k = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int p = 0 ;p<commands.length;p++) {
        	i = commands[p][0];
        	j = commands[p][1];
        	k = commands[p][2];
        	
        	for(int q = i-1; q<j; q++) {
        		que.add(array[q]);
        		System.out.print("que: "+array[q]+"   ");
        	
        	}
        	for(int r = 0; r<k; r++) {
        		System.out.println(que.peek());
        		
        		if(r==k-1) {
        			tmp[p] = que.poll();
        		}
        		que.poll();
        	}
        	que.clear();
        }
        answer = tmp;
        return answer;
	}
}
