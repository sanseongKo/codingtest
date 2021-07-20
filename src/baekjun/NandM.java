package baekjun;

import java.util.ArrayList;
import java.util.List;

public class NandM {
	static boolean visit[];
	static List<int[]> list;
	public static void main(String[] args) {
		int n = 3;
		int m = 1;
		int[][] tmp = solution(n, m);
		for(int i =0;i<tmp.length;i++) {
			for(int j =0;j<tmp[i].length;j++) {
				System.out.print(list.get(i)[j]);
			}
			System.out.println();
		}
	}
	public static int[][] solution(int n, int m) {
		int[][] answer = {};
		
		list = new ArrayList<int[]>();
		visit = new boolean[n];
			backtracking(n, m, 0);
		for(int i =0; i<list.size();i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	public static void backtracking(int n, int m, int depth) {
		int[] result = new int[m];
		if(m == depth) {
			list.add(result);
			
			return;
		}
		for(int i =0; i<n;i++) {
			
			if(visit[i] == false) {
				visit[i] = true;//t,f,f
				result[depth] = i+1;//1
				backtracking(n, m, depth+1);
				visit[i] = false;
				
			}
		}
		
		return;
	}
}
