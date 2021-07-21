package baekjun;

import java.util.ArrayList;
import java.util.List;

public class NandM2 {
	static boolean[] visit;
	static List<int[]> list;
	static int[] arr;
	public static void main(String[] args) {
		int n = 4;
		int m = 2;
		int[][] tmp = solution(n, m);
		for(int i =0; i<tmp.length;i++) {
			for(int j = 0; j<tmp[i].length;j++) {
				
			}
			
		}
	}
	public static int[][] solution(int n, int m) {
		
		
		visit = new boolean[n];
		list = new ArrayList<int[]>();
		arr = new int[m];
		backtracking(1, n, m, 0);
		int[][] answer = new int[list.size()][m];
		for(int i = 0 ; i<list.size();i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	public static void backtracking(int start, int n, int m ,int depth) {
		
		if(m == depth) {
			list.add(arr);
			for(int i = 0; i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			return;
		}
		for(int i = start ; i<=n;i++) {
			if(visit[i-1] == false) {
				visit[i-1] = true;
				arr[depth] = i;
				backtracking(start+1,n,m,depth+1);
				visit[i-1] = false;
			}
		}
		return;
	}
}
//4,2 12 13 14 22 23 24 33 34   
