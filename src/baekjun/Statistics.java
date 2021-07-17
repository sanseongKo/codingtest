package baekjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Statistics {
	public static void main(String[] args) {
		int[] n = {1,3,8,-2,2};
		int[] tmp = solutionn(n);
		for(int i:tmp) {
		System.out.println(i);
		}
	}
	public static int[] solutionn(int[] n) {
		int[] answer = new int[4];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//»ê¼ú, ÃÖºó
		for(int i:n) {
			answer[0] += i;	
			if(map.get(i) != null) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		answer[0] /= n.length;
		//Áß¾Ó
		Arrays.sort(n);
		answer[1] = n[n.length/2];
		//ÃÖºó
		List<Entry<Integer, Integer>> listEntry = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(listEntry, (o1, o2)->o1.getValue().compareTo(o2.getValue()));
		answer[2] = listEntry.get(0).getValue();
		//¹üÀ§
		answer[3] = n[n.length-1]-n[0];
		return answer;
	}
}
