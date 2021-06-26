package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location =2;
		System.out.println(solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        int index = 0;
        LinkedList<Integer> list = new LinkedList<>();
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i<priorities.length; i++) {
        	list.add(i);
        }
        while(index<priorities.length) {
        	if(que.peek() == null) {
        		que.add(priorities[index]);
        		index++;
        		continue;
        	}
        	
        	if(que.peek()<priorities[index]) {//0->1->2->-3
        		int tmp = que.poll();
        		que.add(tmp);
        		tmp = list.get(0);
        		list.remove(0);
        		list.add(tmp);
        	}else {
        		que.add(index);
        		index++;
        	}
        }
        for(int i = 0; i<list.size(); i++) {
        	if(location == list.get(i)) {
        		
        		return answer = i+1;
        	}
        }
        	
        
        return answer;
    }
}

//인덱스 기억
//큐
//큐사이즈이상일경우
//