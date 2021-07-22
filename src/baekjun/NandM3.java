package baekjun;

import java.util.ArrayList;
import java.util.List;

public class NandM3 {
	static boolean[] visit;
	static int[] arr;
	static List<int[]> list;
	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		solution(n, m);
	}
	public static void solution(int n, int m) {
		
		list = new ArrayList<int[]>();
		backtracking(n, m, 0);
	}
	public static void backtracking(int n, int m, int depth ) {
		if(depth ==0) {
			arr = new int[m];
		}
		
		if(depth == m) {
			list.add(arr);
			return;
		}
		for(int i =0; i<n;i++) {
			arr[depth] = i+1;
			backtracking(n, m, depth+1);
		}
		return;
	}
}
