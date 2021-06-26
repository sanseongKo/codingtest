package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelop {
	public static void main(String[] args) {
		int[] progresses = {95, 90, 98, 90, 80, 9};
		int[] speeds = {5, 7, 1, 1, 10, 1};
		int[] tmp = solution(progresses, speeds);
		for(int i = 0; i<tmp.length; i++) {
			System.out.println(tmp[i]);
		}
	}
	public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<Integer> que = new LinkedList<>();
        int count = 1;
    	int tmp = 0;
        for(int i = 0; i<progresses.length; i++) {
        	int day = 0;
        	if((100 - progresses[i])%speeds[i] !=0) {
        	day	= (100 - progresses[i])/speeds[i]+1;
        	que.add(day);
        	}else {
        		day = (100 - progresses[i])/speeds[i];
        		que.add(day);
        	}
        	System.out.println("day: "+ day);
        	
        	
        }
        tmp = que.poll();
        while(que.peek() != null) {
        	if(tmp>que.peek()) {
        		count++;
        		que.poll();
        	}else {
        		arr.add(count);
        		count = 1;
        		tmp = que.poll();
        	}
        	if(que.peek() == null) {
        		arr.add(count);
        	}
        }
        int[] answer = new int[arr.size()];
        for(int i =0; i<answer.length; i++) {
        	answer[i] = arr.get(i);
        	System.out.println(arr.get(i));
        }
        

        return answer;
    }
}
