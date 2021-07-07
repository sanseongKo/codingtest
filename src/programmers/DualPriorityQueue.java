package programmers;

import java.util.PriorityQueue;

public class DualPriorityQueue {
	public static void main(String[] args) {
		String[] operations = {"I 7","I 5","I -5","D -1"};
		int[] tmp = solution(operations);
		for(int i = 0; i<tmp.length; i++) {
		System.out.println(tmp[i]);
		}
	}
	public static int[] solution(String[] operations) {
       int[] answer = new int[2];
       int i =0;
       int j =0;
       PriorityQueue<Integer> que = new PriorityQueue<Integer>();
       while(true) {
    	   int tmp = Integer.parseInt(operations[i].split(" ")[1]);
    	   que.add(tmp);
    	   i++;
    	   if(operations[i].equals("D -1")) {
    		   que.poll();
    	   }else if(operations[i].equals("D -1")) {
    		   while(j<que.size()) {
    		   que.add(que.poll());
    		   if(j == que.size()-1) {
    			   que.poll();
    			   break;
    		   }
    		   }
    	   }
       }
       
       
       
       
      // return answer;
     }
}
