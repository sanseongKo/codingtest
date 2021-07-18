package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPoint {
	public static void main(String[] args) {
		int[][] n = {{3,4},{1,1},{1,-1},{2,2},{3,3}};
		int[][] tmp =solution(n);
		for(int i =0; i<tmp.length; i++) {
			for(int j =0; j<tmp[i].length; j++) {
				System.out.print(i+"¹øÂ° "+ tmp[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] solution(int[][] n){
		int[][] answer = new int[n.length][2];
		List<int[]> list = new ArrayList<int[]>();
		for(int i =0; i<n.length;i++) {
			list.add(n[i]);
		}
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]>o2[0]) {
					return 1;
				}else if(o1[0] == o2[0]) {
					if(o1[1]>o2[1]) {
						return 1;
					}
				}
				return -1;
			}
		});
		for(int i = 0; i<list.size();i++ ) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
