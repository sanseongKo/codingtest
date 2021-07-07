package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {
	public static void main(String[] args) {
		int[] truck_weights = {10};
		int bridge_length = 100;
		int weight = 100;
		System.out.println(solution(bridge_length, weight, truck_weights));
		
	}
	
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int i =0;
        int tmp = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        while(i<truck_weights.length) {
        	if(que.peek() == null) {
        		que.add(truck_weights[i]);
        		tmp += truck_weights[i];
        		i++;
        		answer++;
        	}
        	if(que.size() == bridge_length) {
        		tmp -= que.poll();
        		
        	}else if(i>=truck_weights.length) {
        		break;
        	}
        	if(tmp + truck_weights[i]<=weight) {
        		que.add(truck_weights[i]);
        		tmp+=truck_weights[i];
        		answer++;
        		i++;
        	}else {
        		que.add(0);
        		answer++;
        	}
        	
        }
        answer += bridge_length;
        return answer;
    }
	
	
}
//트럭대가 지나갈 수 있고, 트럭 길이 1초에 길이만큼 가고 전부다 도착해야함