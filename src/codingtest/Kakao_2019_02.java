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
        }//������ ���� 
        List<Entry<Integer, Double>> list_entry = new ArrayList<Map.Entry<Integer,Double>>(map.entrySet());
        Collections.sort(list_entry, new Comparator<Entry<Integer, Double>>() {
        	@Override
        	public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
        		// ���� �������� ����
				return o2.getValue().compareTo(o1.getValue());
        	}
		});
        int[] answer = new int[map.size()];
     // ��� ���
     		for(Entry<Integer, Double> entry : list_entry) {
     			
     			answer[k] = entry.getKey();
     			k++;
     		}
        
        
        
        return answer;
        
    }
}

//�������� ������ ���� �����Ѵ�. ���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� �� 
//stages�� ���� �������� �������ִ� ���������� �ǹ�(����x)
//������ ����� ���� ���������� 0
//���� ������ ���������� 1