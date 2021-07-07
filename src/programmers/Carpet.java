package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class Carpet {
	public static void main(String[] args) {
		int brown = 18;
		int yellow = 6;
		int[] tmp = solution(brown, yellow);
		for(int i =0; i<tmp.length; i++) {
			System.out.println(tmp[i]);
		}
	}
	public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown+yellow;//24
        int width = 0;
        int length = 0;
        PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i =3; i<total; i++) {
        	if(total/i<i) {
        		break;
        	}
        	if(total%i == 0) que.add(i);//3, 4
        	
        }
        answer = new int[2];
        int quelen = que.size();
        
        for(int i = 0; i<quelen; i++) {
        	
        	width = total/que.peek();
        	length = que.peek();
        	
        	if((width-2)*(length-2) == yellow) {
        		answer[0] = width;
        		answer[1] = length;
        		
        	}
        	que.poll();
        
        }
       
        
        return answer;
    }
	
	
}

//세로는 3이상
//48 - > 3 16 4 12 6 8