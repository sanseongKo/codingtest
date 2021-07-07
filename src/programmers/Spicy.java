package programmers;

import java.util.LinkedList;

public class Spicy {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville, K));
	}
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        int mix1 = 0;
        int mix2 = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i : scoville) {
        	list.add(i);
        }
        
        while(true) {
        	mix1 = list.get(0);
        	mix2 = list.get(1);
        	if(list.size() == 1 && list.get(0)<K) {
        		return -1;
        	}
        	list.remove(0);
        	list.remove(1);
        	list.add(0, mix1 + (mix2*2));
        	answer++;
        	if(list.get(0)>=K) {
        		return answer;
        	}else {
        		continue;
        	}

        }
        
      
    }
	
}
