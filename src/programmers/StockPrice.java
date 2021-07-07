package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class StockPrice {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		int[] result = solution(prices);
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = {};
        Queue<Integer> que = new LinkedList<Integer>();
        int time = 0;
        int[] tmp = new int[prices.length];
        for(int i =0; i<prices.length; i++) {
        	if(i == prices.length-1) {
        		tmp[i] = 0;
        		break;
        	}
        	for(int j = i+1; j<prices.length;j++) {
        		if(prices[i]<=prices[j]) {
        			time++;//1,2,3,4
        			continue;
        		}
        		else {
        			time++;
        			tmp[i] = time;
        			
        			
        			break;
        			
        		}
        		
        		
        	}
        	tmp[i] = time;
        	time = 0;
        }
        answer = tmp;
        return answer;
       
        
    }
}
