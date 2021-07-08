package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Kakao_2019_02 {
	public static void main(String[] args) {
		int	N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] tmp = solution(N, stages);
		for(int i:tmp) {
			System.out.println(i);
		}
	}
	public static int[] solution(int N, int[] stages) {
       
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        int players = stages.length;
        int failplayer = 0;
        int k =0;
        for(int i =1; i<=N;i++) {
        	if(players == 0) {
        		map.put(i, 0.0);
        		continue;
        	}
        	for(int j =0; j<stages.length;j++) {
        		if(i==stages[j]) {
        			failplayer++;
        			
        		}
        	}
        	
        	map.put(i, (double)failplayer/players);
        	
        	players -= failplayer;
        	failplayer = 0;
        }//실패율 담음 
        List<Entry<Integer, Double>> list_entry = new ArrayList<Map.Entry<Integer,Double>>(map.entrySet());
        Collections.sort(list_entry, new Comparator<Entry<Integer, Double>>() {
        	@Override
        	public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
        		// 내림 차순으로 정렬
				return o2.getValue().compareTo(o1.getValue());
        	}
		});
        int[] answer = new int[map.size()];
     // 결과 출력
     		for(Entry<Integer, Double> entry : list_entry) {
     			
     			answer[k] = entry.getKey();
     			k++;
     		}
        
        
        
        return answer;
        
    }
}

//실패율은 다음과 같이 정의한다. 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수 
//stages는 현재 유저들이 도달해있는 스테이지를 의미(성공x)
//성공한 사람이 없는 스테이지는 0
//전부 성공한 스테이지는 1